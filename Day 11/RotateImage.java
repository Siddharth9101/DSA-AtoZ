/*
 * <--------------Leetcode---------------->
 * https://leetcode.com/problems/rotate-image/description/
 * 
 * <--------------Question---------------->
 * 
 * You are given an n x n 2D matrix representing an image, rotate the image by
 * 90 degrees (clockwise).
 * 
 * You have to rotate the image in-place, which means you have to modify the
 * input 2D matrix directly. DO NOT allocate another 2D matrix and do the
 * rotation.
 * 
 * Example 1:
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * 
 * Example 2:
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 */

public class RotateImage {
    public static void main(String[] args) {
        int[][] nums = new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };

        System.out.println("Matrix before rotating: ");
        for (int[] i : nums) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        rotate(nums);

        System.out.println("Matrix after rotating: ");
        for (int[] i : nums) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] nums) {
        // brute force TC-theta(n^2) SC-(n^2)
        int n = nums.length;
        // int[][] ans = new int[n][n];

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // ans[j][(n - 1) - i] = nums[i][j];
        // }
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // nums[i][j] = ans[i][j];
        // }
        // }

        // optimal approch TC-theta(n x n/2) SC-theta(1)

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swap2DArr(nums, i, j, j, i);
            }
        }

        for (int[] a : nums) {
            reverse(a);
        }
    }

    private static void swap2DArr(int[][] nums, int i, int j, int k, int l) {
        int t = nums[i][j];
        nums[i][j] = nums[k][l];
        nums[k][l] = t;
    }

    private static void swap1DArr(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static void reverse(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            swap1DArr(nums, i, n - i - 1);
        }
    }
}