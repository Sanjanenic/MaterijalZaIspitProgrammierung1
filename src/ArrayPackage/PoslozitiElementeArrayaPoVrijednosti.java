package ArrayPackage;

import java.util.Arrays;

public class PoslozitiElementeArrayaPoVrijednosti {

    public static void main(String[] args) {

        //pozvati void metodu koja ispisuje jednodimenzionalni array
        int [] arr= new int []{8,5,1,9,0,4};
        arrangeOrder(arr);

        System.out.println("*******************");

        arrangeOrder2(arr);

    }

    //metoda koja sortira elemente array od najmanjeg ka najvecem
    public static void arrangeOrder(int[] numbers){
//trebam pomocnu varijablu
        int temp=0;
        for (int iNr=0; iNr< numbers.length; iNr++ ) {

            for(int j=iNr+1; j<numbers.length; j++){

                if(numbers[iNr]>numbers[j]){
                    temp= numbers[iNr];
                    numbers[iNr]=numbers[j];
                    numbers[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));


    }

//metoda koja sortira od najveceg ka najmanjem
    public static void arrangeOrder2(int[] numbers){

        int temp=0;
        for (int iNr=0; iNr< numbers.length; iNr++ ) {

            for(int j=iNr+1; j<numbers.length; j++){
                //samo sada u if imam > jedina promjena u odnosu na predhodnu metodu
                if(numbers[iNr]<numbers[j]){
                    temp= numbers[iNr];
                    numbers[iNr]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}
