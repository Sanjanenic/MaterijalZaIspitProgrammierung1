package ArrayPackage;

public class NapravitiIsprintatiMatrix {
    public static void main(String[] args) {

        //pozivam metodu koja generise matrix
        int [][] x =generateIdentityMatrix(5,7);

        //pozivam metodu koja printa matrix ovaj koji sam iznad u main metodi napravila
        printMatrix(x);

    }

    //metoda pravi matrix koji po dijagonali ima vrijednost 1 a ostalo 0

    public static int[][] generateIdentityMatrix(int sizeX, int sizeY) {   //ovim sam napravila matricu
        int[][] tabelle = new int[sizeX][sizeY];
        for (int zeile = 0; zeile < tabelle.length; ++zeile) {                //dva for su sa kretati se kroz niz
            for (int spalte = 0; spalte < tabelle[zeile].length; ++spalte) {

                if (zeile == spalte) {
                    tabelle[zeile][spalte] = 1;  //if blok dodjeljuju vrijednost po dijagonali
                } else {
                    tabelle[zeile][spalte] = 0;  //else dodjeljuje ostale dijagonale
                }
            }
        }
        return tabelle;
    }

    //metoda koja printa matrix
    public static void printMatrix(int[][] matrix){
        for(int zeile=0; zeile <matrix.length; ++zeile) {

            for (int spalte = 0; spalte < matrix[zeile].length; ++spalte) {

                System.out.print(matrix[zeile][spalte]+"\t");
            }
            System.out.println();
        }
    }
}


