package ArrayPackage;

public class ProvjeriImaLIOvajElemnetUArray {
    public static void main(String[] args) {

        int[] schachtel = {3, 5, 7, 9, 11, 13, 17};

        printArray(schachtel);   //poziv void metode

        System.out.println(containsNumber(9,schachtel));  //poziv metode koja vraca boolean
        System.out.println(containsNumber(10,schachtel));
    }

    //metoda koja printa  jednodimenzionalni array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    //metoda provjerava ima li neki br.u Array
    public static boolean containsNumber(int number, int[] array) {

        boolean isContained = false;                //pomocna varijabla
        for (int i = 0; i < array.length; i++) {  //for ide kroz niz
            if(number==array[i]) {                //if provjerava brojeve
                isContained = true;
                break;                        //bez break, ne bi ispisao na konzolu, ne izadje iz petlje
            }


        }
        return isContained;
    }

}


