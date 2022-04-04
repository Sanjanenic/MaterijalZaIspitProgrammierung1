package ArrayPackage;

import java.util.Arrays;

public class ZamjenaBrojaUDuplomiJednodimenzionalnomNizu {

    public static void main(String[] args) {
//u main moram inizijalizovati niz koji metoda prima
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8, 0};

        //zatim pozvati metodu ovako pomocu pomocne varijable koja sacuvava vrijednost koju metoda vraca
        replace(47,1000, arr);
        System.out.println(Arrays.toString(arr));

//ovako pozivam metodu koja radi sa duplim array
        int[][] arrdupli={{1,2,3},{10,20,30}};
        replace2D(3,1000, arrdupli);
        System.out.println(Arrays.deepToString(arrdupli));
    }

    //metoda prima broj provjerava ima li ga u nizu i ukoliko ima mijenja ga novim btojem
    //metoda je void, ne vraca nista nego samo izmijeni niz koji je primila kao parametar
    public static void replace(int searchNumber, int newNumber, int[] array) {
        for(int i=0; i< array.length; i++)   {
                if(array[i]==searchNumber) {
                    array[i]=newNumber;
                }
            }

    }
    //metoda prima broj provjerava ima li ga u duplom nizu i ukoliko ima mijenja ga novim btojem
    //metoda je void, ne vraca nista nego samo izmijeni niz koji je primila kao parametar
    public static void replace2D(int searchNumber, int newNumber, int[][] array) {
        for(int i=0; i< array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if(array[i][j]==searchNumber) {
                    array[i][j]=newNumber;
                }
            }
        }
    }
}
