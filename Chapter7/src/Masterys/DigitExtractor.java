package Masterys;

import java.util.*;

public class DigitExtractor {
    private int number, wholeNumber, ones, tens, hundreds; // Declare variables

    public DigitExtractor() {
        number = 0; // Default number is 0
    }

    public DigitExtractor(int Num) {
        number = Num; // Initialize num with the given value
    }

    public void setNumber(int Num) {
        number = Num; // Set the number
    }

    public int getNumber() {
        return number;
    }

    public int getOnes() { // Calculate the ones place value
        ones = number % 10; 
        return ones;
    }

    public int getTens() { // Calculate the tens place value
        int NumNOne = (number - ones) / 10;
        tens = NumNOne % 10; 
        return tens;
    }

    public int getHundreds() { // Calculate the hundreds place value
        int NumNOne = (number - ones) / 10;
        hundreds = (NumNOne - tens) / 10; 
        return hundreds;
    }

    public static void main(String[] args) { // Main method where program begins
        Scanner userinput = new Scanner(System.in); // Scanner object for storing user input
        DigitExtractor NUM = new DigitExtractor(); // Create instance of DigitExtractor
        String userChoice; // Variable for user input
        String quit; // Variable for quit

        do {
            System.out.print("Enter a three digit number: "); // Prompt user to enter number
            NUM.setNumber(userinput.nextInt());

            
            // Display options for user to choose from
            System.out.println("Print (W)hole number: ");
            System.out.println("Print (O)nes place number. ");
            System.out.println("Print (T)ens place number. ");
            System.out.println("Print (H)undreds place number.");
            System.out.println("(Q)uit");
            System.out.print("Enter your choice: ");
            userChoice = userinput.next(); // Save user input to userChoice

            String whole = "Ww";
            String one = "Oo";
            String ten = "Tt";
            String hundred = "Hh";
            quit = "Qq";

            
            // Perform action depending on userChoice
            if (whole.contains(userChoice)) {
                System.out.println("The whole number is: " + NUM.getNumber()); // Prints whole number
                System.out.println("");
            } else if (one.contains(userChoice)) {
                System.out.println("The ones place is: " + NUM.getOnes()); // Prints ones place
                System.out.println("");
            } else if (ten.contains(userChoice)) {
                System.out.println("The tens place is: " + NUM.getTens()); // Prints tens place
                System.out.println("");
            } else if (hundred.contains(userChoice)) {
                System.out.println("The hundreds place is: " + NUM.getHundreds()); // Prints hundreds place
                System.out.println("");
            } else 
            	System.out.println("Invalid input"); // Handles if user inputs invalid character

        } while (!quit.contains(userChoice)); // repeat until user chooses to quit
        
        System.out.print("End of program."); // Prints when program ends
    }
}
