package Sonstiges;

import java.util.Arrays;

public class ForEachBeispielArrayElementeVerändern {

        public static void main(String[] args) {
            int[] array = new int[]{1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(array));  //iniziaizierte Array ausgeben

            for (int number : array) { // durch Array gehen

                array[number - 1] += 12; // auf jeden element  12 addieren
            }
            System.out.println(Arrays.toString(array)); //neue array ausgeben
        }
}


//Zum Beispiel: for (int i : viererReihe){     System.out.println(i);}

//for: Wie bei einer normalen for-Schleife beginnt der for each-loop auch mit dem Keyword „for“.

//        Vor dem : ->int i : viererReihe: Bei i handelt es sich um eine lokale Variable. Du kannst sie also nenne wie du möchtest.
//        Würdest du das Ganze beispielsweise in int Zahlen : viererReihe umbenennen, würdest du genau das gleiche
//        Ergebnis erhalten. Wichtig ist nur, dass die lokale Variable den selben Datentyp wie die Werte des Arrays besitzen!

//        Nach dem Doppelpunkt -> wird dann entsprechend der Arrayname platziert.

//        Array ausgeben->
//        System.out.println(i): Alle Werte i werden ausgegeben.
//        Innerhalb der Klammern muss die Bezeichnung der lokalen Variable gesetzt werden.