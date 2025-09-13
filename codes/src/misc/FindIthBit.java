package misc;
import java.util.Scanner;

public class FindIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("Enter ith to find bit : ");
        int i = sc.nextInt();
        int result = (n & (1<<(i-1))) != 0 ? 1 : 0;
        System.out.println(i + " position Bit of " + n + " is : " + result);

    }
}
