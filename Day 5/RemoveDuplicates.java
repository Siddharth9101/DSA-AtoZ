import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        // for (int i : nums) {
        // map.put(i, map.getOrDefault(i, 0) + 1);
        // }

        // int[] ans = new int[map.size()];

        // int i = 0;
        // Set<Integer> keys = map.keySet();

        // for (int key : keys) {
        // ans[i] = key;
        // i++;
        // }
        // System.out.println("the new array: " + Arrays.toString(ans));
        // System.out.println("the length of new array: " + ans.length);

        // optimal sol

        int i = 0;
        int j = 1;
        while (j < n) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        System.out.println("the new array: " + Arrays.toString(nums));
        System.out.println("the length of new array: " + (i + 1));
    }
}
