package helloworld;

import java.text.MessageFormat;
import java.util.Arrays;

public class HelloWorld {

    public static void main(String [] args) {
        //Print the words Hello World on the screen
        System.out.println("Hello World");

        int myLength = "Hello World".length();
        System.out.println(myLength);
        //Returns 11

        //      STRINGS

        String uCase = "Hello World".toUpperCase();
        //Returns "HELLO WORLD"

        String firstSubstring = "Hello World".substring(6);
        //Returns "World"

        String message = "Hellow World";
        String secondSubstring = message.substring(1, 8);
        //Returns "ello Wo"

        char myChar = "Hello World".charAt(1);
        //Returns "e"

        boolean equalsOrNot = "This is Jamie".equals("This is Jamie");
        //Returns true

        boolean equalsOrNot2 = "This is Jamie".equals("Hello World");
        //Returns false


        //      ARRAYS

        String names = "Peter, John, Andy, David";
        String[] splitNames = names.split(", ");
        //Returns {"Peter", "John", "Andy", "David"}

        //2 ways to declare a variable preferred
        //First part "int" determines what value is stored, Second part "[]" determines that it will be an array, Third part "userAge" is the arrays name.
        int[] userAge1;

        //This was adopted for C/C++ programmers not preferred
//        int userAge2[];

        //First statement declares the array variable userAge
        int[] userAge;
        //The second statement creates the array {21, 22, 23, 24, 25} and assigns it to userAge
        userAge = new int[] {21, 22, 23, 24, 25};

        //Combine two statements into a single statement using this shortcut
        int[] userAge2 = new int[] {21, 22, 23, 24, 25};

        //Simplified you can declare and initialize an array in the same statement and omit "new int[]"
        int[] userAge2 = {21, 22, 23, 24, 25};

        //Third way to declare and initialize an array default values are (0, 0, 0, 0, 0,)
        int[] userAge3 = new int[5];

        //Update array integers as follows this changes the array to {31, 22, 23, 24, 25}
        userAge[0] = 31;

        //If we type the following the array becomes {31, 22, 43, 24, 25}
        userAge[2] = userAge[2] + 20;
    }

    //        ARRAY METHODS

    //In order to use array methods we need the following and must appear after the package statement and before the class declaration
    import java.util.Arrays;


    //Example
//    package helloworld;
//
//    import java.util.Arrays;
//
//    public class HelloWorld {
    //code for HelloWorld class
//    }

    //equals() is used to determine if two arrays are equal to each other and returns true or false
    int[] arr1 = {0, 2, 4, 6, 8, 10};
    int[] arr2 = {0, 2, 4, 6, 8, 10};
    int[] arr3 = {10, 8, 6, 4, 2, 0};

    boolean result1 = Arrays.equals(arr1, arr2); //returns true
    boolean result2 = Arrays.equals(arr1, arr3); //returns false because elements are not arranged the same

    //copyOfRanged() allows you to copy the contents of one array into another and requires three arguments
    int[] source = {12, 1, 5, -2, 16, 14, 18, 20, 25};

    //To copy contents use the first argument "source" is the array that provides the values to be copied. The next two arguments tell the compiler which indexes to start and stop copying. Returns {-2, 16, 14, 18} while "source" remains unchanged.
    int[] dest = Arrays.copyOfRange(source, 3, 7);

    //toString returns a String that represents the contents of an array.
    int[] numbers = { 1, 2, 3, 4, 5};

    //use below to display contents of the numbers array
    System.out.println(Arrays.toString(numbers));
    //Returns [1, 2, 3, 4, 5]

    //sort() allows for arrays to be sorted. It takes in an array as the argument
    int[] numbers2 = {12, 1, 5, -2, 16, 14};

    //below will sort the array in ascending order

    Arrays.sort(numbers2);

    System.out.println(Arrays.toString(numbers2));
    //Returns {-2, 1, 5, 12, 14, 16}


