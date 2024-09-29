class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;
        int mid = -1;
        while(low<=high){
            mid = low+(high-low)/2;

            if(nums[low]<=nums[high]){
                if(nums[mid]<min)
                    min = nums[low];
            }
            if( nums[low] <= nums[mid] ){
                if(nums[mid]<min)
                    min = nums[low];
                low = mid+1;
            }
            else {
                if(nums[mid]<min)
                    min = nums[mid];
                high = mid-1;
            }
        }
        return min;
    }
}