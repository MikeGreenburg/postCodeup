public class helloworld2 {
    public static void main (String[] args) {
        System.out.println("Hello World 2");

        //Logical Operators

//        write a logical operation that outputs "Welcome!" when only the variable age is greater than 18 and the variable money is greater than 500
        int age = 22;
        int money = 800;

        if (age > 18) {
            if (money > 500){
                System.out.println("Welcome!");
            }
        }

        if (age > 18 && money > 500) {
            System.out.println("Welcome!");
        }
    }
}