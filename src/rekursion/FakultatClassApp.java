package rekursion;

public class FakultatClassApp {
    public static void main(String[] args) {
        System.out.println("fakultatMethod(4) = " + fakultatMethod(7));
    }
    public static double fakultatMethod(double value){
        System.out.print("value = " + value+" * ");
          if (value==1.0) return 1;
        return value*fakultatMethod(value-1);
    }
}
