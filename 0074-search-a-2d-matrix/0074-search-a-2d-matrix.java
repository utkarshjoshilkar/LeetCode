class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;
        int row = 0, col = 0;
        while (low <= high) {
            int median = low + (high - low) / 2;
            row = median / n;   // medians's row 
            col = median % n;   // medians's col 
            if (target == matrix[row][col]) {
                return true;
            } else if (target > matrix[row][col]) {
                low = median+1;
            } else {
                high = median - 1;
            }
        }
        return false;
    }
}