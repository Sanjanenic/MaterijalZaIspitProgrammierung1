package Mathe;

public class NarzistischeZahlen {
    public static void main(String[] args) {

        narzistischeZahlBerechnen();

    }
    public static void narzistischeZahlBerechnen (){
        for ( int i =0; i<1000;i++){
            if(i == (Math.pow(i % 10, 3)) + (Math.pow(i % 100 / 10, 3)) + (Math.pow(i / 100, 3))) {
                //svaka zagrada daje po jednu cifru broja
                System.out.println(i);
            }
        }
    }
}
//narzistische zahlen 153=1^3 + 5^3+ 3^3