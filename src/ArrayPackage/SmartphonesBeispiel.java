package ArrayPackage;

public class SmartphonesBeispiel {
    public static void main(String[] args) {
        String[] telefoni = {"Nokia", "Samsung", "Iphone", "Huawei"};

        int[][] prodajaPoKvartalu = {{1000, 3000, 500, 600},
                {2000, 5000, 6000, 7000},
                {809, 4000, 370, 509},
                {208, 4000, 987, 9000}};

        prodajaPoKvartalimaZaTelefone(telefoni, prodajaPoKvartalu);
        System.out.println("----------------------");

        int sum =godisnjaProdaja(0,prodajaPoKvartalu);
        System.out.println(sum);

        String najprodavaijiTelefon=NajprodavanijiTelefonKvartalno(telefoni,prodajaPoKvartalu,1);
        System.out.println(najprodavaijiTelefon);

    }

    public static void prodajaPoKvartalimaZaTelefone(String[] telefoni, int [][]prodajapoKvartalima) {
//dvije for petlje idu kroz dupli array,
// izmedju njih ovo printa imena iz prvog niza
        //prema indexu
        for (int i = 0; i < prodajapoKvartalima.length; i++) {
            System.out.println(telefoni[i]);

            for (int j = 0; j < prodajapoKvartalima[i].length; j++) {
                System.out.println(prodajapoKvartalima[i][j]);
            }
        }

    }

    //index telefona je ovdje i,sumiram po jednom redu koji dobijem u parametru
    //zato mi treba samo unutrasnja for petlja sa j.

    //ako bih trebala sumirati sve brojeve u matrici onda ide isto ovako sa dvije for petlje
    //i suma se deklarise prije for petlji a sumira se u unutrasnjoj petlji.

    //ako trebam sumirati po redovima za sve redove, sumiranje ide izmedju vanjske i unutrasnje for a sve ostalo kao i suma citave
    //matrice

    public static int godisnjaProdaja(int indexTelefona,int[][]prodajaPoKvartalima) {

        if(indexTelefona<0 || indexTelefona>=prodajaPoKvartalima.length){
            return -1;
        }
        int sumProdaja=0;
        for (int j = 0; j < prodajaPoKvartalima[indexTelefona].length; j++) {
            sumProdaja = sumProdaja + prodajaPoKvartalima[indexTelefona][j];

        }
        return sumProdaja;

    }
    public static String NajprodavanijiTelefonKvartalno( String[]telefoni, int [][]prodajapoKvartalu, int kvartal){
        if(kvartal<=0 || kvartal>prodajapoKvartalu.length){
            return "";
        }

        String najprodavanijiTelefon="";   //paramtar kvartal je zapravo j iz matrice, dobijam unaprijed koji kvartal

        //sad odrediti koji je element najveci u zadatom kvartalu

        int [] kolonaKvartalUkomTrazimNajveci=new int[prodajapoKvartalu.length];  //pomocni niz koji uzima j kolonu
        //i onda ne trebam dalje dvodimenzionalni

        for(int i =0; i<prodajapoKvartalu.length; ++i){
            kolonaKvartalUkomTrazimNajveci[i]=prodajapoKvartalu[i][kvartal-1];
            //kvartal je moje j, dobijem ga u parametru i ne mijenja se
        }                                                              //sad je niz jednodimenzionalni napravljen for petljom

        //pozivam metodu ispod koja racuna index najveceg broja (i iz duplog niza) u nizu i sacuvavam
        //vrijednost u  pomocni int indexNajptodavanijeg

        int i= findeGrossteZahl(kolonaKvartalUkomTrazimNajveci);

        najprodavanijiTelefon=telefoni[i];
        return najprodavanijiTelefon;
    }

    //metoda koja racuna index najveceg broja u nizu, mogu je koristiti ovako svugdje
    public static int findeGrossteZahl(int niz[]){

        int grossteZahl=niz[0];

        int indexGrossteZahl=0;


        for(int i=0; i< niz.length; i++){
            if(grossteZahl < niz[i]){

                grossteZahl=niz[i];
                indexGrossteZahl=i;
            }
        }
        return indexGrossteZahl;
    }

}


