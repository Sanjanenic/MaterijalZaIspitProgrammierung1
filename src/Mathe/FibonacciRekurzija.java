package Mathe;

public class FibonacciRekurzija {
    public static void main(String[] args) {
        int ersteFib = 0;
        int zweiteFib = 1;

        System.out.println(ersteFib);
        System.out.println(zweiteFib);

        // In einer rekursiven Methode
  //      fibonacciRekursiv(ersteFib, zweiteFib);  //fibonacci dva predhodna broja se saberu
        // i daju sljedeci, pocinje od 0 i 1

       int i= fibonacciRekursivDoOdredjenogClana(0,1,10);
        System.out.println(i);

    }

    // brechen bei 1000 ab damit wir nicht unendlich weiter laufen
    public static void fibonacciRekursiv(int a, int b) {
        // Wir berechnen das Ergebnis aus a und b
        int ergebnis = a + b;  //rezultat sabiranja tj.sledeci fib.broj
        // Wir überprüfen ob das Ergebnis bereits
        // das Limit überschreitet
        if (ergebnis > 1000) {
            return;
        } else {
            // Sonst geben wir das Ergebnis in der Konsole aus
            System.out.println(ergebnis);
            // und rufen dann die Methode wieder auf, <- REKURSION!
            // nur hat a nun den Wert von b
            // und b bekommt den Wert von ergebnis
            a = b;                   //u prvi clan sabiranja stavi drugi clan
            b = ergebnis;            //u dugi stavi zbir prvog i drugog
            fibonacciRekursiv(a, b);


        }
    }
    //ako zelim dobiti npr.10i clan fib.niza:

    public static int fibonacciRekursivDoOdredjenogClana(int a,int b, int clan) {
        // Wir berechnen das Ergebnis aus a und b
        int ergebnis = a + b;
        int hilfeTrazeniClan=0;
        //rezultat sabiranja tj.sledeci fib.broj
        // Wir überprüfen ob das Ergebnis bereits
        // das Limit überschreitet
        if (clan==0) {
            return ergebnis;
        } else {

            a = b;  //u prvi clan sabiranja stavi drugi clan
            b = ergebnis;
            clan--;
           hilfeTrazeniClan= fibonacciRekursivDoOdredjenogClana(a, b,clan);
        }
        return hilfeTrazeniClan;
    }
}
