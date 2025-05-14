class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                max = Math.max(product, max);
            }
        }
        return max;
    }
}





        // int max = Integer.MIN_VALUE;
        // int pdt = 1 ;
        // for (int i = 0; i < nums.length; i++) {
        //     pdt *= nums[i];
        //     if(pdt>max){
        //         max=pdt;
        //     }
        //     if(pdt < 0){
        //         pdt=1;
        //     }
        // }
        // return max;



