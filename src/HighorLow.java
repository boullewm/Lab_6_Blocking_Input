import java.util.Random;
import java.util.Scanner;
public class HighorLow {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner (System.in);
        int number = rand.nextInt(1, 11);
        int guess;
        boolean done = false;
        do {
            System.out.print("Enter a number from 1 to 10: ");
            guess = in.nextInt();
            in.nextLine();
            if (guess == number) {
                done = true;
            }
            else {
                if (guess > number) {
                    System.out.println("Your guess is too big");
                } else {
                    System.out.println("Your guess is too small");
                }
            }
        }while (!done);
        System.out.println("You guessed correctly!");
        System.out.println("The generated number is " + number);


    }
}

