import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        int n = nums.length;

        System.out.println("Before moving the zeroes: ");
        System.out.println(Arrays.toString(nums));

        // first sol came into my mind
        // if (nums.length != 1) {
        // for (int i = n - 1; i >= 0; i--) {
        // if (nums[i] == 0) {
        // int j = i;
        // while (j < n - 1) {
        // int temp = nums[j];
        // nums[j] = nums[j + 1];
        // nums[j + 1] = temp;
        // j++;
        // }
        // }
        // }
        // }
        // TC - O(n^2)

        // optimised sol
        int idx = 0;

        for (int i : nums) {
            if (i != 0) {
                nums[idx++] = i;
            }
        }

        while (idx < n) {
            nums[idx++] = 0;
        }
        // TC- O(n)

        System.out.println("After moving the zeroes: ");
        System.out.println(Arrays.toString(nums));
    }
}