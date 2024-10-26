class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            int value = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],value+1);
        }
        for(Map.Entry<Integer,Integer>it: mpp.entrySet()){
            if(it.getValue()==1){
                return it.getKey();
            }
        }
        return -1;
    }
}



//
// class Solution {
//     public int singleNumber(int[] nums) {
//         int n = nums.length;
//         int maxi = nums[0];
//         for(int i = 0 ; i < n ; i++ ){
//             maxi = Math.max(maxi,nums[i]);
//         }
//         int [] hash = new int[maxi+1];
//         for(int i =0;i<n;i++){
//             hash[nums[i]]++;
//         }
//         for(int i=0;i<n;i++){
//            if(hash[nums[i]]==1){
//                 return nums[i];
//            }
//         }
//         return -1;
//     }
// }

