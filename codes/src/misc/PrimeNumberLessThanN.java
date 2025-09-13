package misc;
import java.util.Scanner;

public class PrimeNumberLessThanN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        prime(n);
    }

    static void prime(int n) {
        boolean[] arr = new boolean[n+1];
        for(int i = 2; i*i<=n; i++){
            if(!arr[i]){
                for(int j = i*2; j<=n; j+=i){
                    arr[j]= true;

                }
            }

        }
        for(int i = 2; i<=n; i++){
            if(!arr[i]){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

