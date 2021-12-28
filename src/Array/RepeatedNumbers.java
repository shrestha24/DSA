package Array;

public class RepeatedNumbers {
    public int repeatedNumber(final int[] A) {
        int n = A.length;
        for (int i = 0; i <= n; i++) {
            int j = Math.abs(A[i]);
            if (A[j] >=0)
                A[j] = -A[j];
            else
                System.out.println(j + " ");

        }
             return A[];
    }
}
