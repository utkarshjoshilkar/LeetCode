class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int n = letters.length;
        int left = 0;
        int right = n-1;

        if(target >= letters[right])   
         return letters[left];

        while(left <= right) {
            int mid = (left + right)/2;

            if(letters[mid] > target) right = mid-1;
            else left = mid+1;
        }

        return letters[left];
   }
}