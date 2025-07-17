class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()  != t.length() ) {
            return false;
        }
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if(count[i]!=0){
                return false;
            }
        }
        return true;

    }
}

//fails when the strings have repeted letters 

// int count=0;
// for(int i = 0;i<s.length();i++){
//     for(int j = 0;j<s.length();j++){
//         if(s.charAt(i)==t.charAt(j)){
//             count++;
//         }
//     }
// }
// if(count==s.length())
//     return true;
// return false;