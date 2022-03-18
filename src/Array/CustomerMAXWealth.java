package Array;

public class CustomerMAXWealth {
    public int maximumWealth(int[][] accounts) {
        int mRows = accounts.length;
        int nColumn = accounts[0].length;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < mRows; i++){
            int sum = 0;
            for(int j = 0; j < nColumn; j++) {
                sum += accounts[i][j];
            }

            max = Math.max(sum, max);
        }
        return max;
    }
}
