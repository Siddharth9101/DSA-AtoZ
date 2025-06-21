/*
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int k = 9;

        System.out.println(Arrays.toString(findIndices(nums, k)));
    }

    public static int[] findIndices(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = k - nums[i];
            if (map.containsKey(sum)) {
                return new int[] { map.get(sum), i };
            }
            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}
