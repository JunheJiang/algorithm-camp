package org.example.leetcode;

import org.example.leetcode.double_pointer.LeetCode1_TwoSum;
import org.example.leetcode.double_pointer.LeetCode2_SunOfTowSquare;
import org.example.leetcode.double_pointer.Leetcode3_ReverseVowelsOfStr;
import org.example.leetcode.double_pointer.Leetcode4_ValidPalindrome;
import org.junit.Test;

public class LeetCodeTest {
    @Test
    public void leetCode1_TwoSum() {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = LeetCode1_TwoSum.twoSum(numbers, target);
        int toCheck = 0;
        for (int index : result) {
            System.out.println(index);
            toCheck = toCheck + numbers[index];
        }
        boolean out = target == toCheck;
        System.out.println("leetCode1_TwoSum could be passed:" + out);
    }

    @Test
    public void leetCode2_SunOfTowSquare() {
        System.out.println("leetCode2_SunOfTowSquare could be passed:" + LeetCode2_SunOfTowSquare.judgeSquareSum(5));
    }

    @Test
    public void leetcode3_ReverseVowelsOfStr() {
        String back = "leotcede";
        String out = Leetcode3_ReverseVowelsOfStr.reverseVowels("leetcode");
        System.out.println("leetcode3_ReverseVowelsOfStr out str should be :" + back + " and the out is " + out);
    }

    @Test
    public void leetcode4_ValidPalindrome() {
        System.out.println("leetcode4_ValidPalindrome--- abcbfa could be a Palindrome when f is deleted 、and the out is " + Leetcode4_ValidPalindrome.validPalindrome("abcbfa"));
    }

}