    //binarySearch() allows you to search for a specific value in a sorted array
    int[] myInt = {21, 23, 34, 45, 56, 78, 99};

    //to determine if 78 is in the array use the following
    int foundIndex = Arrays.binarySearch(myInt, 78);
    //foundIndex will return 5

    int foundIndex2 = Arrays.binarySearch(myInt, 39);
    //foundIndex will return -4 the "-" means that 39 is not found and the 4 tells you where it should exist in the array and adds one to that result, 3+1 = 4..

    //      FINDING ARRAY LENGTH

    int[] userAge = {21, 22, 26, 32, 40};

    userAge.length; //returns 5 because there are 5 ages in the array

    //     DISPLAYING OUTPUT

    System.out.ptintln("Hello ");
    //Returns "Hello"

    System.out.println("How are yout?");
    //Returns "Hello
    //How are you?

    System.out.print("Hello");
    System.out.print("How are you?");
    //Returns "Hello How are you?"

    //Displaying simple text

    System.out.println("Hi, my name is Jamie");
    //Returns "Hi, my name is Jamie

    //Displaying the value of a variable
    int number = 30;

    System.out.println(number);
    //Returns 30
    //If number is written ("number") output will be number since it is in string form

    //Displaying results without assigning them to variables
    System.out.println(35+5);
    //Returns 35
    //To display the result method use
    System.out.println("Oracle".substring(1, 4));
    //Retuns "rac" as 1 tells it to start at this index and it stops at index 4 but does not include it.

    //Using Concatenation sign
    System.out.println("Hello, " + "how are you?" + " I love Java.");
    //Returns "Hello, how are you? I love Java."

    //Concatenate strings with variables
    int results = 79;
    System.out.println("You scored " + results + " marks for your test.");
    //Returns "You scored 79 marks for your test."

    //Concatenate strings with mathematical expressions
    System.out.println("The sum of 50 and 2 is " + (50 + 2) + ".");
    //Returns The sum of 50 and 2 is 52 the () with the "50 + 2" forces the compiler to evaluate the expression first to avoid errors.

    //    ESCAPE SEQUENCES

    //Use \ as the escape character to print characters that would otherwise have different meanings
    System.out.println("Hello\tWorld");
    //Returns "Hello     World" with a tab or 5 spaces inbetween them.

    //Print a new line (\n)
    System.out.println("Hello\nWorld");
    //Returns "Hello
    //World"

    //Print \ character (\\)
    System.out.println("\\");
    //Returns \

    //Print double quotes (\")
    System.out.println("I am 5'9\" tall");
    //Returns I am 5 '9" tall


    //     FORMATTING OUTPUTS

    System.out.println("The answer for 5.45 divided by 3 is " + (5.45/3));
    //Returns The answer for 5.45 divided by 3 is 1.8166666666666667
    //So instead use printf

    System.out.printf("The answer for %.3f divided by %d is %.2f.", 5.45, 3, 5.45/3);
    //Returns The answer for 5.450 divided by 3 is 1.82. I passed four arguments but only one is needed.
    //The f in %.3f represents a float
    //The d in %d represents a double
    //The first %.3f is replaced by the first argument that is 5.45. The 3 in %.3f represents the 3 decimal points (.450)
    //The second %d is replaced by the second argument 3
    //The third %.2f is represented by the answer. The 2 in %.2f represents the 2 decimal points (.82)

    //     CONVERTERS

    //Integer converter d
    //Used for formatting integers
    System.out.printf("%d", 12);
    //Returns 12

    System.out.printf("%d", 12.9);
    //Returns an error as 12.9 is not an integer

    System.out.printf("%f", 12);
    //Returns an error as 12 is not a floating point number

    //Newline converter n
    System.out.printf("%d%n%d", 12, 3);
    //Returns 12
    //3

    //The width flag
    //Is used to specify total width
    System.out.printf("%8d", 12);
    //Returns       12 with 6 spaces in front of the 12 to give it a total width of 8

