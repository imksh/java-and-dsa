package misc;
import java.util.*;


class TowerOfHanoi{

    public static void logic(int n, String src, String helper,  String dest){
        if(n==1){
            System.out.println("Transfer Disk "+ n + " from "+ src + " to " + dest);
            return;
        }
        logic(n-1, src, dest, helper);
        System.out.println("Transfer Disk "+ n + " from "+ src + " to " + dest);
        logic(n-1, helper, src, dest);
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements : ");
        int n = sc.nextInt();
        System.out.println("Source Tower = Tower_1 \nIntermediate Tower = Tower_2 \nDestination Tower = Tower_3");
        logic(n, "Tower_1", "Tower_2", "Tower_3");
    }
};
