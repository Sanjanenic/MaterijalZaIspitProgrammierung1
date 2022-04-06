package RecursionPackage;

public class REcursionZahlenMitArray {
    public static void main(String[] args)
    {
        int[] A = { 0, 0, 0, 0, 1, 1, 1 };

        System.out.println("So viele 1 sind in diese Array: " + countOne(A, 0, A.length - 1));

    }

    // zaehlt die 1er in sortiertem feld
    public static int countOne(int[] array, int left, int right)
    {
        // wenn das letzte element 0 ist dann kann es keine
        // 1 geben da sortiert
        if (array[right] == 0) {
            return 0;
        }

        // wenn das erste element 1 ist dann sind alle elemente
        // 1 in dem Bereich
        if (array[left] == 1) {
            return (right - left + 1);
        }

        // in zwei haelften aufteilen
        int mid = (left + right) / 2;
        return countOne(array, left, mid) + countOne(array, mid + 1, right);
    }
}
