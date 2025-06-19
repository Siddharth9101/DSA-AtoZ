import java.util.Arrays;

public class RotateArrayOnePlace {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(nums));
        int n = nums.length;

        int temp = nums[0];
        for (int i = 0; i < n - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[n - 1] = temp;
        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(nums));
    }
}