

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) {
            return s; // Single character or empty string is a palindrome
        }
        
        String longest = ""; // To store the longest palindrome found
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) { // Ensure we consider all substrings
                String str = s.substring(i, j);
                if (isPalin(str) && str.length() > longest.length()) {
                    longest = str;
                }
            }
        }
        return longest;
    }

    public static boolean isPalin(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
