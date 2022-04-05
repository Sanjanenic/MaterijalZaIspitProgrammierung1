package Sonstiges;

public class Mitarbeiter {
    public String vorname;
    public String nachname;
    public double gehalt;
    public int age;


    public double monatsAbrechnung()
    {
        return jahresAbrechnung()/12;
    }

    //metoda koja racuna porez po au sistemu
    public double jahresAbrechnung()
    {
        double erg = gehalt * 12;  //ovo je varijabla koju ce na kraju metoda vratiti

        erg = erg * 0.8; // - sozialversicherung
        double steuerbasis = erg;

        if(steuerbasis > 50000)
        {
            // steuerbasis - 50000 -> alle euros über 50000
            erg -= (steuerbasis - 50000) * 0.6;
            steuerbasis = 50000;
        }

        if(steuerbasis > 30000)
        {
            erg -= (steuerbasis - 30000) * 0.45;
            steuerbasis = 30000;
        }
        if(steuerbasis > 20000)
        {
            erg -= (steuerbasis - 20000) * 0.32;
            steuerbasis = 20000;
        }
        if(steuerbasis > 10000)
        {
            erg -= (steuerbasis - 10000) * 0.2;
            steuerbasis = 10000;
        }
        erg -= steuerbasis * 0.1;

        return erg;
    }
}
