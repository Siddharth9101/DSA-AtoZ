public class Recursion {
    public static void main(String[] args) {
        // System.out.println(add(5));
        // int sum = 0;
        System.out.println(fac(5));
    }

    public static int fac(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fac(n - 1);

    }
}
// f(n) -> sum of n numbers
// f(3) = 3+f(2);
// f(2) = 2+f(1);
// f(1)=1+f(0);
// f(0)=0;