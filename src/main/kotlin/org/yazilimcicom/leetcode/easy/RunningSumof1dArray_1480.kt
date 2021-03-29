package org.yazilimcicom.leetcode.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

/**
 *
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * Time complexity - O(n)
 * Space complexity - O(1)
 *
 * */
private fun runningSum(nums: IntArray): IntArray {
    for (i in 1 until nums.size) {
        nums[i] += nums[i - 1]
    }
    return nums
}

internal class Tests {
    @Test
    fun test0() {
        val input = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(1, 3, 6, 10)
        assertArrayEquals(expected, runningSum(input))
    }

    @Test
    fun test1() {
        val input = intArrayOf(1, 1, 1, 1, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5)
        assertArrayEquals(expected, runningSum(input))

    }

    @Test
    fun test2() {
        val input = intArrayOf(3,1,2,10,1)
        val expected = intArrayOf(3,4,6,16,17)
        assertArrayEquals(expected, runningSum(input))
    }
}
