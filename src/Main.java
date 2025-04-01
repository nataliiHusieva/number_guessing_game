import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please, enter your number from 1 to 100.");

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();

        if (inputNumber == numberToGuess) {
            System.out.println("You won!");
        }

        if (inputNumber < numberToGuess) {
            System.out.println("Too small!");
        }

        if (inputNumber > numberToGuess) {
            System.out.println("Too big!");
        }
    }
}