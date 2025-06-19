public class CheckSorted {
    public static void main(String[] args) {
        int[] nums = new int[] { 3, 4, 5, 1, 2 };
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        if (count == 1 || count == 0) {
            System.out.println("Array is sorted and rotated.");
        } else {
            System.out.println("Array is not sorted and rotated.");
        }

    }
}
