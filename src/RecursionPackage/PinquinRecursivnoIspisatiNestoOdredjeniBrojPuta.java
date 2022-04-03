package RecursionPackage;

public class PinquinRecursivnoIspisatiNestoOdredjeniBrojPuta {
    public static void main(String[] args) {

        lesen(1);
    }

    public static void lesen(int i){
        System.out.println("Der Pinguin schlug die Zeiten auf, da stand: ");
        if(i<10)
            lesen(i+1);  //StackOverflowError kommt diese Error in Konsole, wir haben keine break Bedinung,
        // kako rijesiti sa for dekrement??
    }
}
