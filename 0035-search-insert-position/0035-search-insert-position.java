class Solution {
    public int searchInsert(int[] nums, int target) {
        int  n=nums.length;
        int i=0;
        while(n>0){
            if(nums[i]<target){
                i++;
            }
            n--;
        }
        return i;
    }
}