class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && target <= matrix[i][col - 1]) {
                int low = 0;
                int high = col - 1;

                while (high >= low) {
                    int median = low + (high - low) / 2;
                    if (matrix[i][median] == target) {
                        return true;
                    } else if (matrix[i][median] < target) {
                        low = median + 1;
                    } else {
                        high = median - 1;
                    }

                }

            }
        }
        return false;

    }
}

// int median = 0;
//         int low = matrix[0][0];
//         int high = matrix[matrix.length - 1][matrix[0].length - 1];

//         while(high>=low){
//             median = low + high/2;
//             if(target > median){
//                 low = median+1;
//             }
//         }
//         return 