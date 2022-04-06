package RecursionPackage;

public class PinquinRecursivnoIspisatiNestoOdredjeniBrojPuta {
    public static void main(String[] args) {

        lesen(1);
    }

    public static void lesen(int i){
        System.out.println("Der Pinguin schlug die Zeiten auf, da stand: " + i);
        if(i<10)
            lesen(i+1);  //StackOverflowError kommt diese Error in Konsole, wir haben keine break Bedinung,
        //
        System.out.println("Der Pinguin schlug die Zeiten auf, da stand: " + i);
    }
}
//ako je sout prije poziva metode rekurzivnog broji unaprijed 1...10
//ako je poslije prvo pozove pa ispise i broji unazad 10....1
//sa oba souta dobijem do necega i nazad.Sa prvim sout samo do, sa drugim samo nazad.