import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int firstNum = (int) (Math.random() * 11);
        int secondNum = (int) (Math.random() * 11);

        System.out.println("Choose the number of which operator you would like to use: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. /");
        System.out.println("4. *");

        int operatorChoice = userInput.nextInt();
        String operatorSymbol = ""; 
        double result = 0.0;
        
        
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
                    userInput.close();
                }
                result = (int) firstNum / secondNum; 
                break;
            case 4:
                operatorSymbol = "*";
                result = firstNum * secondNum;
                break;
            default:
                System.out.println("Invalid operator selected.");
                userInput.close();

        }

        System.out.println("What is: " + firstNum + " " + operatorSymbol + " " + secondNum + " =  ?");
        int userAnswer = userInput.nextInt();

        
        if (userAnswer == result)
			System.out.print("Correct!");
		else {
			System.out.print("Incorrect! The answer was " + result);
		}
    }}
