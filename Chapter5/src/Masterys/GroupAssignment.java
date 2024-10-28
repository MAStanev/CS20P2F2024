/*

Program: GroupAssignment.java          Last Date of this Revision: October 28, 2024

Purpose: Prompts the user for his or her name and then displays a group assignment.

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20
 

*/


package Masterys;

import java.util.Scanner;

public class GroupAssignment {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = userInput.next();
        System.out.println("Enter your last name: ");
        String lastName = userInput.next();

        char lastNameFL = lastName.charAt(0);
        String LastNameFL1 = String.valueOf(lastNameFL);

   
        
       
        if (lastNameFL >= 'A' && lastNameFL <= 'I') {
            System.out.println(firstName + " " + lastName + " is assigned to Group 1"); 
        }  if (lastNameFL >= 'J' && lastNameFL <= 'S') {
            System.out.println(firstName + " " + lastName + " is assigned to Group 2");
        }  if (lastNameFL >= 'T' && lastNameFL <= 'Z') {
            System.out.println(firstName + " " + lastName + " is assigned to Group 3");

        } 
       
    }
    
}

/* Screen Dump

Enter your first name: 
Misha
Enter your last name: 
Stanev
Misha Stanev is assigned to Group 2

 
 */
