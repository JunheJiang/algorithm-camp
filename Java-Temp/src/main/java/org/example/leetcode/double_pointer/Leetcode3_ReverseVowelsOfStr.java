package org.example.leetcode.double_pointer;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 反转字符串中的缘因字符
 * <p>
 * 使用双指针，一个指针从头向尾遍历，一个指针从尾到头遍历，当两个指针都遍历到元音字符时，交换这两个元音字符
 */
public class Leetcode3_ReverseVowelsOfStr {

    //
//    时间复杂度为 O(N)：只需要遍历所有元素一次
//    空间复杂度 O(1)：只需要使用两个额外变量
    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public static String reverseVowels(String s) {
        if (s == null) return null;
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) {
                result[i++] = ci;
            } else if (!vowels.contains(cj)) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);
    }

}
