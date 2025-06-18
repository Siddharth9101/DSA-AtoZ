public class LCM {
    public static void main(String[] args) {
        System.out.println(findLCM(4, 6));
    }
    // naive approch
    // public static int findLCM(int a, int b) {
    // int res = Math.max(a, b);

    // while (true) {
    // if (res % a == 0 && res % b == 0) {
    // return res;
    // }
    // res++;
    // }
    // }

    // optimal approch
    public static int findLCM(int a, int b) {
        int gcd = gcd(a, b);

        return (a * b) / gcd;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

/*
 * Time complexity -> O(a*b-max(a,b))
 * better approch -> O(log(min(a,b)))
 */