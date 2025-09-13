package misc;
import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start range of number to be XOR : ");
        int a = sc.nextInt();
        System.out.println("Enter end range of number to be XOR : ");
        int b = sc.nextInt();
        if(a==0){
            System.out.println("XOR of number from " + a + " to " + b + " is : " + rangeXOR(b) );
        }else{
            int x = rangeXOR(b);
            int y = rangeXOR(a-1);
            int result = x^y;
            System.out.println("XOR of number from " + a + " to " + b + " is : " + result);

        }

    }

    static int rangeXOR(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n+1;
        } else if (n % 4 == 3) {
            return 0;
        }
        return -1;
    }

}
