package RecursionPackage;

public class VonBestinmteZahlZahlen {

        public static void main(String[] args) {
            //countDown(99);
            //System.out.println("---");
            countDown(12, 5);
            countDown(99);
        }

        public static void countDown(int val, int stop){
            System.out.println(val);
            if(val > 0 && val > stop){
                countDown(val - 1, stop);
            }
            if(val == stop){
                System.out.println("Einmalige Ende");
            }
            System.out.println("das rekurisve verrueckte Ende");

        }
        // hat nichts mit loesung zu tun - nur komfort, dass ich auch mit einem parameter aufrufen kann
        public static void countDown(int val){
            countDown(99, 0);

        }
}
