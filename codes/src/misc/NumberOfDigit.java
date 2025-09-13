package misc;
import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Enter base : ");
        int b = sc.nextInt();
        logMethod(n, b);
        shiftOperatorBinary(n);
        
    }

    static void logMethod(int n, int b){
        int result = (int)(Math.log(n) / Math.log(b)) +1;
        System.out.println("Number of digits in base " + b + " is : " + result);
    }

    static void shiftOperatorBinary(int x){
        int count = 0;
        if(x==0){
            count++;
        }
        while(x!=0){
            count++;
            x = x >> 1;
        }
        System.out.println("Number of digits in binary base 2 is  : " + count);
    }
}