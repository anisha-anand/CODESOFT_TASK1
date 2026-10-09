import java.util.Scanner;
import java.util.Random;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        do {
            // Generate random number between 1 and 100
            int number = random.nextInt(100) + 1;

            int attempts = 0;
            int maxAttempts = 7;
            boolean correct = false;

            System.out.println("\n==============================");
            System.out.println("       NUMBER GUESSING GAME");
            System.out.println("==============================");
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts.");

            // Repeat until correct or attempts are over
            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                int guess = sc.nextInt();

                attempts++;

                if (guess == number) {
                    System.out.println("Correct! 🎉");
                    System.out.println("You guessed the number in "
                            + attempts + " attempts.");

                    score++;
                    correct = true;
                    break;
                }
                else if (guess < number) {
                    System.out.println("Too low! Try again.");
                }
                else {
                    System.out.println("Too high! Try again.");
                }

                System.out.println("Attempts remaining: "
                        + (maxAttempts - attempts));
            }

            // If user couldn't guess the number
            if (!correct) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + number);
            }

            // Display score
            System.out.println("Your score: " + score);

            // Ask to play another round
            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nThank you for playing!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}
