package ArrayPackage;

////Die Methode mittelwerte erhält als Parameter ein zweidimensionales float Array. (-> Parameter).
//    //Für jede Zeile wird der Mittelwert berechnet und in einem neuen Array gespeichert -> dieses Array
//    //soll als Rückgabewert zurückgeliefert werden.
//    //Den arithmetische Mittelwert erhält man wenn man die aufsummierten Werte durch die Anzahl der
//    //Elemente dividiert.


import java.util.Arrays;

public class SrednjaVrijednostUSvakojLinijiDvodimenzionalni {

    public static void main(String[] args) {

        //pozvati metodu koja racuna prosjek u svakoj liniji duplog array i vraca jednodimenzionalni array
        float[][] x ={{10,20,30},
                {3,5,7},
                {11,12,20}} ;
        System.out.println(Arrays.toString(mittelwertBerechnen(x)));

    }

    public static float[] mittelwertBerechnen (float [][] niz) {
        float mittelwertArray[] = new float[niz.length]; //pomocni array u koji cu upisati moje srednje vrijednosti
                                                         // za svaku liniju duplog array
        float average=0.0f;
        for (int i = 0; i < niz.length; i++) {
            float sumPerline = 0.0f;                //ovim setujem sumu na 0 poslije svake linije arraya duplog
            average = 0.0f;                         // average takodje
            for (int j = 0; j < niz[i].length; j++) {

                if (i == 0) {                               //svaki if racuna sa jednu liniju duplog arraya
                    sumPerline = (sumPerline + niz[i][j]);
                    average = sumPerline / niz.length;
                }
                if(i==1){
                    sumPerline = (sumPerline + niz[i][j]);
                    average = sumPerline / niz.length;
                }
                if(i==2){
                    sumPerline = (sumPerline + niz[i][j]);
                    average = sumPerline / niz.length;
                }

                mittelwertArray[i]=average;    //!!!!ova linija upisuje u niz novi i
                                               // mora biti u vanjskoj for ali van unutrasnje
            }

        }
        return mittelwertArray;      //ovjde samo ime array mora funkcionisati
    }

}
