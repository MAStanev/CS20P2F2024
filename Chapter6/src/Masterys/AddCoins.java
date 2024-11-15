/*

Program: AddCoins.java          Last Date of this Revision: November 15, 2024

Purpose: Prompts the user for the number of pennies, nickels, dimes and quarters, and then displays their total dollar amount.

Author: Misha Stanev
School: CHHS
Course: Computer Programming 20
 

*/




package Masterys;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AddCoins {

    // Method to calculate and display the dollar amount using DecimalFormat
    public static void getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
        // Calculate the total amount in dollars
        double totalAmount = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10) + (quarters * 0.25);
        
        // Create a DecimalFormat object to format the output to 2 decimal places
        DecimalFormat decimalFormat = new DecimalFormat("$0.00");

        // Format the total amount and print it
        System.out.print(decimalFormat.format(totalAmount));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of pennies, nickels, dimes, and quarters
        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();
        
        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();
        
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();
        
        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();
        
        //Do a print statement then call the getDollarAmount method to calculate the total
        System.out.print("Total value: ");
        getDollarAmount(pennies, nickels, dimes, quarters);
    }
}


/* Screen Dump

Enter the number of pennies: 20
Enter the number of nickels: 5
Enter the number of dimes: 3
Enter the number of quarters: 5
Total value: $2.00
 
 
 Enter the number of pennies: 5
Enter the number of nickels: 7
Enter the number of dimes: 4
Enter the number of quarters: 23
Total value: $6.55
 */