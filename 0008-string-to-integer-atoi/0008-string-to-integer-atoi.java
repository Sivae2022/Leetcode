class Solution {
    public int myAtoi(String s) {
        String S = s.trim();
        if (S.length() == 0) {
            return 0;
        }
        
        int i = 0;
        int sign = 1;
        
        if (S.charAt(i) == '-' || S.charAt(i) == '+') {
            sign = (S.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        int n = S.length();
        long num = 0;  
        
        while (i < n && Character.isDigit(S.charAt(i))) {
            num = num * 10 + (S.charAt(i) - '0'); // Convert char to int
            i++;
            
            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        
        return (int) num * sign;
    }
}
