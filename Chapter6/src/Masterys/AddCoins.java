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
