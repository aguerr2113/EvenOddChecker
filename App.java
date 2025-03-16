import java.util.Scanner;
// import scanner to take in user input

public class App {
    public static void main(String[] args) throws Exception {
        // create a number variable for the function
        int number;
        // ask user to input a number
        System.out.println("Enter a number,and I will see if it is even or odd: ");
        // create a scanner object from user input
        Scanner sc = new Scanner(System.in);
        // save the the scanner object to the variable used in the function
        number = sc.nextInt();

        // create a if else statement to check if number is even or odd using modulo operator
        if (number % 2 == 0) {
            System.out.println("Your number " +number+ " is even");
        } else {
            System.out.println("Your number " +number+ " is odd");
        }

    }
}

