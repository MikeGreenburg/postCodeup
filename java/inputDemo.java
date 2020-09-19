package inputdemo;
inport java.util.Scanner;

public class InputDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //creates the Scanner object and names it input

        System.out.print("Enter an integer: "); //prompts the user for an integer
        int myInt = input.nextInt(); //method to read the integer
        System.out.printf("You entered %d.%n%n", myInt); //displays the users input

        System.out.print("Enter a double: "); //prompts the user for a double
        double myDouble = input.nextDouble(); //method to read the double
        System.out.printf("You entered %.2f.%n%n", myDouble); //displays the users input

        System.out.print("Enter a string: "); //prompts the user for a string
        input.nextLine(); //added because of how the .nextDouble method works. It reads only a double however when the user inputs a number they will press the Enter Key. The Enter Key is essentially a newLine character("\n") and is ignored by the nextDouble() method as it is not a double
        String myString = input.nextLine(); //method to read string
        System.out.printf("You entered \"%s\".%n%n", myString); //displays the users input



    }
}