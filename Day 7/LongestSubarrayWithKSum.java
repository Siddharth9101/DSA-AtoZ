public class LongestSubarrayWithKSum {
    public static void main(String[] args) {
        int[] nums = new int[] { 10, 5, 2, 7, 1, 9 };

        int k = 15;

        System.out.println(logestSum(nums, k));
    }

    public static int logestSum(int[] nums, int k) {

        int i = 0, j = 0, sum = 0, len = 0;

        while (j < nums.length) {
            sum += nums[j];

            while (sum > k && i <= j) {
                sum -= nums[i];
                i++;
            }

            if (sum == k) {
                len = Math.max(len, j - i + 1);
            }

            j++;
        }

        return len;
        // TC-O(n)
    }
}
