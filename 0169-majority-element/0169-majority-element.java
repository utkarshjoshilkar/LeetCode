class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];

    }
}

// HashMap<int , int> set = new HashMap<int, int>();

//         for(int i = 0 ;i < nums.length;i++){
//             set.put(nums[i]) 
//         }




        // int n= nums.length;
        // for (int i = 0; i < n; i++) {
        //     int count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if(i==j){
        //             continue;
        //         }
        //         if(nums[i]==nums[j]){
        //             count++;
        //         }

        //     }
        //     if(count > n/2){
        //         return nums[i];
        //     }
        // }
        
        // return -1;