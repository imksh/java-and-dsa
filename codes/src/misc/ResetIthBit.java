package misc;
import java.util.Scanner;

public class ResetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("Enter ith to reset bit : ");
        int i = sc.nextInt();
        int result = (n & ~(1<<(i-1)));
        System.out.println(n + " in binary : " + Integer.toBinaryString(n) + "\nAfter reseting " + i + "th digit : " + result + " in binary ( " + Integer.toBinaryString(result) + " )");
    }
}
