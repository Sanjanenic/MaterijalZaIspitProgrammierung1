package RadSaSadrzajemStringa;

public class SvakaRijecVelikimSlovomString {
    public static void main(String[] args) {

        String satz1 = " wie geht es dir?";
        String satz2 = " gut danke";
//poziv metode
        System.out.println(woerterMitGroesseBuchstaben(satz1));
        System.out.println(woerterMitGroesseBuchstaben(satz2));

    }
    public static String woerterMitGroesseBuchstaben ( String satz){
        String erg= " ";
        //for se krece kroz string "niz char-ova
        for ( int i=0; i< satz.length(); i++){
           //if provjerava koje je slovo prvo u rijeci
            if ( satz.charAt(i)== ' '){
                erg = erg+ " "+ Character.toUpperCase( satz.charAt(i+1));
                i++;

            }else {
                erg = erg + satz.charAt(i);
            }
        }
        return erg;
    }
}
