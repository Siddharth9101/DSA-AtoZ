public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 23, 14, 36, 6, 17 };
        System.out.println("Before sorting");
        for (int n : arr)
            System.out.print(n + "\t");
        System.out.println();
        selection_sort(arr);

        System.out.println("After sorting");
        for (int n : arr)
            System.out.print(n + "\t");
    }

    public static void selection_sort(int[] arr) {
        // time complexity - theta(n^2) all cases;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

}