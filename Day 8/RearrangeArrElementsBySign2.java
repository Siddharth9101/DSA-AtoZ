// Same as the other question but here we are not given equal no of positives and negatives.

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrElementsBySign2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, -4, -5, 3, 6 };

        System.out.print("Arr before rearranging: ");
        System.out.println(Arrays.toString(nums));

        System.out.print("Arr after rearranging: ");
        System.out.println(Arrays.toString(rearrange(nums)));

    }

    public static int[] rearrange(int[] nums) {
        // TC- theta(n) SC - theta(2n)
        int n = nums.length;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int[] ans = new int[n];

        for (int i : nums) {
            if (i > 0) {
                pos.add(i);
            } else {
                neg.add(i);
            }
        }

        int i = 0, p = 0, j = 0;

        while (p < pos.size() && j < neg.size()) {
            ans[i++] = pos.get(p++);
            ans[i++] = neg.get(j++);
        }

        while (p < pos.size())
            ans[i++] = pos.get(p++);
        while (j < neg.size())
            ans[i++] = neg.get(j++);

        return ans;
    }
}
