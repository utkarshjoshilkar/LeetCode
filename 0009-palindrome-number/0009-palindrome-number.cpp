class Solution {
public:
    bool isPalindrome(int x) {
        long y = 0, z = 0;
        long org = x;
        if (org < 0 || org != 0 && org % 10 == 0) {
            return false;
        }
        while (x != 0) {
            y = x % 10;
            z = z * 10 + y;
            x = x / 10;
        }
        return z == org;
    }
};

// use long insted of int 
