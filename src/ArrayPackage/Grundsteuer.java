package ArrayPackage;

public class Grundsteuer {

    //metoda koja prima dupli array
    public double grundsteuerBerechnen(int [][]g){
        double summe = 0;
        double [] prices = {3.2, 2.1, 0.9};

        for(int i = 0; i < g.length; ++i){
            summe += prices[g[i][0] - 1] * g[i][1] * g[i][2];
        }
        return summe;
    }
    //
    public double [] grundsteuerZuordnen(int [][]g, int []owner){
        double []erg = new double[25];
        double [] prices = {3.2, 2.1, 0.9};

        for(int i = 0; i < g.length; ++i){
            erg[owner[i]] += prices[g[i][0] - 1] * g[i][1] * g[i][2];
        }

        return erg;
    }
}
