package misc;
import java.util.Scanner;

/*
The Nth Magic Number problem involves finding the Nth magic number, where the magic number follows the pattern of powers of 5 (i.e., 5^1, 5^2, 5^3, …).
 */

public class NthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        magic(n);
    }
        
    static void magic(int n) {
        int count =0;
        int result =0;
        while(n!=0){
            count++;
            int temp = n & 1;
            if(temp!=0){
                result += (int)(Math.pow(5,count));
            }
            n = n>>1;
        }
        System.out.println("Magic number is : " + result);
    }
}
