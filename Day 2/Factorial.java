public class Factorial {
    public static void main(String[] args) {
        System.out.println(printFactorial(25));   
    }

    // Iterative solution
    public static long printFactorial(int n) {
        long res = 1;

        while( n > 1 ){
            res *= n;
            n--;
        } 

        return res;
    }

    // Recursive solution
    // public static int printFactorial(int  n) {
    //     if(n==0){
    //         return 1;
    //     }
    //     return n * printFactorial(n-1);
    // }
}

/*
 * for iterative sol.
 * time complexity -> theta(n);
 * auxillary space -> theta(1);
 * 
 * for recursive sol.
 * time complexity -> theta(n);
 * auxillary space -> theta(n);
 * 
 * iterative is considered better approch
 */