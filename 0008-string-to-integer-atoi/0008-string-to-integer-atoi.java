class Solution {
    public int myAtoi(String s) {
        if (s == null) return 0;
        
        // Trim leading spaces
        String s1 = s.trim();
        if (s1.length() == 0) return 0;

        int sign = 1;
        int ans = 0;
        int MIN = Integer.MIN_VALUE;
        int MAX = Integer.MAX_VALUE;

        int i = 0;
        // Check if the first character is '+' or '-'
        if (s1.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s1.charAt(0) == '+') {
            i++;
        }

        while (i < s1.length()) {
            char c = s1.charAt(i);
            if (!Character.isDigit(c)) break; // Stop at non-digit character
            
            int digit = c - '0';
            
            // Check for integer overflow before adding the digit
            if (ans > (MAX - digit) / 10) {
                return (sign == 1) ? MAX : MIN;
            }

            ans = ans * 10 + digit;
            i++;
        }
        
        return ans * sign;
    }
}
