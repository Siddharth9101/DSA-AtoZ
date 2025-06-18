public class Palindrome {
    public static void main(String args[]){
        System.out.println(checkPlaindrome(326));
    }

    public static boolean checkPlaindrome(int n){
        int rev = 0;
        int temp = n;

        while( temp > 0 ){
            rev = rev * 10 + (temp%10);
            temp/=10;
        }   

        return rev == n;
    }
}

/*
 * time complexity -> theta(n);
 * auxillary space -> theta(1);
 * 
 */