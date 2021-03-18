package rekursion;

import java.util.Locale;

public class DemoRekursionApp {
    public static void main(String[] args) {
        // palindrome 1122332211

       /* System.out.println("isPalindrom "+ isPalindrom("Otto"));
        System.out.println("isPalindrom "+ isPalindrom("11223344332 211"));
        System.out.println("isPalindrom(\"gfdgfh\") = " + isPalindrom("gfdgfh"));*/
        reduce(99, 3);
        reduce(99, -3);
        reduce(99, 333);
    }

    public static boolean isPalindrom(String text){
        text=text.toLowerCase();
        text.replace(" ","");
            char firstCharacter =text.charAt(0);
            char lastCharacter =text.charAt(text.length()-1);
    
            System.out.println("lastCharacter = " + lastCharacter);
            System.out.println("firstCharacter = " + firstCharacter);
        if (firstCharacter == lastCharacter) {
                text = text.substring(1, text.length() - 1);

            if (text.length() <= 1) {
                return true;
            }
            return isPalindrom(text);
        }
        return false;
    }
    public static void reduce(int value, int stopValue){
        if(value>=stopValue){
            System.out.println("value = " + value);
            value--;
            reduce(value,stopValue);
        }
    }
}
