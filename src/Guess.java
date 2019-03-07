import java.util.Random;
import java.util.Scanner;

/**
 *  Reads a lucky number number from the user and returns the number plus it returns the
 *  difference between the lucky number and a random number between 1-100.
 */

public class Guess {
    public static void main(String[] args) {

        int luckyNumber;
        int differenceNumber;

        // reads input from the user

        Scanner in = new Scanner(System.in);

        // pick a random number

        Random random = new Random();

        int number = random.nextInt(100) + 1;

        System.out.print("What is your lucky number? ");
        luckyNumber = in.nextInt();
        in.nextLine();
        System.out.println("Your Lucky number is: " + luckyNumber);
        differenceNumber = luckyNumber - number;
        System.out.println("Your difference from the Random number is: " + differenceNumber);
        System.out.println("Random number is: " + number);

    }
}
