class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev = 0;
        for(String str: words){
            try{
                int n = Integer.parseInt(str);
                if(n<=prev){
                    return false;
                }
                prev= n;
            }
            catch(Exception e){

            }
        }
        return true;
    }
}