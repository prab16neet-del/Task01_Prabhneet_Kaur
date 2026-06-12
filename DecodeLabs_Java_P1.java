import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int targetNumber = random.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("=================================");
        System.out.println("      NUMBER GUESSING GAME   ");
        System.out.println("=================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("Maximum Attempts Allowed: " + maxAttempts);

        while (guess != targetNumber && attempts < maxAttempts) {

            try {
                System.out.println("\nAttempt " + (attempts + 1) + " of " + maxAttempts);
                System.out.print("Enter your guess: ");

                guess = sc.nextInt();
                attempts++;

                if (guess > targetNumber) {
                    System.out.println("Too High! Try Again ");
                }
                else if (guess < targetNumber) {
                    System.out.println("Too Low! Try Again ");
                }
                else {
                    System.out.println("\nCongratulations!");
                    System.out.println("You guessed the correct number!!");
                    System.out.println("Attempts Used: " + attempts);
                }

                System.out.println("Attempts Remaining: " + (maxAttempts - attempts));

            }
            catch (InputMismatchException e) {
                System.out.println(" Please enter a valid number ");
                sc.next();
            }
        }

        if (guess != targetNumber) {
            System.out.println("\nGame Over!");
            System.out.println("You have used all " + maxAttempts + " attempts :( ");
            System.out.println("The correct number was: " + targetNumber);
        }

        sc.close();
    }
}