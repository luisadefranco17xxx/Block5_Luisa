public class DemoClass {
    public static void main(String[] args) {
        StrafeClass myStrafeClass = new StrafeClass();

        myStrafeClass.strafe=0;
        myStrafeClass.vergehenAnzahl=0;
        myStrafeClass.strafNummer=0;
        myStrafeClass.Nachname="Schmitt";
        myStrafeClass.vorname="Harald";
        myStrafeClass.Kennzeichen="G 2345Li";

        myStrafeClass.strafe(150);
        myStrafeClass.alkohl(9.0);
        System.out.println("By geschwindikeit Uberschritt von 150km/h und alkohol 9.0 proMille, die Strafe ist: " +myStrafeClass.getStrafe());

        myStrafeClass.sostinges(700);
        myStrafeClass.alkohl(9.0);
        System.out.println("...es geth weiter: sostige Strafe von 700 Euro und wieder alkohol 9.0 proMille, die Strafe ist jetzt: " +myStrafeClass.getStrafe());

        System.out.println("Jetzt die Anzahl der Vergehen ist: "+ myStrafeClass.getVergehenAnzahl());
        System.out.println("Die letzte Strafe ist die Nummer : "+ myStrafeClass.getStrafNummer());



    }
}
