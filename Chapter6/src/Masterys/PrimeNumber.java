package Masterys;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number) {   // Method to check if a number is prime

        // A number is prime if it's greater than 1 and is only divisible by 1 and itself
        if (number <= 1) {
            return (false); // numbers less than or equal to 1 are not prime
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return (false);
            }
        }
        
        return (true); // If there are no divisors, the number is prime
    }

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = userinput.nextInt();

        // Call the isPrime() method to check if the number is prime
        if (isPrime(number)) {
            System.out.println("Your number is a prime number.");
        } else {
            System.out.println("Your number isn't a prime number.");
        }
    }
}