    System.out.printf("%8.2f", 12.4);
    //Returns    12.40 with 3 spaces in front of the 12.40 for a total width of 8 including the decimal point

    //Thousands separator flag (,)
    //Used to display numbers with a thousands separator
    System.out.printf("%,d", 12345);
    //Returns 12,345

    System.out.printf("%,.2f", 12345.56789);
    //Returns 12,345.57


    //     ACCEPTING USER INPUT
    //To accept user input use the following
    import java.util.Scanner

    //Create the "Scanner" object and pass "System.in" as an argument
    //"System.in" tells the compiler that you want to get input from the standard input device
    Scanner reader = new Scanner(System.in);

    //The Scanner class contains some methods that can be used to read input from the user to include "nextInt()", "nextDouble()", "nextLine()", for reading "int", "double", and "String" data types.


    //     CONTROL FLOW STATEMENTS
    //  COMPARISON OPERATORS

    //Not equal (!=)
    //Returns true if the left is not equal to the right
    5 != 2 is true
    6 != 6 is false

    //Greater than (>)
    //Returns true if the left is greater than the right
    5 > 2 is true
    3 > 6 is false

    //Smaller than (<)
    //Returns true if the left is smaller than the right
    1 < 7 is true
    9 < 6 is false

    //Greater than or equal to (>=)
    //Returns true if the left is greater than or equal to the right
    5 >= 2 is true
    5 >= 5 is true
    3 >= 6 is false

    //Smaller than or equal to (<=)
    //Returns true if the left is smaller than or equal to the right
    5 <= 7 is true
    7 <= 7 is true
    9 <= 6 is false

    //The AND operator (&&)
    //Returns true if all conditions are met
    5==5 && 2>1 && 3!=7 is true
    5==5 && 2<1 && 3!=7 is false as the second condition is (2<1) false

    //The OR operator (||)
    //Returns true if at least on condition is met
    5==5 || 2<1 || 3==7 is true as the first condition (5==5) is true
    5==6 || 2<1 || 3==7 is false as all conditions are false

    //    DECISION MAKING STATEMENTS

    //    IF STATEMENTS

    if(Condition 1 is met){ //tests first conditions
        do Task A //if condition is met everything inside these {} are executed if not then it moves on to else if statement below
    }else if(Conditione 2 is met){ //tests second condition
        do Task B
    }else if(Condition 3 is met){ //tests third condition
        do Task C
    }else{ //tests the last condition if none of the other conditions are met and executes the Task
        do Task D
    }

    //    TERNARY OPERATOR
    //The ternary operator (?) is a simpler form of an if statement
    //Ex: contition ? value to return if condition is true :
    //Value to return if condition is false;

    3>2 ? 10 : 5;
    //Returns the value 10 since 3 is greater than 2 (the condition 3 > 2 is true)

    int myNum = 3>2 ? 10 : 5;
    //myNum will be assigned to the value 10

    //    SWITCH STATEMENTS
    //Works similar to an if statement except it does not work with a range of values.
    //A "switch" statement requires each case to be based on a single value.

    switch (variable used for switching){
        case firstCase:
            do A;
            break;

        case secondCase:
            do B;
            break;

        default:
            do C;
            break;
    }

    //     LOOPING STATEMENTS
    //Four common Looping statements are "for" loop, the enhanced "for" loop, "while" loop, and the "do-while" loop.

    //The for loop syntax is below
    for(initial value; test condition; modification to value){
        //Do some task
    }

    for(int i = 0; i < 5; i++){ //The first part declares and initializes  an int variable i to zero, this variable serves as a loop counter.
        System.out.println(i); //The second part  tests if i is less than 5, if it is the statement inside the "{}" will be executed.
    }//After executing the "System.out.println(i)" statement, the program returns to the last segment in Line 351. i++ increments the value of i by 1

    int[] myNumbers = {10, 20, 30, 40, 50};

