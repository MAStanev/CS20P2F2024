
/*

Program: EvanAndOdds.java          Last Date of this Revision: December 11, 2024

Purpose: Application that generates 25 random integers between 0 and 99 and then displays all the evens on one line and all the odds on the next line.

Author: Misha Stanev
School: CHHS
Course: Computer Programming 20
 

*/


package Masterys;

public class EvenAndOdds {

	public static void main(String[] args) {
		final int cons = 25;
		int[] EvenAndNum = new int[cons]; // Create array to store numbers
		
		
		int Even = 0; // Variable to count amount of even numbers
		int Odd = 0; // Variable to count amount of odd numbers
		for (int i = 0; i<cons; i++) { // Generates 25 random numbers
			EvenAndNum[i] = (int) (100 * Math.random() + 0); // Generates random number between 0 and 100
		}
		
		for (int i = 0; i<cons; i++) {
			if ( EvenAndNum[i] % 2 ==0) {
				Even ++;
			}
			else if ( EvenAndNum[i]%2==1) {
				Odd ++;
			}
		}
		int[] even = new int[Even];
		int[] odd = new int[Odd];
		
		int evenindex = 0;
		int oddindex = 0;
		for (int i =0; i<cons; i++) {
			if (EvenAndNum[i]%2==0) {
				even[evenindex] = EvenAndNum[i];
				evenindex ++;
			}
			else if (EvenAndNum[i]%2==1) {
				odd[oddindex] = EvenAndNum[i];
				oddindex ++;
			}
		}
		
		System.out.println("Even: ");
		for (int i = 0; i<even.length; i++) {
			System.out.print(even[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Odd: ");
		for (int i = 0; i<odd.length; i++) {
			System.out.print(odd[i]+" ");
		}
	}
}

/* Screen Dump

Even: 
90 92 48 62 10 30 14 32 8 76  
Odd: 
81 55 95 33 17 35 73 91 27 95 59 47 79 29 1 
 
 */