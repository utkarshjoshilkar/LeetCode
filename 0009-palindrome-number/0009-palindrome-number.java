class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String rev = "";
        for(int i = str.length() - 1; i >= 0 ; i-- ){
            rev = rev + str.charAt(i);
        }
        if(rev.equals(str))
            return true;
        return false;
    }
}