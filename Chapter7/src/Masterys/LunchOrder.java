/*

Program: LunchOrder.java          Last Date of this Revision: December 4, 2024

Purpose:  A application that prompts the user for the number of hamburgers, salads, french fries, and sodas and then displays the total of the order.

Author: Misha Stanev
School: CHHS
Course: Computer Programming 20
 

*/


package Masterys;

import java.util.*;  // Importing the Scanner class for user input
import java.text.DecimalFormat;  // Importing DecimalFormat to format the total price in the calling program

public class LunchOrder {
    private double total;  // Total cost of the lunch order
    private int hamburger, salad, fries, soda;  // Amount of each item in the order

    public LunchOrder() { // Constructor class
        total = 0;  // Initialize total to 0
    }

    // Method to calculate the total cost of the lunch order depending on the amount of each item
    public void setLunchOrder() {
        // The total is calculated by multiplying the quantity of each item by its price
        total = hamburger * 1.85 + salad * 2.00 + fries * 1.30 + soda * 0.95;
    }

    public void setHamburger(int h) {
        hamburger += h;  // Add the number of hamburgers to the current total
        setLunchOrder();  // Recalculate the total
    }

    // Method to set the number of salads ordered and also update the total
    public void setSalad(int s) {
        salad += s;  // Add the  number of salads to the current total
        setLunchOrder();  // Recalculate the total after updating the quantity
    }

    // Method to set the number of French Fries ordered and also update the total
    public void setFries(int f) {
        fries += f;  // Add the number of fries to the current total
        setLunchOrder();  // Recalculate the total after updating the quantity
    }

    // Method to set the number of sodas ordered and also update the total
    public void setSoda(int S) {
        soda += S;  // Add the number of sodas to the current total
        setLunchOrder();  // Recalculate the total after updating the quantity
    }

    // Method to get the total cost of the order
    public double getTotal() {
        return total;  // Return the current total cost of the order
    }
}
