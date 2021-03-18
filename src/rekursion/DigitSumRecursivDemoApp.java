package rekursion;

public class DigitSumRecursivDemoApp {
    public static void main(String[] args) {
        System.out.println("getDgitSum(5) = " + getDgitSum(5));
        System.out.println("power(2,2) = " + power(2,2));
        System.out.println("power(2,2) = " + power(2,4));
        System.out.println("multiplicate(2,3) = " + multiplicate(2,3));
        System.out.println("multiplicate(2,9) = " + multiplicate(2,9));
        //System.out.println("getDgitSum(12345) = " + getDgitSum(12345));
        System.out.println("fibonacciPrint(1) = " + fibonacciPrint(1));

    }
    public static int getDgitSum(int nummer){
        //copy
        if(nummer<10 )return nummer;
        return nummer% +getDgitSum(nummer/10);
    }
    public static int power(int a, int b){
        if(b<2){
            return a;
        }
        return a*power( a,b-1);
    }

    public static int multiplicate(int a, int b) {
        /* Multiplicate a * b, but just do it with + and recursion */
        if (b >= 1 && a >= 1)
            return a + multiplicate(a, b - 1); // 5 x 4 = a + a + a + a => 5 + 5 + 5 + 5 + 0

        return 0;
    }





    public static int fibonacciPrint(int number){
       if  (number>=100) return 1;
        System.out.print(number+" , ");
       return  1+fibonacciPrint(number);
    }
}
