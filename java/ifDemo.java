package ifdemo;
import java.util.Scanner;

public class IfDemo{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//sets up to accept user input
        System.out.print("\nPlease enter your age: "); //promts user for age
        int userAge = input.nextInt(); //stores the users input as the variable "userAge"
        if(userAge < 0 || userAge > 100){ //checks the value of userAge is smaller than 0 or greater than 100, if true then it will execute all statements below if not will return messages below
            System.out.println("Invalid Age");
            System.out.print("Age must be between 0 and 100");
        }else if (userAge < 18)
            System.out.println("Sorry you are underage");
        }else if (userAge < 21)
            System.out.println("You need parental consent");
    }else{
        System.out.println("Congratulations!");
        System.out.println("You may sign up for the event!");
        }
    }
}