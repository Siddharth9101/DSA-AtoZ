public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(37));
    }

    // public static boolean isPrime(int n) {
    // if (n == 1)
    // return false;
    // if (n == 2 || n == 3)
    // return true;
    // if (n % 2 == 0 || n % 3 == 0)
    // return false;

    // for (int i = 5; i * i <= n; i += 6) {
    // if (n % i == 0 || n% (i + 2) == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;

        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return false;
        }

        return true;
    }
}
