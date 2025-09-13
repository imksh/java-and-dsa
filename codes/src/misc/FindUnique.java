package misc;
import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements of array : ");
        for (int i =0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        unique(arr);
    }

    static void unique(int[] arr) {
        int num = 0;
        for (int n= 0; n<arr.length; n++) {
            num ^= arr[n];
        }
        System.out.println("Unique Number in the Array is : " + num);
    }
}
