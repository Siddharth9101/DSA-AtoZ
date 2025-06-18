public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 23, 14, 36, 6, 17 };
        System.out.println("Before sorting");
        for (int n : arr)
            System.out.print(n + "\t");
        System.out.println();
        qs(arr, 0, arr.length - 1);

        System.out.println("After sorting");
        for (int n : arr)
            System.out.print(n + "\t");
    }

    public static void qs(int[] arr, int l, int h) {
        if (l < h) {
            int pIdx = partition(arr, l, h);
            qs(arr, l, pIdx - 1);
            qs(arr, pIdx + 1, h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[l];
        int i = l, j = h;

        while (i < j) {
            while (arr[i] <= pivot && i <= h - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= l + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
}
