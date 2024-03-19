package Testing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {


    public static void main(String[] args) {

        // Exceptions - An event that occurs during the execution of a program that disrupts the normal flow of instructions


        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("Result = " + z);
        }
        catch (ArithmeticException e){   // To catch specific exceptions
            System.out.println("You can't divide by 0");
        }

        catch (InputMismatchException e){   // To catch specific exceptions
            System.out.println("Enter only valid numbers");
        }

        catch (Exception e){  // To catch all exceptions
            System.out.println("Something Went Wrong");
        }

        finally {
            System.out.println("This will always print");

            scanner.close(); // Best pratice to always close the scanner
        }

    }
}
