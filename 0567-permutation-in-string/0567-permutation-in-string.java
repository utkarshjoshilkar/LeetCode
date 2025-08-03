class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return false;

        int[] freq = new int[26];
        int[] windFreq = new int[26];

        // Step 1: Build frequency for s1 and first window of s2
        for (int i = 0; i < len1; i++) {
            freq[s1.charAt(i) - 'a']++;
            windFreq[s2.charAt(i) - 'a']++;
        }

        // Step 2: Slide the window
        for (int i = len1; i < len2; i++) {
            if (isFreqSame(freq, windFreq)) return true;

            // Slide the window: remove left, add right
            windFreq[s2.charAt(i) - 'a']++; // char coming in
            windFreq[s2.charAt(i - len1) - 'a']--; // char going out
        }

        // Check last window
        return isFreqSame(freq, windFreq);
    }

    private boolean isFreqSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
