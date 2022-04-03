package Sonstiges;

public class ForUndWhileBeispiel {
    public static void main(String[] args) {
        for (int i=1; i<=100; ++i){
            System.out.println(i);
        }
        System.out.println("-------------");
        int i =1;
        while(i<=100){
            System.out.println(i);
            i++;

        }
        System.out.println("-------------");
        for( i =1; i<=100; ++i ){
            if(i%3==0){
                System.out.println(i+" ist mit 3 teilbar!");
            }
        }


    }
}

//Geben Sie alle Zahlen zwischen 1 und 100 mittels einer for-Schleife und einer while-Schleife aus.
// Erstellen Sie hierzu eine neue Klasse und lösen Sie die Aufgabenstellung direkt in der Main-Methode.

//Geben Sie alle Zahlen zwischen 1 und 100 aus, welche durch 3 teilbar sind. Verwenden Sie hierfür
//den Modulo-Operator und eine if-Abfrage. Erstellen Sie hierzu eine neue Klasse und lösen Sie die
//Aufgabenstellung direkt in der Main-Methode.
