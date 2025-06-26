/*
<-----------------------------------------------Leetcode Link--------------------------------------->
Leetcode - https://leetcode.com/problems/next-permutation/description/


<-------------------------------------------Question Description------------------------------------>
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.
 */

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 2 };

        System.out.print("Given Permuation: ");
        System.out.println(Arrays.toString(nums));
        rearrange(nums);
        System.out.print("Next Permuation: ");
        System.out.println(Arrays.toString(nums));
    }

    public static void rearrange(int[] nums) {
        int idx = -1;
        for (int i = nums.length - 2; i > 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for (int i = nums.length - 1; i >= idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, idx, i);
                break;
            }
        }

        reverse(nums, idx + 1, nums.length - 1);

    }

    private static void reverse(int[] nums, int low, int high) {
        for (int i = low; i < high / 2; i++) {
            swap(nums, i, nums.length - i - 1);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}