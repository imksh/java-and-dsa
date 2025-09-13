package misc;

import java.util.Scanner;

public class CalculateAPowB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int n = sc.nextInt();
        System.out.println("Enter power : ");
        int b = sc.nextInt();
        calc(n, b);

    }

    static void calc(int n, int b) {
        int ans = 1;
        int x = b;
        while (x != 0) {
            if ((x & 1) == 1) {
                ans *= n;
            }
            n *= n;
            x = x >> 1;
        }
        System.out.println(ans);
    }
}
