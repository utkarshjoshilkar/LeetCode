class Solution {
    public boolean isHappy(int n) {
        Set<Integer>seen = new HashSet<>();   //because the no should contain the sum that we have previously calculated then it will create loop 
        
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            int sum = 0;
            
            while(n>0){
                int m = n %  10;
                sum = sum + m * m ;
                n /= 10;
            }

            n = sum;
        }

        return n==1;
    }
}

