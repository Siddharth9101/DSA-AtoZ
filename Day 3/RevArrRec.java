public class RevArrRec {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        printArr(arr);
        revArr(arr, 0);
        printArr(arr);

    }

    public static void revArr(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        revArr(arr, i + 1);
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
