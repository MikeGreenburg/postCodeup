package switchDemo;
import java.util.Scanner;

public class SwitchDemo{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: "); //Promts user for input.
        String userGrade = input.nextLine().toUpperCase();//Reads the user input and returns a string in upper case.

        switch (userGrade) {
            case "A+":
            case "A":
                System.out.println("Distinction"); //If grade is A or A+ the output is "Distinction".
                break;
            case "B":
                System.out.println("B Grade"); //If the grade is not A or A+ and not C or Fail and B is entered then "B Grade" is output.
                break;
            case "C":
                System.out.println("C Grade"); //If the grade is not A, A+, B or fail and C is entered then the output is "C Grade".
                break;
            default:
                System.out.println("Fail"); //If all other cases are false and or any other input is put in then the output is "Fail".
                break;
        }

    }
}