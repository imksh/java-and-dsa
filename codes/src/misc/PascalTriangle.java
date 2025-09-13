package misc;
import java.util.Scanner;

// sum of nth row of Pascal Triangle

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        sumOfNthRow(n);
            }
        
            static void sumOfNthRow(int n) {
                int result =0;
                result += 1<<(n-1);
                System.out.println("Sum of digit of " + n + " row of Pascal Triangle is : " + result);
            }
}
