/*<-----------------------Leetcode----------------------->
https://leetcode.com/problems/set-matrix-zeroes/description/

<-------------------------Question----------------------->
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */

import java.util.ArrayList;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] nums = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        System.out.println("Before setting zeroes");
        for (int[] i : nums) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        setZeroes(nums);

        System.out.println("After setting zeroes");
        for (int[] i : nums) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] nums) {
        // TC - O(n^2) SC- O(m+n)
        // ArrayList<Integer> rows = new ArrayList<>();
        // ArrayList<Integer> cols = new ArrayList<>();

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[i].length; j++) {
        // if (nums[i][j] == 0) {
        // rows.add(i);
        // cols.add(j);
        // }
        // }
        // }

        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[i].length; j++) {
        // if (rows.contains(i) || cols.contains(j)) {
        // nums[i][j] = 0;
        // }
        // }
        // }

        // optimal sol
        // TC - O(n^2) SC - O(1)
        int n = nums.length;
        int m = nums[0].length;
        int col0 = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums[i][j] == 0) {
                    nums[i][0] = 0;

                    if (j != 0) {
                        nums[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = m - 1; j > 0; j--) {
                if (nums[i][j] != 0) {
                    if (nums[i][0] == 0 || nums[0][j] == 0) {
                        nums[i][j] = 0;
                    }
                }
            }
        }

        if (nums[0][0] == 0) {
            for (int i = 1; i < m; i++) {
                nums[0][i] = 0;
            }
        }

        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                nums[i][0] = 0;
            }
        }
    }
}
