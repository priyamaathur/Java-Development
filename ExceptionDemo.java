//Exception handling - a mechanism to handle runtime errors, ensuring the normal flow of the application.
import java.io.IOException;
import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        //1. try-catch block
        int[] marks = {97, 98, 95, };
        try {
        System.out.println(marks[5]); //ArrayIndexOutOfBoundsException
        } catch(Exception exception ) {
            System.out.println("An error occurred: " + exception);
        
        }
        System.out.println("The name is Priys");

        //2. multiple catch blocks
        try {
            int a = 10 / 0; //ArithmeticException
            System.out.println(marks[5]); //ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        } catch (Exception e) {
            System.out.println("Some other error: " + e);

            //3. finally block
        } finally {
            System.out.println("This block is always executed.");

            //4. throw keyword
            try {
                throw new IOException("This is a custom IO exception");
            } catch (IOException e) {
                System.out.println("Caught the exception: " + e.getMessage());
            }

            //5. throws keyword
            try {
                readFile();
            } catch (IOException e) {
                System.out.println("Handled exception from readFile: " + e.getMessage());
            }

            //6. custom exception
            try {
                validateAge(15);
            } catch (InvalidAgeException e) {
                System.out.println("Custom exception caught: " + e.getMessage());
            }
        
        }

    }
    
