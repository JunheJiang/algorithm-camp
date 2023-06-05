package org.example.leetcode.double_pointer;

/**
 * 双指针
 * 删除一个字符串、回文字符串
 * 再判断删除完之后的字符串是否是回文字符串
 */
public class Leetcode4_ValidPalindrome {

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
