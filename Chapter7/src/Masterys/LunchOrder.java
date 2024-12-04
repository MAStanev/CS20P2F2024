/*

Program: LunchOrder.java          Last Date of this Revision: December 4, 2024

Purpose:  A application that prompts the user for the number of hamburgers, salads, french fries, and sodas and then displays the total of the order.

Author: Misha Stanev
School: CHHS
Course: Computer Programming 20
 

*/


package Masterys;

import java.util.*;
import java.text.DecimalFormat;

public class LunchOrder {
    private double total;
    private int hamburger, salad, fries, soda;

    public LunchOrder() {
        total = 0;
    }

    public void setLunchOrder() {
        total = hamburger * 1.85 + salad * 2.00 + fries * 1.30 + soda * 0.95;
    }

    public void setHamburger(int h) {
        hamburger += h;
        setLunchOrder();
    }

    public void setSalad(int s) {
        salad += s;
        setLunchOrder();
    }

    public void setFries(int f) {
        fries += f;
        setLunchOrder();
    }

    public void setSoda(int S) {
        soda += S;
        setLunchOrder();
    }

    public double getTotal() {
        return total;
    }
}
