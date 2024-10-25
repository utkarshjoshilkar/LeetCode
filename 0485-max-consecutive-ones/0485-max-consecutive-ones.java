class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cmax = 0,count=0;
        for (int i=0 ;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(count>cmax){
                cmax = count;
            }
            else if(nums[i]==0){
                count = 0 ;
            }
        }
        return cmax;
    }
}