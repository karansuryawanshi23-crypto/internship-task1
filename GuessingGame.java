import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int guess, attempts = 0;

        System.out.println("Guess the number between 1 and 100");

        do {
            guess = sc.nextInt();
            attempts++;

            if (guess > number)
                System.out.println("Too High!");
            else if (guess < number)
                System.out.println("Too Low!");
            else
                System.out.println("Correct! Attempts: " + attempts);

        } while (guess != number);
    }
}
