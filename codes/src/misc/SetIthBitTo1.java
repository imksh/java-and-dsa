package misc;
import java.util.Scanner;

public class SetIthBitTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("Enter ith to set it to 1 : ");
        int i = sc.nextInt();
        int result = (n | (1<<(i-1)));
        System.out.println(n + " in binary : " + Integer.toBinaryString(n) + "\nAfter Changing " + i + "th digit to 1 : " + result + " in binary ( " + Integer.toBinaryString(result) + " )");
    }
}
