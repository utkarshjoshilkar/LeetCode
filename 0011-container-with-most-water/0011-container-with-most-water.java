class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int solArea = 0;
        while(i<j){
            int min = (height[i] < height[j]) ? height[i] : height[j];
            int current = findarea(min, j-i);
            if (current > solArea) {
                solArea = current;
            }
            if(height[i] > height[j])
                j--;
            else
                i++;
        }
        return solArea;
    }
    public int findarea(int a, int b) {
        return a * b;
    }
}



















    // {
    //     int solArea = 0;
    //     for (int i = 0; i < height.length; i++) {
    //         for (int j = i + 1; j < height.length; j++) {
    //             int min = (height[i] < height[j]) ? height[i] : height[j];
    //             int current = findarea(min, j-i);
    //             if (current > solArea) {
    //                 solArea = current;
    //             }
    //         }
    //     }
    //     return solArea;
    // }
    // public int findarea(int a, int b) {
    //     return a * b;
    // }