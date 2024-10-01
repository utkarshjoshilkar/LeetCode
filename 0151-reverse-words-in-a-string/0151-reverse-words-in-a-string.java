class Solution {
    public String reverseWords(String s) {
        int i = s.length() - 1;
        String res = "";

        while (i >= 0){   
        
            while (i >= 0 && s.charAt(i) == ' ')   // skip spaces 
                i--;

            // if(i<=0)
            //     break;

            int j = i;                              // put pointer to last of string 
            while (i >= 0 && s.charAt(i) != ' ')    // find start of word  
                i--;
            if(res.isEmpty())
                res = res.concat(s.substring(i + 1, j + 1));
            else
                res = res.concat(" "+ s.substring(i + 1, j + 1));
        }
        return res.trim();  // remove extra spaces both side 
    }
}