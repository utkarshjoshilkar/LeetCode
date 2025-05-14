class Solution {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        int minlength = 0;
        HashMap<Integer,Integer> count = new HashMap();
        HashMap<Integer,Integer> firstSeen = new HashMap();
        for(int i=0;i<nums.length;i++){
            firstSeen.putIfAbsent(nums[i],i);
            count.put(nums[i],count.getOrDefault(nums[i], 0)+1);
            if(count.get(nums[i])>degree){
                degree = count.get(nums[i]);
                minlength = i - firstSeen.get(nums[i])+1;
            }
            else if(count.get(nums[i])==degree){
                minlength = Math.min(minlength,i-firstSeen.get(nums[i])+1);
            }
        }
        return minlength;
    }
}


