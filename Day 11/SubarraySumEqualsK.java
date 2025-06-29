/*
 * <--------------Leetcode---------------->
 * https://leetcode.com/problems/subarray-sum-equals-k/description/
 * 
 * <--------------Question---------------->
 * 
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 
 */

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 };
        int k = 3;
        System.out.println(noOfSubArr(nums, k));
    }

    private static int noOfSubArr(int[] nums, int k) {
        // Brute force sol TC-O(n^2) SC-theta(1)
        int cnt = 0;
        // for (int i = 0; i < nums.length; i++) {
        // int sum = 0;
        // for (int j = i; j < nums.length; j++) {
        // sum += nums[j];
        // if (sum == k) {
        // cnt++;
        // }
        // }
        // }

        // optimal sol O(n) SC- O(n) prefix sum + hashmap
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i : nums) {
            preSum += i;
            int remove = preSum - k;
            cnt += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }
}
