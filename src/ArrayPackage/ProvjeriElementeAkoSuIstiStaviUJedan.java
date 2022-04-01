package ArrayPackage;

//Als Parameter erhalten Sie ein
//zweidimensionales Array, wobei jede Zeile so aufgebaut ist: erste Zahl ist eine ganzzahlige ID die für
//ein Handymodell steht, zweite Zahl die Anzahl verkauften Telefone mit der ID
//1, 50 (Smartphone mit Nummer 1, 50 Stück)
//2, 40
//1, 60
//Sie sollen diese Daten zusammenfassen und ein zwei dimensionales Array zurückliefern, welches die
//Verkaufszahlen für jedes Handy aggregiert. Also beispielsweise
//[[1, 110],
//[2, 40]]
//Einfache Version: Nehmen Sie an es gibt maximal 10 unterschiedliche Geräte.
//Erweiterte Version: Berechnen Sie zuerst wie viele unterschiedliche Geräte es gibt. (Achtung knifflig)

import java.util.Arrays;

public class ProvjeriElementeAkoSuIstiStaviUJedan {
    public static void main(String[] args) {

        int [][] sales={{1,50},{2,40},{1,30},{4,7}};  //ovaj array prima u metodu

        int [][] sums=smartphoneSales(sales);  //ovaj vraca

        for(int i=0; i<sums.length; i++) {  //kad imam dvodimenzionalni kao parametar ovako printam
                                             //sa for + sout(Arras.toString()
            System.out.println(Arrays.toString(sums[i]));  //ovom linijom mogu printati samo jednodimenzionalni niz
        }
    }


    public static int[][] smartphoneSales(int [][]sales){
        int [][] sums = new int[10][2];

        for(int i = 0; i < sales.length; ++i){
            sums[sales[i][0]-1][0] = sales[i][0];
            sums[sales[i][0]-1][1] += sales[i][1];
        }
        return sums;
    }
}