package RadSaSadrzajemStringa;

import java.util.Arrays;

public class LoockyLooserPoredjenjeStringovaUDvaArray {
    public static void main(String[] args) {

        String namen1[]={"Lara","Sara","Lisa","Liv","Iv" };
        String namen2[]={"Sara","Julia", "Liv","Iva","Mira"};
        System.out.println(Arrays.toString(luckyLooser(namen1, namen2)));

    }

    //metoda prolazi kroz dva niza stringova i poredi elemnte, zatim pravi novi niz od
    //elemenata koje je nasla u oba niza
    public static String[] luckyLooser(String[] first, String[] second) {
        String[] erg = new String[first.length > second.length ? first.length : second.length];  //brzi nacin za if
        int nextIdx = 0;
        for (int i = 0; i < first.length; ++i) {
            for (int j = 0; j < second.length; ++j) {
                if (first[i].equals(second[j])) {
                    erg[nextIdx++] = first[i];
                    break;
                }
            }
        }
        return erg;
    }
}
