package Sonstiges;

public class SwitschBeispiele {
    public static void main(String[] args) {
        int grade = 1;
//pozvati metodu
        System.out.println(getGradeText1(grade));
        System.out.println(getGradeText1(1));
        System.out.println(getGradeText1(2));
        System.out.println(getGradeText1(3));
        System.out.println(getGradeText1(4));
        System.out.println(getGradeText1(5));

        System.out.println(getGrade("Outstanding"));
        System.out.println(getGrade("Excellent"));
        System.out.println(getGrade("Acceptable"));
        System.out.println(getGrade("Passing"));
        System.out.println(getGrade("Fail"));

    }
    public static String getGradeText1(int grade) {

        return switch (grade) {
            case 1 ->   "Outstanding";
            case 2 ->  "Excellent";
            case 3 ->  "Acceptable";
            case 4 ->  "Passing";
            case 5 -> "Fail";
            //bei switch braucht man immer ein default
            default ->  null;
        }; //hier braucht man ein Semikolon!
    }
    //oder kürzer
    public static int getGrade(String gradeText) {
        return switch (gradeText) {
            case "Outstanding" -> 1;
            case "Excellent" -> 2;
            case "Acceptable" -> 3;
            case "Passing" -> 4;
            case "Fail" -> 5;
            default -> 0;
        };
    }
}
