package errordemo;
import java.util.Scanner;

public class ErrorDemo{
    public static void main(String[] args){
        int num, deno;

        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Please enter the numerator: ");
            num = input.nextInt();

            System.out.print("Please enter the denominator: ");
            deno - input.netInt();

            System.out.println("The result is " + num/deno);
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("---- End of Error Handling Example ----");
        }
    }
}//If you run the code and enter 12 and 4 you will get the message "The result is 3 ---- End of Error Handiling Example ----"
//If you run the program again and enter 12 and 0 you will get "/ by zero ---- End of Error Handling Example ----"