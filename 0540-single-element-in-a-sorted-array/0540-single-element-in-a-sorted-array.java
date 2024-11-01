class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if (n == 1)
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(nums[0]!=nums[1]) return nums[0];
            if(nums[n-1]!=nums[n-2]) return nums[n-1];
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
            // left half
            if (mid % 2 == 1 && nums[mid - 1] == nums[mid] || mid % 2 == 0 && nums[mid + 1] == nums[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

// brute force approach
// int res = 0;
// int n = nums.length;
// for(int i=0;i<nums.length;i++){
// if(i==0){
// if(nums[i]!=nums[i+1])
// return nums[i];
// }
// else if(i==n-1){
// if(nums[i]!=nums[n-1]){
// return nums[n-1];
// }
// }
// else{
// if(nums[i]!=nums[i-1]&&nums[i]!=nums[i+1]){
// return nums[i];
// }
// }
// }
// return res;
// }
