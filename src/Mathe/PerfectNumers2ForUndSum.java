package Mathe;

public class PerfectNumers2ForUndSum {
    public static void main(String[] args) {
        perfectNumber(110);

    }
    public static void perfectNumber(int numberRange){
        for (int number=1; number <= numberRange; number++){
            int sum = 0;
            for(int i =1; i<=number/2; i++){ //dijeli sa 2 jer je broj djeljiv sa pola sebe kao najveci djelilac
                if(number%i ==0){
                    sum= sum+ i;
                }
            }
            if(sum ==number){

                System.out.println(number +" is a perfect number!");
            }
        }
    }

}
/*Perfect numbers are the sum of their true divisors, such as 6 = 1 + 2 + 3 or 28 = 1 + 2 + 4 + 7 + 14. The next perfect numbers are 496, 8128, 33550336, 8589869056, 137438691328, and 2305843008139952128.
Write an algorithm that prints all perfect numbers up to 100,000,000 (i.e., 6, 28, 496, 8128, 33550336) to the console.*/


