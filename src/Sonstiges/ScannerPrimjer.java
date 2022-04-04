package Sonstiges;

import java.util.Scanner;

public class ScannerPrimjer {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();

        for (int index = 2; index <=9; index ++){
            x=x*index;
            System.out.println(x);
        }

        for ( int index = 9; index >=2; index --){
            System.out.println(x=x/index);

        }
        sc.close();
    }
}

