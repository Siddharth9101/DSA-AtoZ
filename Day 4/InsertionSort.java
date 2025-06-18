public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 23, 14, 36, 6, 17 };
        System.out.println("Before sorting");
        for (int n : arr)
            System.out.print(n + "\t");
        System.out.println();
        insertion_sort_rec(arr, 0);

        System.out.println("After sorting");
        for (int n : arr)
            System.out.print(n + "\t");
    }

    public static void insertion_sort(int[] arr) {
        /*
         * time complexity - worst and average case -Theta(n^2)
         * best case - omega(n)
         */
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void insertion_sort_rec(int[] arr, int i) {
        if (i == arr.length)
            return;
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        insertion_sort_rec(arr, ++i);
    }
}
