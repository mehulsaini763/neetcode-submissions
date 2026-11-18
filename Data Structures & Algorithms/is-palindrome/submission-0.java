class Solution {
     public boolean isPalindrome(String s) {
        char[] carr = s.toCharArray();
        int x = 0;
        int y = s.length() - 1;
        while (x <= y) {
            if (!isValidChar(s.charAt(x))) {
                x++;
                continue;
            }

            if (!isValidChar(s.charAt(y))) {
                y--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(x)) != Character.toLowerCase(s.charAt(y))) {
                return false;
            }
            x++;
            y--;
        }
        return true;
    }

    public boolean isValidChar(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
