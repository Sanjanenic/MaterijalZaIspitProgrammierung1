package ArrayPackage;

public class MetodePozivatiArraySumPovecajSvakiDrugiElement {
    public static void main(String[] args) {

        //ako je metoda void ovako se poziva. paznja!!!!ne ide = znak
        // prosljedjuje se samo ime u metodu kao parametar, nista vise
        int[] ime = new int[] {24,56,78};  //ovaj niz prima metoda
        primiIspisiNiz(ime);

        //return metoda:
        // ako je metoda return onda mora imati jednako prije imena metode,
        // return uvijek vraca u varijablu (mora biti istog tipa)
        int [] ime2 = getNiz();
        primiIspisiNiz(ime2);



        //sumirati niz, return metoda koja prima niz avraca sum
        int[]niz ={10,20,20};
        int sumErgebniss=sumirajElemente(niz);
        System.out.println(sumErgebniss);

//metoda koja povecava svaki drugi clan array za 1
        int []niz1={1,2,3,4,5,6};
        int []nizPomocni=povecajSvakiDrugiElementNizaZaJedan(niz1);
        primiIspisiNiz(nizPomocni);
    }


    public static void primiIspisiNiz(int[]niz){

        for(int i =0; i<niz.length;i++){
            System.out.print(niz[i] + ", ");
        }

        System.out.println();
    }

    public static int[] getNiz() {
        int [] niz = new int[] {24,56,78};
        return niz;
    }

    public static int[] okreniNiz(int[] niz) {
        int [] okrenut = new int[niz.length];

        for(int i=0,j=niz.length-1; i<niz.length; i++, j--) {
            okrenut[j]=niz[i];
        }

        return okrenut;


    }
    public static int sumirajElemente(int[]niz){
        int sum=0;
        for(int i =0; i<niz.length;i++){
            sum=sum+niz[i];
        }
        return sum;
    }
    //metoda koja povecava svaki drugi clan array za 1
    public static int [] povecajSvakiDrugiElementNizaZaJedan(int[]niz){
        for(int i=0; i<niz.length; i++) {
            if(i%2==0){
                niz[i]= niz[i+1];
            }
        }
        return niz;
    }
}
