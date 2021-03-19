public class DemoMonatsAbrechnungApp {
    public static void main(String[] args) {
        MitarbeiterClass mitarbeiter1 = new MitarbeiterClass();

        MitarbeiterClass mitarbeiter2 = new MitarbeiterClass();;
        MitarbeiterClass mitarbeiter3 = new MitarbeiterClass();;

        mitarbeiter1.vorname = "Adam";
        mitarbeiter1.nachname = "Kollins";
        mitarbeiter1.alter = 62;
        mitarbeiter1.gehaltBrutto = 28000.0;
        System.out.println("mitarbeiter1.nachname = " + mitarbeiter1.nachname);
        System.out.println("Gehalt Brutto = " + mitarbeiter1.gehaltBrutto);
        System.out.println("mitarbeiter1.jahresAbrechnung() = " + String.format("%.2f", mitarbeiter1.jahresAbrechnung())) ;
        System.out.println("mitarbeiter1 = " + String.format("%.2f",mitarbeiter1.monatsAbrechnung()));

        mitarbeiter2.vorname = "Lukas";
        mitarbeiter2.nachname = "Taller";
        mitarbeiter2.alter = 41;
        mitarbeiter2.gehaltBrutto = 19000.0;
        System.out.println("mitarbeiter2.nachname = " + mitarbeiter2.nachname);
        System.out.println("Gehalt Brutto = " + mitarbeiter2.gehaltBrutto);
        System.out.println("mitarbeiter2.jahresAbrechnung() = " + mitarbeiter2.jahresAbrechnung());
        System.out.println("mitarbeiter2 = " + mitarbeiter2.monatsAbrechnung());

        mitarbeiter3.vorname = "Michaela";
        mitarbeiter3.nachname = "Auer";
        mitarbeiter3.alter = 19;
        mitarbeiter3.gehaltBrutto = 20000.0;
        System.out.println("mitarbeiter3.nachname = " + mitarbeiter3.nachname);
        System.out.println("Gehalt Brutto = " + mitarbeiter3.gehaltBrutto);
        System.out.println("mitarbeiter3.jahresAbrechnung() = " + mitarbeiter3.jahresAbrechnung());
        System.out.println("mitarbeiter3 = " + mitarbeiter3.monatsAbrechnung());

    }
}
