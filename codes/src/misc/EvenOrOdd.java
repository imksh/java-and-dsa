package misc;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check : ");
        int n = sc.nextInt();
        bitwiseAndMethod(n);
        modulusMethod(n);
        
    }
    static void bitwiseAndMethod(int x){
        if((x & 1) == 1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }
    }

    static void modulusMethod(int x){
        if(x % 2 == 0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
