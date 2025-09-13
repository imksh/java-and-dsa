package misc;
import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        usingShiftOperator(n);
        usingRightMostBit(n);
    }

    static void usingShiftOperator(int n) {
        int x = n;
        int count = 0;
        while (x != 0) {
            if ((x & 1) == 1) {
                count++;
            }
            x = x >> 1;
        }
        System.out.println("Number of set bits(1) in " + n + " is : " + count);
    }

    static void usingRightMostBit(int n) {
        int x = n;
        int count = 0;
        while (x != 0) {
            count++;
            x -= (x & -x);
        }
        System.out.println("Number of set bits(1) in " + n + " is : " + count);
    }
}
