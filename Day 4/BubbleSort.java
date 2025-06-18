public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 23, 14, 36, 6, 17 };
        System.out.println("Before sorting");
        for (int n : arr)
            System.out.print(n + "\t");
        System.out.println();
        bubble_sort_rec(arr, arr.length - 1);

        System.out.println("After sorting");
        for (int n : arr)
            System.out.print(n + "\t");
    }

    public static void bubble_sort(int[] arr) {
        // time complexity - O(n^2) worst case & average;
        // best case - omega(n);
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int swaps = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) {
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (swaps == 0) {
                break;
            }
        }
    }

    public static void bubble_sort_rec(int[] arr, int n) {
        if (n == 1)
            return;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubble_sort_rec(arr, n - 1);
    }
}