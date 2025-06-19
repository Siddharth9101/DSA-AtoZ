import java.util.Arrays;

public class RotateArrayKPlaces {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(nums));
        int n = nums.length;
        int k = 3;
        k=k%n;

        reverseArr(nums, 0, n - 1);
        reverseArr(nums, 0, k - 1);
        reverseArr(nums, k, n - 1);

        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArr(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
