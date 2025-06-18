import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 23, 14, 36, 6, 17 };
        System.out.println("Before sorting");
        for (int n : arr)
            System.out.print(n + "\t");
        System.out.println();
        merge_sort(arr, 0, arr.length - 1);

        System.out.println("After sorting");
        for (int n : arr)
            System.out.print(n + "\t");
    }

    public static void merge_sort(int[] arr, int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int first = low;
        int second = mid + 1;
        while (first <= mid && second <= high) {
            if (arr[first] <= arr[second]) {
                list.add(arr[first]);
                first++;
            } else {
                list.add(arr[second]);
                second++;
            }
        }

        while (first <= mid) {
            list.add(arr[first]);
            first++;
        }
        while (second <= high) {
            list.add(arr[second]);
            second++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
    }
}
