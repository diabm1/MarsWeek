import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame(){

    }

    public static void main(String[] args) {
        // Display a greeting to the player
        System.out.println("Welcome to the Guessing Game!");

        // Get the player's name and save it to a variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String playerName = scanner.nextLine();

        // Generate a random number
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // Game variables
        int numberOfGuesses = 0;
        int playerGuess;

        // Game loop
        while(true){
            // Prompt the player to guess a number
            System.out.println("Guess a number between 1 and 100");
            if(!scanner.hasNextInt()){
                String badInput = scanner.next();
                System.out.println("That's not an integer, try again!!!");
                continue;
            }
            playerGuess = scanner.nextInt();
            if(playerGuess < 1 || playerGuess > 100){
                System.out.println("Please enter a number between 1 and 100, try again");
                continue;
            }
            numberOfGuesses++;

            // Check if the guess is correct
            if(playerGuess == randomNumber){
                break;
            } else if (playerGuess < randomNumber){
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        // Game over
        System.out.println("Congratulations, " + playerName + "! You guessed the number.");
        System.out.println("Total number of guesses: " + numberOfGuesses);
    }
}
