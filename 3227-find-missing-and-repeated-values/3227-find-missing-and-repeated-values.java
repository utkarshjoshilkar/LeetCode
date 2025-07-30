class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int index = 0;
        int a = 0;
        int b = 0;
        int row = grid.length;
        int col = grid[0].length;
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (s.contains(grid[i][j])) {
                    a = grid[i][j];
                }
                s.add(grid[i][j]);
            }
        }
        for (int i = 1; i <= col * row; i++) {
            if (!s.contains(i)) {
                b = i;
                break;
            }
        }
        return new int[] { a, b };

    }
}