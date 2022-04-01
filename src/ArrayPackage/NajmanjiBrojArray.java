package ArrayPackage;
//Erstellen Sie eine Methode findeKleinsteZahl
// die ein int Array als Parameter erhält und den Index

////    der kleinen Zahl als Rückgabewert zurückliefert
//ovdje imam i kako vratiti najveci br, indeks kako vratiti,
// i kako vratiti array koji sadrzi index i vrijednost

public class NajmanjiBrojArray {
    public static void main(String[] args) {
        //pozvati metodu koja vraca niz intova
        int niz[]={20,78,54,80,8,9};
        System.out.println(findeKleinsteZahl(niz));

    }


    public static int findeKleinsteZahl(int niz[]){

        int kleinsteZahl=niz[0];
                                  // kleinsteZahl je pomocna varijabla kojom racunam,
                                  // na poceku je setujem za prvi broj u nizu
        int indexKleinsteZahl=0;
                                  //pomocna varijabla za racunanje indexa broja u nizu

        for(int i=0; i< niz.length; i++){
            if(kleinsteZahl > niz[i]){     //ova for if kombinacija sluzi za naci najmanji broj u nizu,
                                         // za najveci samo obrunti znak kleinsteZahl<niz[i] bi bilo
                kleinsteZahl=niz[i];
                indexKleinsteZahl=i;
            }
        }
        return indexKleinsteZahl;  //ukoliko trebam vratiti broj najveci a ne njegov indeks
                                   //bilo bi: return kleinsteZahl=niz[i] u ovoj metodi;
    }

    //ako bi vracala array koji sadrzi index i vrijednost najmanjeg br.
    //onda: ispred return pravim novi array: int [] ergebnis={indexKleinsteZahl, kleinsteZahl}
                                            // return ergebnis;
}
