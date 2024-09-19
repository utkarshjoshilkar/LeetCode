class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int k = 0;
        int result = 0;
       
        while (k < n - 1) {
            char l = s.charAt(k);
            char m = s.charAt(k + 1);
            result += Math.abs(l - m);
            k++;
        }
        return result;
    }
}