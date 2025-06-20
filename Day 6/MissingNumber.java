import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        System.out.println("Missing Number is: " + findMissing(nums));

    }

    public static int findMissing(int[] arr) {
        // first sol came into my mind
        // Arrays.sort(arr);

        // int n = 0;
        // for (int i : arr) {
        // if (i != n) {
        // return n;
        // }
        // n++;
        // }
        // return n;
        // TC-O(nlogn)

        // optimal sol
        int n = arr.length;
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        return sum - actualSum;
    }
}