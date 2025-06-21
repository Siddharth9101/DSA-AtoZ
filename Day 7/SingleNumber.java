public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[] { 4, 1, 2, 1, 2 };

        System.out.println(findSingle(nums));
    }

    public static int findSingle(int[] arr) {
        int ans = 0;
        for (int i : arr) {
            ans = ans ^ i;
        }
        return ans;
        // TC-O(n) SC-theta(1)
    }
}