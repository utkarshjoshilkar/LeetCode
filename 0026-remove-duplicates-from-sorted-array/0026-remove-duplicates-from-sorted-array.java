class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j;
        for (j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            } /*else if (nums[i] == nums[j]) {
                i++;
            }*/
        }
        return i + 1;
    }
}