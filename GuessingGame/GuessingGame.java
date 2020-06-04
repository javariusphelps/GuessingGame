package GuessingGame;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        final int randomNum = createRandomNumber();
        int userGuess = getUserGuess();
        boolean winCondition = false;

        if (randomNum == userGuess) {
            winCondition = true;
        }

    }

    public static final int createRandomNumber() {
        return (int) (Math.random() * 100 + 1);
        // Have to typecast to int because Math.random() returns a double between 0.0
        // and 1.0
    }

    public static int getUserGuess() {
        System.out.println("Guess a number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        return guess;
    }

    public int getUserGuess(int i) {
        System.out.println("Guess a number between 1 and 100");
        int guess = i;
        return guess;
    }
}