public class TrailingZeroes {
    public static void main(String[] args) {
        System.out.println(findTralingZeroes(10));
    }

    public static int findTralingZeroes(int n){
        int res = 0;

        for ( int i = 5; i <= n; i *= 5 ) {
            res += n/i;
        }

        return res;
    }
}

/*
 * Time complecity -> 
 * the loop is going to run 5.pow(k) <= n
 *                          k <= log.base(5)n
 *                       theta( log(n) )
 * Auxillary space -> theta(1); 
 * 
 * 
 */