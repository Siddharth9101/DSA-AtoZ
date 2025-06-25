/*
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 * 
 */

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println("Max Sum: " + maxSubarr(nums));
    }

    public static int maxSubarr(int[] nums) {
        // Kadane's Algo
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int temp = -1;
        int start = -1, end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (sum == 0) {
                temp = i;
            }
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = temp;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maxSum;
    }
}