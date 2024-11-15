package SkillBuilders;

import java.util.Scanner;

public class SpanishNumbers {

	public static void Spanish() {


// Create Spanish() method to ask user which number should be looped in spanish		
		
System.out.println("Enter the number for which word you want to be looped");	
System.out.println("1. Uno     6. Seis");	
System.out.println("2. Dos     7. Siete  ");	
System.out.println("3. Tres    8. Ocho");	
System.out.println("4. Cuatro  9. Nueve");
System.out.println("5. Sinco   10. Diez");



}

public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
	Spanish(); // Call on Spanish() method
	System.out.print("Number: ");
	int spanishNumber = userInput.nextInt(); // Save user input as spanishNumber
	

	
	switch (spanishNumber) { // Create switch statement that will output spanish number 10x depending on which number user entered
    case 1: 
    	for (int i =0; i<10; i++) {
    		System.out.println("Uno");
    	}
    	break;
    case 2:
    	for (int i =0; i<10; i++) {
		System.out.println("Dos");
	}
	break;
    case 3: for (int i =0; i<10; i++) {
		System.out.println("Tres");
	}
	break;
    case 4: for (int i =0; i<10; i++) {
		System.out.println("Cuatro");
	}
	break;
    case 5: for (int i =0; i<10; i++) {
		System.out.println("Sinco");
	}
	break;
    case 6: for (int i =0; i<10; i++) {
		System.out.println("Seis");
	}
	break;
    case 7: for (int i =0; i<10; i++) {
		System.out.println("Siete");
	}
	break;
    case 8: for (int i =0; i<10; i++) {
		System.out.println("Ocho");
	}
	break;
    case 9: for (int i =0; i<10; i++) {
		System.out.println("Nueve");
	}
	break;
    case 10: for (int i =0; i<10; i++) {
		System.out.println("Diez");
	}
	break;

	default:
		System.out.print(" Invalid input | Enter a number 1-10");

     


	}
	
}
}