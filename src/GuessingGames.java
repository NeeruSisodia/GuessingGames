import java.util.Scanner;

public class GuessingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "Emma";
        int attempts = 0;
        boolean isCorrect = false;

        do {
            System.out.print("Guess the name: ");
            String userGuess = scanner.nextLine();
            attempts++;
//How to check guess is right. 
            if (userGuess.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Congratulations! You guessed it right.");
                System.out.println("Number of attempts: " + attempts);
                isCorrect = true;
                // If you want to quit the game.
            } else {
                System.out.print("Incorrect guess. Do you want to quit? (yes/no): ");
                String quitChoice = scanner.nextLine().toLowerCase();
//If guess is right print congratulation
                if (quitChoice.equals("yes")) {
                    System.out.println("The correct answer was: " + correctAnswer);
                    break;
                }
            }
        } while (!isCorrect);

        scanner.close();
    }
}


