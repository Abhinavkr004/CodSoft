import java.util.Scanner;
import java.util.Random;

public class GuessingNumGame {
    //TASK 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            System.out.print("Enter your guess: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number.Try again.");
                scanner.next();

                continue;
            }

            guess = scanner.nextInt();

            if (guess < numberToGuess) {

                System.out.println("Too low! Try again.");

            } else if (guess > numberToGuess) {

                System.out.println("Too high! Try again.");

            } else {

                System.out.println("Congratulations! You guessed the correct number!");
                break;

            }
        }

        scanner.close();
    }
}
