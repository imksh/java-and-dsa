package misc;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        isPrime(n);
    }

    static void isPrime(int n) {
        if(n<=1){
            System.out.println(n + " is not a prime number.");
            return;
        }
        for(int i = 2; i <=(int) (Math.sqrt(n)); i++){
            if(n % i == 0){
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    }
}