    for(int i = 0; i < myNumbers.length; i++){
        System.out.println(myNumbers[i]);//As myNumbers.length is equal to 5.
    }

    //      ENHANCED FOR STATEMENT
    //Used working with  arrays and Collections. Used if you want to get information from an array without makeing any changes to it.

    //Syntax for an enhanced for statement is:
    for(variable declaration : name of array){

    }

    for(int item : myNumbers)//Loops through the myNumbers array and assigns the item variable a different number based on the loop and the array index sequence.
        System.out.println(item);//Each time this line is run it prints out the the number assigned to item until all elements in the array have been printed.
    //In the code above, we declared an int variable item that is used for looping.

    //     WHILE STATEMENT
    //Executes instructions inside the loop while a certain condition remains valid.

    //Syntax for While statement is:
    while(condition is true){
        //Do A
    }

    //Most of the time when using a while statment, a variable declaration is needed for a loop counter.
    int counter = 5;

    while(counter > 0){
        System.out.println("Counter = " + counter);
        counter = counter - 1;//Decreases the counter by 1 each time the loop is run. This is needed so that line 384 eventually becomes false
    }
    //If you run the code you will get
    //Counter = 5
    //Counter = 4
    //Counter = 3
    //Counter = 2
    //Counter = 1

    //     DO-WHILE STATEMENT
    //Is similar to the while statement with one main difference. The code within the {} of a do-while statement is executed at least once

    int counter = 100;

    do{
        System.out.println("Counter = " + counter);//After this statement the counter is incremented by 1
        counter++;
    }while (counter < 0);

    //Will return counter = 100;

    //      BRANCHING STATEMENTS
    //Instructs the program to branch to another line of code. Branching statements are commonly use in loops and other control flow statements.

    //      Break Statement
    //The first branching statement is the break statement.

    for(int i = 0; i < 5; i++){
        System.out.println("i = " + i);
        if(i == 2)
            break;
    }//Returns i = 0
    //i = 1
    //i = 2 because of the break statement if not it would run to i = 3, i = 4, i = 5.

    //      CONTINUE STATEMENT
    //We use continue, the rest of the loop after the word is skipped for that iteration.

    for(int i = 0; i < 5; i++){
        System.out.println("i = " + i);
        if(i == 2)
            continue;
        System.out.println("I will not be printed if  i = 2.");
    }
    //Returns i = 0
    //I will not be printed if i = 2.
    //i = 1
    //I will not be printed if i = 2.
    //i = 2
    //i = 3
    //I will not be printed if i = 2.
    //i = 4
    //I will not be printed if i = 2.

    //     EXCEPTION HANDLING
    //Used to control the flow of a program when an error occurs using "try-catch-finally" statement
    //Syntax for try-catch-finally statement
    try{
        do something
    }
    catch(type of error){
       do something eles when an error occurs
    }
    finally{
        do this regardless of whether the try or catch condition is met.
    }

    //     OBJECT ORIENTED PROGRAMMING
    //Programming that breaks a programming problem into objects that interact with each other

    //Writing our own class syntax
    AccessModifier class ClassName {
        //Contents of the class
        //including fields, constructors and methods
    }
    //An example is :
        public class ManagementStaff{//class can either be public or package-private

    }
    //Public means the class can be accessed by any class in the program
    //Package-private means the class is only accessible to other classes within the same package.
    //There can be more than one package in a Java aplication.
    //Private is the default access level

    //     Fields / Encapsulation
    //1st we declare the fields for our "Staff" class
    public class Staff{
        private String nameOfStaff;//Field (nameOfStaff), Setting to private is also known as encapsulation
        private final int hourlyRate = 30;//Field (hourlyRate)
        private int hoursWorked;//Field (hoursWorked)
    }//Encapsulation enables us to hide data and brhaviour from other classes.

    //     Methods
    //Code block that performs a certain task

    public void printMessage(){//Method is declared as "public void printMessage"
        System.out.println("Calculating Pay...");
    }
}
