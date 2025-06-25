/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(findMajority(nums));
    }

    public static int findMajority(int[] nums) {
        // brute force
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i : nums) {
        // map.put(i, map.getOrDefault(i, 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> e : map.entrySet()) {
        // if (e.getValue() > nums.length / 2) {
        // return e.getKey();
        // }
        // }
        // return -1;
        // TC- Theta(n) SC-Theta(no of distinct elements in given arr)

        // optimal sol - Moore's Voting Algo
        int el = -1;
        int cnt = 0;

        for (int i : nums) {
            if (cnt == 0 && el != i) {
                el = i;
                cnt++;
            } else if (cnt != 0 && el != i) {
                cnt--;
            } else {
                cnt++;
            }
        }

        return el;
        // TC-theta(1) SC-theta(1)
    }
}