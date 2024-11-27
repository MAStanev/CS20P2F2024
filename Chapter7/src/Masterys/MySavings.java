
/*

Program: MySavings.java          Last Date of this Revision: November 27, 2024

Purpose: An application that uses nested for loops to output a table that displays number in 
 multiples of ten.

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20
 

*/

package Masterys;

import java.util.*;
import java.text.DecimalFormat;

public class MySavings {

    private double total;
    private int penny, nickel, dime, quarter; // Create instance variables

    public MySavings() { // Default constructor
        total = 0; // Default amount of money
    }

    public MySavings(int penny, int nickel, int dime, int quarter) {
        total = (penny * 0.01) + (nickel * 0.05) + (dime * 0.1) + (quarter * 0.25); // Value of each coin
    }

    public void setTotal() { // Method to update the total value based on coin counts
        total = penny * 0.01 + nickel * 0.05 + dime * 0.1 + quarter * 0.25;
    }

    public void setPenny(int p) { // Method to add pennies to savings
        penny += p;
    }

    public void setNickel(int n) { // Method to add nickels to savings
        nickel += n;
    }

    public void setDime(int d) { // Method to add dimes to savings
        dime += d;
    }

    public void setQuarter(int q) { // Method to add quarters to savings
        quarter += q;
    }

    public double getTotal() { // Method to retrieve total savings
        return total;
    }

    public boolean TakeMoney(double TOMoney) { // Method to withdraw money
        if (TOMoney <= total) {
            total -= TOMoney;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) { // Main method where program begins
        Scanner userinput = new Scanner(System.in);
        MySavings Bank = new MySavings();
        DecimalFormat decimalFormat = new DecimalFormat("$0.00"); // Format numbers

        int userChoice; // Variable to store users choice

        do { // Display available options
            System.out.println("1. Show bank balance.");
            System.out.println("2. Add pennies.");
            System.out.println("3. Add nickels.");
            System.out.println("4. Add dimes.");
            System.out.println("5. Add quarters.");
            System.out.println("6. Withdraw money.");
            System.out.println("Enter 0 to quit.");
            System.out.print("Enter your choice: ");
            userChoice = userinput.nextInt();

            switch (userChoice) { // Switch statement to handle different user options
                case 1: { // Case 1 - Show bank balance
                    Bank.setTotal();
                    System.out.println("Bank balance: " + decimalFormat.format(Bank.getTotal()));
                    System.out.println(" ");
                    break;
                }

                case 2: { // Case 2 - Add pennies
                    System.out.print("Enter amount of pennies: ");
                    Bank.setPenny(userinput.nextInt());
                    System.out.println(" ");
                    break;
                }

                case 3: { // Case 3 - Add nickels
                    System.out.print("Enter amount of nickels: ");
                    Bank.setNickel(userinput.nextInt());
                    System.out.println(" ");
                    break;
                }

                case 4: { // Case 4 - Add dimes
                    System.out.print("Enter amount of dimes: ");
                    Bank.setDime(userinput.nextInt());
                    System.out.println(" ");
                    break;
                }

                case 5: { // Case 5 - Add quarters
                    System.out.print("Enter amount of quarters: ");
                    Bank.setQuarter(userinput.nextInt());
                    System.out.println(" ");
                    break;
                }

                case 6: { // Case 6 - Withdraw money
                    System.out.print("Enter the amount of money you want to withdraw: $");
                    double MoneyTakeOut = userinput.nextDouble();
                    if (Bank.TakeMoney(MoneyTakeOut)) {
                        System.out.println("Remaining bank balance: $" + decimalFormat.format(Bank.getTotal()));
                   }
                   
                    else { // Prints if user amount user is withdrawing > bank balance
                        System.out.println("Invalid input | Insufficient balance.");
                    }
                    System.out.println(" ");
                    break;
                }

                default: { // Default case to handle invalid input
                    System.out.println("Invalid input | Please try again.");
                    break;
                }
            }

        } while (userChoice != 0);

        System.out.println("Thank you for using."); // End of program
    }
}

/* Screen Dump

1. Show bank balance.
2. Add pennies.
3. Add nickels.
4. Add dimes.
5. Add quarters.
6. Withdraw money.
Enter 0 to quit.
Enter your choice: 5
Enter amount of quarters: 100
 
1. Show bank balance.
2. Add pennies.
3. Add nickels.
4. Add dimes.
5. Add quarters.
6. Withdraw money.
Enter 0 to quit.
Enter your choice: 1
Bank balance: $25.00
 
 
 */

