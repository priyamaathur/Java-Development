import java.util.Scanner;
public class RandomNum {
    public static void main(String[] args) {
        // generate no
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        int myNumber = (int)(Math.random() * 100);
        do {
            System.out.println("Guess a number(1-100) :");
            userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println("You guessed it right!");
                break;
            } else if (userNumber < myNumber) {
                System.out.println("Your number is too low. Try again.");
            } else {
                System.out.println("Your number is Large. Try again.");
            }
        } while (userNumber >= 0);
        System.out.println("The number was: " + myNumber);
        System.out.println(myNumber);
    }
    
}
