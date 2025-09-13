package misc;
import java.util.Scanner;

public class PalindromeNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number to check : ");
        int x = sc.nextInt();
        System.out.println(x + " is a Palindrome Number ? : " + plaindrome(x));
    }
    static boolean plaindrome(int x){
        int n=x;
        int newNumber =0;
        if(x<0){
            return false;
        }
        while(n>0){
            if(x<0){
                return false;
            }
            newNumber = (newNumber*10)+ n%10;
            n= n/10;

        }
        return newNumber==x;
    }
}
