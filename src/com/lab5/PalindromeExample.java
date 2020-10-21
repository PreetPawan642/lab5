package com.lab5;

/***
 *
 * @author Arora
 *
 */
public class PalindromeExample {
    PalindromeExample() {}

    public static boolean isPalindrome(String s) {
        // Check base cases
        if (s == null || s.trim().length() <= 1) {
            return true;
        }

        // Ignore case and white spaces
        s = s.toLowerCase().trim();

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return PalindromeExample.isPalindrome(s.substring(1, s.length() - 1));
        }

        return false;
    }
}

