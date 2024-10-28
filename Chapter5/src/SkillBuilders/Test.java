package SkillBuilders;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
    int secretNumber = (int) (20 * Math.random() + 1);
    System.out.println("Welcome to the guessing game!");
    
    System.out.print("Please guess a number between 1 and 20: ");
    int guess = userInput.nextInt();    
    
    while (secretNumber != guess) {
        

        if (secretNumber == guess) {
            System.out.println("Correct | You won!");
            break;
        } else {
            System.out.println("Incorrect | Try again.");
        }
    }

}
}