package Matrix;

public class searchMatrixTwo {
    public boolean searchMatrixTwo(int[][] matrix, int target) {

        if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }

        int i = 0;
        int j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] > target){
                j--;
            }

            else {
                i++;
            }
        }
        return false;
    }
}
