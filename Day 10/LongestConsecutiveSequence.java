/*<-----------------------Leetcode----------------------->
https://leetcode.com/problems/longest-consecutive-sequence/description/

<-------------------------Question----------------------->
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3
 */

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = new int[] { 100, 4, 200, 1, 3, 2 };

        System.out.println(sequence(nums));

    }

    private static int sequence(int[] nums) {
        // TC - O(nlogn x n)
        // int longest = 1, lastSmallest = Integer.MIN_VALUE, cnt = 0;

        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] - 1 == lastSmallest) {
        // cnt++;
        // lastSmallest = nums[i];
        // } else if (nums[i] != lastSmallest) {
        // cnt = 1;
        // lastSmallest = nums[i];
        // }
        // longest = Math.max(longest, cnt);
        // }

        // return longest;

        // optimal sol

        int longest = 1;
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int cnt = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    cnt++;
                    x = x + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
        // TC - O(n) SC-theta(n)
    }
}
