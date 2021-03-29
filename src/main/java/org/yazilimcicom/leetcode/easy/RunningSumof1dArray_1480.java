package org.yazilimcicom.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 *
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * Time complexity - O(n)
 * Space complexity - O(1)
 *
 * */
class RunningSumof1dArray_1480 {
    
    private int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
    
    //tests
    @Test
    void test0() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, runningSum(input));
    }
    
    @Test
    void test1() {
        int[] input = {1, 1, 1, 1, 1};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, runningSum(input));
    }
    
    @Test
    void test2() {
        int[] input = {3,1,2,10,1};
        int[] expected = {3,4,6,16,17};
        assertArrayEquals(expected, runningSum(input));
    }
    
    
}