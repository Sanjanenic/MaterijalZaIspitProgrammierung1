package RadSaSadrzajemStringa;

public class PalindromeIstoSaObeStrane {
    public static void main(String[] args) {
        //Was it a car or cat I saw
        //Murder for a jar of red rum
        //Go hang a salami, I´m a lasagna hog.
        //Otto

        //pozivanje metode koja vraca boolen a prima String
        isPalindrome("Anna") ;
        System.out.println(isPalindrome("Was it a car ra cat I saw"));

    }
    //metoda koja poredi elemnte Stringa
    public static boolean isPalindrome(String potentialPalindrome){
        potentialPalindrome = potentialPalindrome.toLowerCase(); //ovo sluzi da eliminise problem Velikog slova na pocetku nekih rijeci
        potentialPalindrome =potentialPalindrome.replace("'", "");  //eliminise ostale znakove koji se pojavljuju
        potentialPalindrome =potentialPalindrome.replace(",", "");
        potentialPalindrome =potentialPalindrome.replace(" ", "");

        char firstLetter = potentialPalindrome.charAt(0);
        char lastLetter = potentialPalindrome.charAt((potentialPalindrome.length()-1));
//sada kada smo definisali nase Char radimo poredjenje u if
        if (firstLetter == lastLetter){
            potentialPalindrome = potentialPalindrome.substring(1,potentialPalindrome.length()-1);  //Substring index ima od 1
            if(potentialPalindrome.length()<=1){
                return true;
            }
            return isPalindrome(potentialPalindrome);
        }
        return false;

    }
}
