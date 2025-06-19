// Second Largest Element in an Array without sorting
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 24, 60, 30, 76, 21 };
        int secLargest = findSecLargest(arr);
        System.out.println(secLargest);
    }

    public static int findSecLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                secLargest = largest;
                largest = n;
            }
            if (n > secLargest && n != largest) {
                secLargest = n;
            }
        }

        return secLargest;
    }
}
