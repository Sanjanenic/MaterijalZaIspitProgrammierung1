package ArrayPackage;

import java.util.Arrays;

public class DvodimenzionalniArrayUpisatiUjednodimenzionalan {
    public static void main(String[] args) {

        //pozivam metodu koja vraca jednodimenzionalni array
        int []flat= getFlatArray(new int[][]{{1,2,3,4,},{5,6,7,8}});
        System.out.println(Arrays.toString(flat));
    }


    public static int[] getFlatArray(int[][] numbers){

        int []flat=new int[numbers.length*numbers[0].length];
        int zahler=0;  //pomocna varijabla koja broji elemente dvodimenzionalnog
        //i tako odredjuje duzinu novog niza koji ce metoda vratiti

        for(int index=0; index<numbers.length;index++){
            for(int indexHorisontal=0; indexHorisontal<numbers[index].length; ++indexHorisontal){
                flat[zahler]= numbers[index][indexHorisontal];
                zahler++;
            }
        }

        return flat;
    }

}



//[[0, 1, 9],
//// [6, 3, 2]] => [0, 1, 9, 6, 3, 2]
//Erstellen Sie eine neue Klasse namens NumberHelper. Legen Sie in dieser Klasse eine statische
//Methode mit folgender Signatur:
//public static int[] getFlatArray(int[][] numbers) {

//Die Methode soll die Ganzzahlen aus dem 2d-Array (enthält nur positive Zahlen) in einem flachen,
//eindimensionalen Array abbilden.
//Beispiel:
//Input Output