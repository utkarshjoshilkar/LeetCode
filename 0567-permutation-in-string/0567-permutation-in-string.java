class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            //int index = s1.get(i)-'a';
            freq[s1.charAt(i) - 'a']++;
        }
        int windsize = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            int[] windFreq = new int[26];
            if (i + windsize > s2.length())
                break;
            for (int j = i; j < i + windsize; j++) {
                windFreq[s2.charAt(j) - 'a']++;
            }
            if (isFreqSame(freq, windFreq)) {
                return true;
            }
        }
        return false;
    }

    private boolean isFreqSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}