import java.util.ArrayList;
import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();

        sc.close();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
            if ((n / i) != i) {
                list.add(n / i);
            }
        }

        list.sort(null);
        System.out.println(list.toString());
    }
}
