/*

Program: GuessingGame.java          Last Date of this Revision: October 21, 2024

Purpose:  The GuessingGame is a number guessing game played between the computer and one player with an infinite amount of attempts.

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20
 

*/



package Masterys;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int secretNumber = (int) (20 * Math.random() + 1);
        System.out.println("Welcome to the guessing game!");
        
        while (true) {
            System.out.print("Please guess a number between 1 and 20: ");
            int guess = userInput.nextInt();

            if (secretNumber == guess) {
                System.out.println("Correct | You won!");
                break;
            } else {
                System.out.println("Incorrect | Try again.");
            }
        }

    }
}

/* Screen Dump
Welcome to the guessing game!

Please guess a number between 1 and 20: 5
Incorrect | Try again.

Please guess a number between 1 and 20: 6
Incorrect | Try again.

Please guess a number between 1 and 20: 18
Correct | You won!

 
 */
