package misc;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(series(7));
    }

    static int series(int n){
        if(n<2){
            return n;
        }

        return series(n-1)+series(n-2);
    }


}
