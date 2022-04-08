package Matrix;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    public void setZeroes(int[][] matrix){
        int Rows = matrix.length;
        int Columns = matrix[0].length;
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> columns = new HashSet<Integer>();

        for(int i = 0; i < Rows; i++){
            for(int j = 0; j < Columns; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int i = 0; i < Rows; i++){
            for(int j = 0; j < Columns; j++){
                if(rows.contains(i) || columns.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
