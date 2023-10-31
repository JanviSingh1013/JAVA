class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length; // Assuming it's a square matrix

        for (int i = 0; i < n; i++) {
            sum += mat[i][i]; // Main diagonal
            sum += mat[i][n - 1 - i]; // Secondary diagonal
        }

        // If the matrix has an odd dimension, one element will be counted twice
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
