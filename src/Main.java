import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean choice = false;

        do {
            System.out.println("Please, enter your number from 1 to 100.");

            int numberToGuess = generateRandomNumber();
            int inputNumber = 0;

            while (inputNumber != numberToGuess) {
                inputNumber = scan.nextInt();

                if (inputNumber == numberToGuess) {
                    System.out.println("You won!");
                    choice = shouldStartNewGame(scan);
                }

                if (inputNumber < numberToGuess) {
                    System.out.println("Too small!");
                }

                if (inputNumber > numberToGuess) {
                    System.out.println("Too big!");
                }
            }
        } while (choice);
    }

    static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    static boolean shouldStartNewGame(Scanner scan) {
        System.out.println("Do you want to play again? Enter Y to play again!");
        String userChoice = scan.next();
        System.out.println(userChoice);

        return userChoice.equals("Y");
    }
}