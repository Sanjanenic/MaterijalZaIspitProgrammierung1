package ArrayPackage;

import java.util.Arrays;

public class ObrnutiRedosledElemenataArray {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};                // niz koji primam u metodu
        int[]result=reverse(array1);                //niz koji metoda vraca

        System.out.print(Arrays.toString(result));  //ovako printam jednodimenzionalni niz
                                                     //koji metoda vraca
        }

        //TODO metoda koja obrne niz
    public static int[] reverse(int[] original){

        int[] result = new int[original.length];
        for(int i=0; i<=original.length-1; i++){
            result[i]=original[original.length-1-i];
        }
        return result;
}
}