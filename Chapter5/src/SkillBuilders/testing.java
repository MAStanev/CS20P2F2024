package SkillBuilders;

import java.util.Scanner;

public class testing {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int randomInt = (int) (100 * Math.random() + 20);
System.out.print(randomInt);

        System.out.println("Enter your first name: ");
        String firstName = userInput.next();
        System.out.println("Enter your last name: ");
        String lastName = userInput.next();

        char lastNameFL = lastName.charAt(0);
        char lastNameFLUpper = Character.toUpperCase(lastNameFL);

        if (lastNameFLUpper >= 'A' && lastNameFLUpper <= 'I') {
            System.out.println(firstName + " " + lastName + " is assigned to Group 1"); 
        } else if (lastNameFLUpper >= 'J' && lastNameFLUpper <= 'S') {
            System.out.println(firstName + " " + lastName + " is assigned to Group 2");
        } else if (lastNameFLUpper >= 'T' && lastNameFLUpper <= 'Z') {
            System.out.println(firstName + " " + lastName + " is assigned to Group 3");
        } else {
            System.out.println("Invalid last name.");
        }
        

    }
}
