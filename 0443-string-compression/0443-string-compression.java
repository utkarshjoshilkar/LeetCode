class Solution {
    public int compress(char[] chars) {
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            chars[index++] = ch;

            if(count>1){
                String str = String.valueOf(count);
                for(char dig : str.toCharArray()){ chars[index++] = dig;}
                   
            }

            i--; // FIXED: adjust because for-loop will increment i again

        }return index;
}}
