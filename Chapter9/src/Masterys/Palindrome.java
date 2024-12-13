
/*

Program: Palindrome.java          Last Date of this Revision: December 13, 2024

Purpose:  Application that prompts user for a string and then displays a message indicating whether or not the string is palindrome..

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20
 

*/
package Masterys;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner userinput = new Scanner (System.in);
		
		System.out.print("Enter a word: "); // Prompt user for a word
		String userString = userinput.nextLine(); //Save the user input
		
		userString = userString.replaceAll("\\s+", "").toUpperCase(); //Remove all the space in the word and turn the word to uppercase
		char[] lettersInsideString = userString.toCharArray();        
		int length = userString.length();
		char[] lettersPalindrome = new char[length];//Create the new array to contain all the reverse characters.
		
		int lengthofArray = lettersInsideString.length - 1;
		for (int i = 0; i<length; i++ ) {
			lettersPalindrome[i] = lettersInsideString[lengthofArray];
			lengthofArray --;  //Set the characters from the lettersInsideString array into the lettersPalindrome array but in the reverse order
		}
		
		String palindrome = String.valueOf(lettersPalindrome);    //Set the lettersPalindrome array back into the String to compare with the user's input String
		if (userString.equals(palindrome)) {
			System.out.print("Your word is a palindrome. ");     // Print if user word is a palindrome.
		}
		else {
			System.out.print("Your word is not a palindrome. "); // Print if users word is not a palindrome.
		}
	}
}

/* Screen Dump

Enter a word: tacocat
Your word is a palindrome. 

Enter a word: Misha
Your word is not a palindrome. 
 
 */