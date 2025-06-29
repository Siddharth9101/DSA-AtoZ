/*
 * <--------------Leetcode---------------->
 * https://leetcode.com/problems/spiral-matrix/description/
 * 
 * <--------------Question---------------->
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * Example 2:
 * 
 * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        System.out.println("Matrix: ");
        for (int[] i : mat) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        printSpiral(mat);
    }

    private static void printSpiral(int[][] mat) {
        // theta(n x m)
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0, bottom = n - 1, right = m - 1, left = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                ans.add(mat[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(mat[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }

        System.out.println("Spiral rotation:");
        for (int i : ans)
            System.out.print(i + "\t");
    }
}
