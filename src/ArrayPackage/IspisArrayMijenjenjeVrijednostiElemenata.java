package ArrayPackage;

import java.util.Arrays;

public class IspisArrayMijenjenjeVrijednostiElemenata {
    public static void main(String[] args) {

        String[] quartale ={"Frühling","Sommer","Herbst" , "Winter"};

        String hilfe= quartale[0];                      //pomocna varijabla za ispis vrijednosti nekog elementa u array
        System.out.println(Arrays.toString(quartale));  //fino ispisivanje array quartale
        System.out.println(hilfe);                      //ispisati jedan element iz niza

        quartale[0]="Frueling";                         //ovako mijenjam jedan element u array
        System.out.println(Arrays.toString(quartale));
        System.out.println(hilfe);

    }
}


