package com.chuhui.blazers.algorithm.leetcode.sort;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by Administrator on 2019/5/10 0010.
 */
public class Solution {


    /**
     * 349 两个数组的交集
     * 失败了??????
     * 2019年10月8日23:13:24
     * 还是没有整明白题意?????
     * @param nums1 数组1
     * @param nums2 数组2
     * @return 数组1和数组2相同的元素
     */
    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> sets = new HashSet<>();

        for (int num1 : nums1) {
            sets.add(num1);
        }

        Set<Integer> noDuplicateSet = new HashSet<>();

        for (int num2 : nums2) {
            if (sets.contains(num2)) {
                noDuplicateSet.add(num2);
            }
        }

        Integer[] results = new Integer[noDuplicateSet.size()];
        noDuplicateSet.toArray(results);

        int[] res = new int[results.length];


        for (int i = 0; i < results.length; i++) {
            res[i] = results[i];
        }


        return res;

    }

}
