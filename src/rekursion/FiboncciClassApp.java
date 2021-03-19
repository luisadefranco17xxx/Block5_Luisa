package rekursion;

public class FiboncciClassApp {
    public static void main(String[] args) {

        printCalcFibonaci(8);
    }

    public static long calcFibonacci( int n) {
        if (n == 0) return 0;
        if(n==1) return  1;

        long result =   calcFibonacci(n - 1) + calcFibonacci(n-2);
        //System.out.println("result = " + result);
        return result;
    }
    public static void printCalcFibonaci(int nummer) {
        for (int i = 0; i < nummer; i++) {
            System.out.print(calcFibonacci(nummer) + " "  );
            //TODO   print soll verbessert werden
        }
    }
}
