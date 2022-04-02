package ArrayPackage;

import java.util.Arrays;

public class GrundsteuerAPP {
    public static void main(String[] args) {
        int [][] test = {{1, 10, 1},{3, 2, 5},{2, 1, 4}};
        int []owner = {0, 24, 24};
        Grundsteuer steuer = new Grundsteuer();

        System.out.println(steuer.grundsteuerBerechnen(test));

        System.out.println(Arrays.toString(steuer.grundsteuerZuordnen(test, owner)));
    }
}
