public class StrafeClass {

    String vorname;
    String Nachname;
    String Kennzeichen;
    int strafNummer;
    double strafe;
    int vergehenAnzahl;

    public void strafe(int geschUeber){
        if(geschUeber<20){
            strafe=strafe+20;
        } else if(geschUeber<30){
            strafe=strafe+50;
        } else if(geschUeber<50){
            strafe=strafe+100;
        }else if(geschUeber<=100){
            strafe=strafe+500;
        } else{
            strafe=strafe+1500;
        }
        vergehenAnzahl =vergehenAnzahl+1;
    }

    public void verbandspaket(){
        vergehenAnzahl=vergehenAnzahl+1;
        strafe = strafe+25;
    }
    public void alkohl(double wert){

        if(wert<0.5){
            //tut nichts
        } else if( wert<1.0){
            strafe=strafe+100;
        } else if(wert<2.0){
            strafe=strafe+400;
        }else if(wert<3.0){
            strafe=strafe+1000;
        } else{
            strafe=strafe+5000;
        }
        vergehenAnzahl =vergehenAnzahl+2;


    }
    public void sostinges(double wert){
        vergehenAnzahl =vergehenAnzahl+1;
        strafe=strafe+wert;

    }
    public double getStrafe(){
        if(vergehenAnzahl==1){
            strafe=strafe-strafe*0.3;
        } else if (vergehenAnzahl==2) {
            strafe=strafe-strafe*0.2;
        } else if (vergehenAnzahl==3) {
            strafe=strafe-strafe*0.1;
        }
        strafNummer++;
        return strafe;
    }
    public int getVergehenAnzahl(){
        return vergehenAnzahl;
    }
    public int getStrafNummer(){
        return  strafNummer;
    }
}
