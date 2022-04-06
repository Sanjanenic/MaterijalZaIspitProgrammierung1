package Sonstiges;

public class LeapYearBedinungenForSchleife {
    public static void main(String[] args) {

        for( int i = 1; i<=2100; i++){
            isLeapYear(i) ;
        }

    }
    public static void isLeapYear(int year){
        if(year%4==0 && year%100==0 && year%400!=0 ){
            System.out.println(year + " is not a leap year!");

        }
        else if (year%4==0 && year%400==0 || year%4==0 ){
            System.out.println(year + " is a leap year!");

        }
        else{
            System.out.println(year + " not leap yer");
        }
    }
}

/*public static void isLeapYear(int year){…}
This method checks whether a value is a leap year. If the value is divisible by 4, then it is a leap year, unless the value is also divisible by 100. However, year values that are divisible by 400 are leap years. If it is a leap year, the following should be printed to the console: "1992 is a leap year".
Example:
1996 => leap year (divisible by 4)
1900 => not a leap year (divisible by 4 but also by 100 and not by 400)
2000 => leap year (divisible by 4 and 400)
Write a loop in the Main method, which runs from 1 to 2100. Call the created method here in each case.
*/