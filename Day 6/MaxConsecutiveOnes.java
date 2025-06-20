public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 1, 0, 1, 1, 1 };

        System.out.println(findOnes(nums));
    }

    public static int findOnes(int[] nums) {
        // first sol came into my mind
        int max = 0;

        int cnt = 0;
        for (int i : nums) {
            if (i == 1) {
                max = Math.max(max, ++cnt);
            } else {
                cnt = 0;
            }
        }
        return max;
        // TC-O(n)
    }
}
