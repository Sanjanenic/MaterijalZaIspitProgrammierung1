package ArrayPackage;

public class SumArrayElementeMitWhileLoop {
    public static void main(String[] args) {
//u main moram inizijalizovati niz koji metoda prima
        int[] arr = {
                98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                12, 29, 2, 17, 8, 0};

   //zatim pozvati metodu ovako pomocu pomocne varijable koja sacuvava vrijednost koju metoda vraca
int rezultatt=sumirajElemente(arr);
        System.out.println(rezultatt);

        int[][] arrdupli={{1,2,3},{10,20,30}};
        int rezultat2=sumirajElemente2(arrdupli);
        System.out.println(rezultat2);

    }

    //metoda koja sumira elemente jednodimenzionalnog array pomocu while petlje
    public static int sumirajElemente(int []arr){
        //sum je pomocna varijabla koju metoda vraca
        int sum =0;
        int i =0;
        while(i< arr.length){
            sum=sum+arr[i];
            i++;

        }

        return sum;
    }

    //kako isto napraviti za dupli array?

    public static int sumirajElemente2(int [][]arr){
        //sum je pomocna varijabla koju metoda vraca
        int sum =0;
        int i =0;

        while(i< arr.length){
            int j=0;  // mora biti izmedji vanjske i unutrasnjeyzasto sto tako krece opet iz pocetka je u while petlji
            //j se ne resetuje da ide opet ispocetka kao u for petlji
            while (j<arr[i].length){
                sum=sum+arr[i][j];
                j++;
            }
            i++;

        }
        return sum;
    }

    public static void replace(int searchNumber, int newNumber, int[][] array) {
        for(int i=0; i< array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if(array[i][j]==searchNumber) {
                    array[i][j]=newNumber;
                }
            }
        }
    }

//while(i<10){
//            System.out.println(i);
//            i++;
//        }
//    }




// TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop -->popraviti za dvodimenzionalni, jednodimensionalni radi
// TODO 4: Write a method, calculating and returning the average over all numbers  -->imam

// TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)

// TODO 6: Write a method, which replaces one number by a new new number => public static void replace(int searchNumber, int newNumber)
// TODO 7 (complicated): Write a method which extends an array by one number. You need to create a new array with a length + 1
//  and copy existing values to array and add the new number at end

}
