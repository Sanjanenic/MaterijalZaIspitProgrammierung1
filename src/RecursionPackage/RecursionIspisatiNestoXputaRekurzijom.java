package RecursionPackage;

public class RecursionIspisatiNestoXputaRekurzijom {
    public static void main(String[] args) {
        read(0,3);
        System.out.println("*********************");
        read(6,10);

    }
    public static void read(int from , int until){
        System.out.println("The penguin opened he newspaper, and they read: ");
        from ++;
        if(from <= until){
            read (from, until);
        }
    }
}
