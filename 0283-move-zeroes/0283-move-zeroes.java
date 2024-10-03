class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0 ;
        int count = 0;
        
        for(int i=0;i<nums.length;i++){
            if( nums[i] != 0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i = j ; i<nums.length;i++){
            nums[i]=0;
        }
    }
}

// class Solution {
// public void moveZeroes(int[] nums) {
// int j = 0, i = j + 1;
// while (i < nums.length) {
// if (nums[i] != 0) {
// swap(nums,i, j);
// i++;
// j++;
// }
// else if (nums[i] == 0){
// i++;
// }
// }
// }

// public static void swap(int []nums,int a, int b) {
// int temp = nums[a];
// nums[a] = nums[b];
// nums[b] = temp;
// }
// }