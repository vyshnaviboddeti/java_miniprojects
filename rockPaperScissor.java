import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String compChoice;
        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            // Take user input
            System.out.println("Enter your move (rock, paper, scissors):");
            playerChoice = sc.next().toLowerCase();

            // Validate input
            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {

                System.out.println("Invalid choice! Try again.\n");
                continue;
            }

            // Computer choice
            compChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + compChoice);

            // Game logic
            if (playerChoice.equals(compChoice)) {
                System.out.println("It's a tie!");
            }
            else if (
                    (playerChoice.equals("rock") && compChoice.equals("scissors")) ||
                            (playerChoice.equals("paper") && compChoice.equals("rock")) ||
                            (playerChoice.equals("scissors") && compChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose!");
            }

            // Ask to play again
            System.out.println("Do you want to play again? (yes/no):");
            playAgain = sc.next();
            System.out.println();
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}