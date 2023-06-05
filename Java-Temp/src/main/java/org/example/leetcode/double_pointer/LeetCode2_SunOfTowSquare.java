package org.example.leetcode.double_pointer;

public class LeetCode2_SunOfTowSquare {


    public static boolean judgeSquareSum(int target) {
        if (target < 0) return false;
        //平方根
        int i = 0, j = (int) Math.sqrt(target);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == target) {
                return true;
            } else if (powSum > target) {
                //右指针
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
//    因为最多只需要遍历一次 0~sqrt(target)，所以时间复杂度为 O(sqrt(target))
//    又因为只使用了两个额外的变量，因此空间复杂度为 O(1)

}
