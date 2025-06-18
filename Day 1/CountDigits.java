class CountDigits {
    public static void main(String args[]){
        System.out.println(countDigits(83734));
    }


    public static int countDigits(int n){
        int res = 0;

        while ( n > 0 ){
            n/=10;
            res++;
        }
        return res;
    }
}

/* 
Time Complexity -> Theta(n);
Auxillary Space -> Theta(1);
*/  