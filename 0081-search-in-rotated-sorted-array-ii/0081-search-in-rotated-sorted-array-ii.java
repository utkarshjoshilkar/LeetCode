class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = -1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]==nums[low]&&nums[mid]==nums[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }
            if (nums[mid] <= nums[high]) {
                if (nums[mid] < target && nums[high] >= target) {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            if (nums[mid] >= nums[low]) {
                if (nums[mid] > target && nums[low] <= target) {
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }

        }
        return false;
    }
}