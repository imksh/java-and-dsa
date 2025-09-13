//The floor of a number is the greatest integer that is less than or equal to the number.
package misc;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] array = { 2, 4, 5, 7, 9, 13, 15, 18, 25, 28, 34, 42, 48, 49, 56, 59, 64 };
        int target = 0;
        int index = floor(array, target);
        System.out.println(index);

    }

    static int floor(int[] arr, int n) {
        if(n<arr[0]){
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (n > arr[mid]) {
                s = mid + 1;
            } else if (n < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }

        return e;
    }
}
