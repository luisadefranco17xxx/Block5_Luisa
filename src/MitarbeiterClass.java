public class MitarbeiterClass<teilGehalt> {
    String vorname;
    String nachname;
    int mitarbeiterNummer;
    double gehaltBrutto;
    double teilGehalt;
    double teilGehaltRechnung;
    double steuer;
    int alter;


    public double monatsAbrechnung(){
        return jahresAbrechnung()/12;
    }

    public double jahresAbrechnung(){
        steuer=gehaltBrutto*0.2;
        teilGehalt = gehaltBrutto-steuer;
        teilGehaltRechnung=teilGehalt;
        System.out.println("teilGehalt = " + teilGehalt);
        System.out.println("steuer = " + steuer);
        if (teilGehalt-30000>0){    //  < 30000
            teilGehalt=teilGehalt-30000;
            steuer=steuer+(teilGehalt*0.45);
            System.out.println("steuer >30000 = " + steuer);
            teilGehaltRechnung=30000;
            teilGehalt=teilGehaltRechnung;
        }
        if (teilGehalt-20000>0){    //   zwischen 30000 und 20000
            teilGehalt=teilGehalt-20000;
            steuer=steuer+(teilGehalt*0.32);
            System.out.println("teilGehalt = " + teilGehalt);
            System.out.println("steuer zwischen 30000 und 20000 = " + steuer);
            teilGehaltRechnung=20000;
            teilGehalt=teilGehaltRechnung;
        }
        if (teilGehalt-10000>0){    // 20000 und 10000
            teilGehaltRechnung=10000;

            teilGehalt=teilGehalt-10000;
            steuer=steuer+(teilGehalt*0.20);
            System.out.println("teilGehalt = " + teilGehalt);
            System.out.println("steuer zwischen 20000 und 10000= " + steuer);
            teilGehalt=teilGehaltRechnung;
        }
        if (teilGehalt>0){            // 0 und 10000
                steuer=steuer+(teilGehalt*0.10);
            System.out.println("teilGehalt = " + teilGehalt);
                System.out.println("steuer unter 10000= " + steuer);
            }

        teilGehalt=gehaltBrutto - steuer;
        return teilGehalt;
    }

}
