package misc;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        bitwiseAndMethod(n);
        shiftOperatorMethod(n);
    }

    static void bitwiseAndMethod(int n) {
        int result = n & (n - 1);
        if (result == 0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
    }

    static void shiftOperatorMethod(int n){
        int x = n;
        int count = 0;
        while(x!=0){
            int bit = x & 1;
            if(bit == 1){
                count++;
            }
            x = x>>1;
        }
        if (count == 1) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
    }
}
