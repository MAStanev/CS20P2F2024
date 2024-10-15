package Mastery;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
		int secretNumber = (int)(20 * Math.random() + 1);
		
		
System.out.println("Welcome to The Guessing Game!");
System.out.print("Guess a number 1-20: ");
int userGuess = userInput.nextInt();

System.out.println("Computer's Number: " + secretNumber);
System.out.println("Player's Number: " + userGuess);


if (secretNumber == userGuess) {
	System.out.print("Congratulations, you won!");
}
else {
	System.out.print("Better luck next time.");
}

	}

}
