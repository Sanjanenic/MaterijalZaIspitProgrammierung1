package ArrayPackage;

import java.util.Arrays;

//Erstellen Sie eine Methode luckyLooser die zwei Arrays mit Namen als Parameter erhält. Im ersten
//Array sind all jene Personen die im ersten Gewinnspiel nichts gewonnen haben und im zweiten Array
//all jene Namen die beim zweiten Gewinnspiel nichts gewonnen haben. Alle jene die weder im ersten
//noch im zweiten Gewinnspiel etwas gewonnen haben erhalten einen Trostpreis. Der Rückgabewert
//soll ein Array mit den Namen der Trostpreis GewinnerInnen sein. (Das Array soll so lang sein wie der
//Größere der beiden Parameter)

public class VratiArrayNapravljenOdDvaArrayParametra {
    public static void main(String[] args) {

        //pozvati metodu koja vraca array napravljen od zajednickih elemenata dva druga arrays
        //i odredjuje koji array od dva prametra je kraci pa takvu duzinu daje arrayju koji vraca

        String namen1[]={"Lara","Sara","Lisa","Liv","Iv" };
        String namen2[]={"Julia","Sara","Lisa", "Liv","Iva","Mira"};
        System.out.println(Arrays.toString(luckyLooser(namen1, namen2)));
    }


    public static String[]luckyLooser (String []namen1, String[]namen2){
        int indexKurzer=0;                   //pomocna varijabla za odredjivanje koji je niz kraci
        if(namen1.length<namen2.length){

                                            //if  else blok  poredi duzinu dva niza i upisuje u varijablu kraci
            indexKurzer=namen1.length;
        }
        else if(namen1.length>namen2.length){
            indexKurzer=namen2.length;
        }
        String [] trostpreisGewinnerInnen= new String [indexKurzer];  //pravim array koji trebam vratiti ovom metodom

        String hilfe =" ";

        for (int i=0; i< namen1.length;i++){         //idem kroz prvi array
            for(int i2=0; i2<namen2.length; i2++) {  //idem kroz drugi array
                if (namen1[i] == namen2[i2]){         //if-om biram elemente koje stavljam u niz koji trebam vratiti
                    hilfe= namen1[i];
                    trostpreisGewinnerInnen[i]=hilfe;  //ova linija upisuje vrijednosti u novi niz
                }
            }
        }
        return trostpreisGewinnerInnen;  //vrati array, ovdje mora samo ime arraya funkcionisati
    }

}

//ukoliko se trazi da se porede Stringovi a ne da radim novi niz onda je ovo rijesenje:
//public static String[] luckyLooser(String[] first, String[] second){
//    String[] l = new String[first.length > second.length ? first.length : second.length];  //brzi nacin za if
//    int nextIdx = 0;
//    for(int f = 0; f < first.length; ++f){
//        for(int s = 0; s < second.length; ++s ){
//            if(first[f].equals(second[s])){
//                l[nextIdx++] = first[f];
//                break;
//            }
//        }
//    }
//    return l;
//}