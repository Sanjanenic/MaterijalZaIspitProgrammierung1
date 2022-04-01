package ArrayPackage;

//Erstellen Sie die Klasse ArrayDemo mit main-Methode(). Erzeugen
//Sie zwei int Arrays mit jeweils einer Länge von 3 und initialisieren
//Sie diese mit beliebigen Ganzzahlen. Geben Sie danach auf der
//Konsole die elementweise Addition sowie Multiplikation aus.
//Bsp.
//Array1 => [3,4,5]
//Array2 => [7,1,3]
//Ausgabe:
//+ 10,5,8
//* 21,4,15

public class ArrayPomnozitiElementeDvaRazlicitaJednodimenzionalnaNiza {
    public static void main(String[] args) {

        int[] niz1={3,4,5};
        int[]niz2={7,1,3};
        sabratiElementeDvaNiza(niz1,niz2);   //ovako se poziva void metoda
        System.out.println();
        mnozitiElementeDvaNiza(niz1,niz2);
    }

    public static void sabratiElementeDvaNiza(int[] niz1, int[] niz2) {
        for (int i = 0; i < niz1.length; ++i) {
            System.out.print(niz1[i] + niz2[i]);  //i sluzi da iscita iz oba array vrijednost elementa
            System.out.print(" , ");
        }
    }
    public static void mnozitiElementeDvaNiza(int[] niz1, int[] niz2){
        for (int i = 0; i < niz1.length; ++i) {
            System.out.print(niz1[i] * niz2[i]);  //i sluzi da iscita iz oba array vrijednost elementa
            System.out.print(" , ");
        }
    }
}
