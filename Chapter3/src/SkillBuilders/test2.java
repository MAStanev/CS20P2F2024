package SkillBuilders;



import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Generates random number 1-10
        int firstNum = (int) (Math.random() * 11);
        int secondNum = (int) (Math.random() * 11);

        // Asks user which operator they would like to use
        System.out.println("Choose the number of which operator you would like to use: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. /");
        System.out.println("4. *");

        int operatorChoice = userInput.nextInt();
        
        
        String operatorSymbol = ""; 
        double result = 0.0;

        // Switch case depending on which operator user entered
        switch (operatorChoice) {
            case 1:
                operatorSymbol = "+";
                result = firstNum + secondNum;
                break;
            case 2:
                operatorSymbol = "-";
                result = firstNum - secondNum;
                break;
            case 3:
                operatorSymbol = "/";
                if (secondNum == 0) {
                    System.out.println("Cannot divide by zero."); 
                }
                result = (double) firstNum / secondNum; 
                break;
            case 4:
                operatorSymbol = "*";
                result = firstNum * secondNum; 
                break;
            default:
                System.out.println("Invalid operator selected.");
        }

        // Outputs mathematical equation for user
        System.out.print("What is: " + firstNum + " " + operatorSymbol + " " + secondNum + " =  ?");
        
        // Gathers users answer 
        double userAnswer = userInput.nextInt();

        // Compares users answer with result, if correct prints "Correct!" if incorrect prints "Incorrect! The answer was _"
        if (userAnswer == result)
            System.out.print("Correct!");
        else {
            System.out.print("Incorrect! The answer was " + result);
        }

    }
}
