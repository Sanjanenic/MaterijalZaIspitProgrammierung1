package ArrayPackage;

public class Grundsteuer {

    //metoda koja prima dupli array
    public double grundsteuerBerechnen(int [][]g){
        double summe = 0;
        double [] prices = {3.2, 2.1, 0.9};

        for(int i = 0; i < g.length; ++i){  //for petlja mnozi clanove g niza sa clanovima prices niza
            summe += prices[g[i][0] - 1] * g[i][1] * g[i][2];
        }
        return summe;
    }
    //metoda pravi novi niz ownera od 25 clanova
    public double [] grundsteuerZuordnen(int [][]g, int []owner){
        // nizu owner su ineksi od erg
        double []erg = new double[25];
        double [] prices = {3.2, 2.1, 0.9};

        for(int i = 0; i < g.length; ++i){
            erg[owner[i]] += prices[g[i][0] - 1] * g[i][1] * g[i][2];
        }

        return erg;
    }
}
