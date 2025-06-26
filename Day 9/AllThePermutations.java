import java.util.ArrayList;
import java.util.List;

public class AllThePermutations {
    // TC - theta(n! x n) SC-theta(2n)
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 };

        List<List<Integer>> list = allPermutations(nums);
        for (List<Integer> i : list) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> allPermutations(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        // ArrayList<Integer> ds = new ArrayList<>();
        // boolean[] freq = new boolean[nums.length];

        // recPermutations(ans, ds, nums, freq);

        // better approch
        recPermutations(ans, nums, 0);
        return ans;
    }

    // public static void recPermutations(List<List<Integer>> ans,
    // ArrayList<Integer> ds, int[] nums, boolean[] freq) {
    // if (ds.size() == nums.length) {
    // ans.add(new ArrayList<>(ds));
    // return;
    // }

    // for (int i = 0; i < nums.length; i++) {
    // if (!freq[i]) {
    // freq[i] = true;
    // ds.add(nums[i]);
    // recPermutations(ans, ds, nums, freq);
    // ds.remove(ds.size() - 1);
    // freq[i] = false;
    // }
    // }
    // }

    // better approch

    private static void recPermutations(List<List<Integer>> ans, int[] nums, int idx) {
        if (idx == nums.length) {
            ArrayList<Integer> list = new ArrayList<>();

            for (int i : nums) {
                list.add(i);
            }

            ans.add(list);
        }

        for (int i = idx; i < nums.length; i++) {
            swap(idx, i, nums);
            recPermutations(ans, nums, idx + 1);
            swap(idx, i, nums);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
