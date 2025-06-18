public class GCD {
    public static void main(String[] args) {
        System.out.println(findGCD(16, 4));
    }

    public static int findGCD(int a, int b) {
        // <------- brute force --------->

        // int gcd = 1;
        // for (int i = Math.min(a, b); i > 0; i--) {
        // if (a % i == 0 && b % i == 0) {
        // gcd = i;
        // break;
        // }
        // }
        // return gcd;

        // <------- Eculidian's Algo -------->
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }

        return a == 0 ? b : a;
    }
}

/*
 * complexity ->
 * naive approch -> time: theta(min(a,b)); space: theta(1);
 * best approch -> theta (log(min(a,b)))
 */