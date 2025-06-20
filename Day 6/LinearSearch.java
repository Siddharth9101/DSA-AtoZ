public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };

        int res = findElement(nums, 3);

        if (res == -1)
            System.out.println("The element is not present in the array.");
        else
            System.out.printf("The element is present at index: %d", res);
    }

    public static int findElement(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k) {
                return i;
            }
        }
        return -1;
        // TC-O(n)
    }
}
