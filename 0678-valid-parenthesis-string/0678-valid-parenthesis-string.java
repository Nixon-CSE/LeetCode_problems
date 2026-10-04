class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int openCount = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '*') {
                openCount++;
            } else { // c == ')'
                openCount--;
            } if (openCount < 0) {
                return false;
            }
        }
        int closeCount = 0;
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')' || c == '*') {
                closeCount++;
            } else { // c == '('
                closeCount--;
            }
            if (closeCount < 0) {
                return false;
            }
        }
        return true;
        
        
    }
}