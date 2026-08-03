import java.util.Random;
import java.util.Scanner;


public class GuessNumber {


    public class NumberGuessingGame {

        public static void main(String[] args) {

            Random random = new Random();
            Scanner sc = new Scanner(System.in);

            int secretNumber = random.nextInt(100) + 1; // Random number between 1-100
            int guess;
            int attempts = 0;

            System.out.println("=================================");
            System.out.println("   NUMBER GUESSING GAME");
            System.out.println("=================================");
            System.out.println("Guess a number between 1 and 100.");

            while (true) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > secretNumber) {
                    System.out.println(" Too High!");
                }
                else if (guess < secretNumber) {
                    System.out.println(" Too Low!");
                }
                else {
                    System.out.println("\n Congratulations!");
                    System.out.println("You guessed the correct number: " + secretNumber);
                    System.out.println("Attempts: " + attempts);
                    break;
                }
            }

            sc.close();
        }
    }
}
