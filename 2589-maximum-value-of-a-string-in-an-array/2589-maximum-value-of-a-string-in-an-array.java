class Solution {
    public int maximumValue(String[] strs) {
        int maxValue = Integer.MIN_VALUE;
        for (String str : strs) {
            int value = getValue(str);
            maxValue = Math.max(maxValue, value);
        }
        return maxValue;
    }

    private int getValue(String str) {
        int value = 0;
        int placeValue = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return str.length();
            }
            int digit = c - '0';
            value += digit * placeValue;
            placeValue *= 10;
        }
        return value;
    }
}