//  Largest element in an array

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 24, 16, 30, 76, 21 };
        int idx = findElement(arr, 21);
        System.out.println(idx);

    }

    public static int findElement(int[] arr, int n) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}