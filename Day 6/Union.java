import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 0, 1, 0, 3, 12 };
        int[] nums2 = new int[] { 23, 8, 12, 3, 20 };

        HashSet<Integer> set = new HashSet<>();

        for (int n : nums1) {
            set.add(n);
        }
        for (int n : nums2) {
            set.add(n);
        }

        for (int n : set) {
            System.out.print(n + "\t");
        }
    }
}
