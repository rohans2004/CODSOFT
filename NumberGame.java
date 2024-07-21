import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static final int MAX_ATTEMPTS = 10;
    private static final int RANGE_START = 1;
    private static final int RANGE_END = 100;

    private int roundsWon;
    private Scanner scanner;

    public NumberGame() {
        this.roundsWon = 0;
        this.scanner = new Scanner(System.in);
    }

    
    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANGE_END - RANGE_START + 1) + RANGE_START;
    }

    //to start thr game 
    private void playRound() {
        int targetNumber = generateRandomNumber();
        int attemptsLeft = MAX_ATTEMPTS;
        int userGuess = -1;
        
        System.out.println("\nNew Round! Guess the number between " + RANGE_START + " and " + RANGE_END);

        while (attemptsLeft > 0) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                scanner.nextLine(); 

                if (userGuess == targetNumber) {
                    roundsWon++;
                    System.out.println("Congratulations! You guessed the number correctly.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); 
            }
        }

        if (userGuess != targetNumber) {
            System.out.println("Sorry! The correct number was " + targetNumber + ".");
        }
    }

    // starting the round again 
    public void startGame() {
        char playAgain = 'Y';

        while (playAgain == 'Y' || playAgain == 'y') {
            playRound();
            System.out.print("Do you want to play another round? (Y/N): ");
            playAgain = scanner.next().charAt(0);
            scanner.nextLine(); // Consume the newline

            if (playAgain != 'Y' && playAgain != 'y') {
                System.out.println("Thanks for playing! Your score: " + roundsWon + " rounds won.");
                break;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        game.startGame();
    }
}
