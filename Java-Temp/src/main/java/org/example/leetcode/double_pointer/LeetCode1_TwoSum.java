package org.example.leetcode.double_pointer;

/**
 * 线性链表数据
 */
public class LeetCode1_TwoSum {

    /**
     * 在有序数组中找出两个数，使它们的和为 target
     *
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null) return null;
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                //头到尾
                i++;
            } else {
                //尾到头
                j--;
            }
        }
        return null;
    }

    //数组中的元素最多遍历一次，时间复杂度为 O(N)。只使用了两个额外变量，空间复杂度为 O(1)
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        for (int index : result) {
            System.out.println(index);
        }
    }
}
