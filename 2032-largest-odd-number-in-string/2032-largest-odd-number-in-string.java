class Solution {
    public String largestOddNumber(String num) {
        int i = num.length();
        String mOdd = "";
        while (i >= 0) {
            if (i!=0  && num.charAt(i-1) % 2 != 0) {  // check last digit of substring is odd or not
                return num.substring(0, i);
            }
            if(i==0){                           // have only 1 no in string 
                if(num.charAt(i) % 2 != 0){
                    return num.substring(0, 1);
                }
            }
            i--;
        }
        return "";
    }
}



