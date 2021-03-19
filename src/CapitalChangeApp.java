import java.util.Locale;

public class CapitalChangeApp {
    public static void main(String[] args) {

        System.out.println( "La casa ls rossa: "+capitalChangeMetod("La casa e rossa"));

    }

    public static String capitalChangeMetod(String myString) {  //suche erste leere Platz + index wo anfangen zu suchen
        int length=0;
        int pointer=0,index=0;   //pointer is wo fange ich an zu suchen

        String mySubstring=myString;
        String letzteString="";
        length = myString.length();
        System.out.println("length = " + length);
        while (pointer < length) {
            System.out.println("myString index first leer space = " + myString.substring(pointer,length).indexOf(" "));
            index = myString.substring(pointer,length).indexOf(" ");   //suche erste leer Zeichen
            if (index == -1) {

                return letzteString = letzteString + myString.substring(pointer, length);

            } else {
                mySubstring = myString.substring(pointer, pointer+index+1);
                System.out.println("substring = " + myString.substring(pointer, pointer+index+1));

                char myChar = myString.charAt(pointer+index +1);
                System.out.println("myChar = " + myChar);
                char myChar1;
                myChar1 = Character.toUpperCase(myChar);
                System.out.println("myChar1 = " + myChar1);

                letzteString = letzteString + mySubstring  + myChar1;

                System.out.println("letzteString = " + letzteString);
                System.out.println("index = " + index);
                pointer = pointer+index + 2;
                System.out.println("pointer = " + pointer);

            }
        }
        return letzteString;          // return eine neue String ohne leere Platze ()
    }


}
