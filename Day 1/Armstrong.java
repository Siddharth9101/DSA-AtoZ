import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();

        sc.close();

        System.out.println(checkArmstrong(n) ? "Armstrong" : "Not Armstrong");

    }

    public static boolean checkArmstrong(int n) {
        int count = 0;
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        temp = n;
        while (temp > 0) {
            int ld = temp % 10;
            int num = (int) Math.pow(ld, count);
            sum += num;
            temp /= 10;
        }

        return sum == n;
    }
}
