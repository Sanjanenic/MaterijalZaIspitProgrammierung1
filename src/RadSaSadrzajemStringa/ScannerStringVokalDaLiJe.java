package RadSaSadrzajemStringa;

import java.util.Scanner;

public class ScannerStringVokalDaLiJe {
    public static void main(String[] args) {
        CheckLetter() ;

    }
    public static void CheckLetter() {
        String letter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an letter!");

        do{
            letter = sc.nextLine();

            if(letter.equals("0")){
                break;
            }
            String a = "a";
            String e = "e";
            String u = "u";
            String o = "o";
            String in = "i";

            if (letter.equals(a) || letter.equals(e) || letter.equals(u) || letter.equals(o) || letter.equals(in)) {
                System.out.println("It is a vowel!");
            }
            else{
                System.out.println("It is a consonant!");
            }
        }
        while (true);  //semikolon hier bei do while, ovo tue znaci radi beskonacno

        sc.close();
    }
}


