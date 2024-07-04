package javapackage;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 0 and 99. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts!");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}

