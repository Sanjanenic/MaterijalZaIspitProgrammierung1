package Mathe;

public class CalcFacolty {
    public static void main(String[] args) {

        System.out.println( calcFaculty( 7));

    }
    public static long calcFaculty( int value){
        long ergebnis=1;
        if ( value==0){
            return 1;
        }
        for ( int i=1; i<= value; ++i){
            ergebnis= ergebnis*i;
        }
        return ergebnis;
    }
}
//faktorijal: npr: od 3 je 1*2*3 tj.mnozenje svih predhodnih brojeva pocevsi od 1
//Faktorijal od 0 je 1