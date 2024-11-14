package SkillBuilders;

import java.util.Scanner;

public class SpanishNumbers {

	public static void Spanish() {

Scanner userInput = new Scanner(System.in);
		
		
System.out.println("Enter the number for which word you want to be looped");	
System.out.println("1. Uno     6. Seis");	
System.out.println("2. Dos     7. Siete  ");	
System.out.println("3. Tres    8. Ocho");	
System.out.println("4. Cuatro  9. Nueve");
System.out.println("5. Sinco   10. Diez");

int spanishNumber = userInput.nextInt();

}

public static void main(String[] args) {
	
	Spanish();
	

	
	switch (spanishNumber) {
    case 1: System.out.println("74-95 mph or 64-82 kt or 119-153 km/hr"); break;
    case 2: System.out.println("96-110 mph  or 83-95 kt or 154-177 km/hr"); break;
    case 3: System.out.println("111-130 mph or 96-113 kt or 178-209 km/hr"); break;
    case 4: System.out.println("131-155 mph or 114-135 kt or 210-249 km/hr"); break;
    case 5: System.out.println("greater than 155mph or 135 kt or 249 km/hr"); break;	
	
	}
	
}
}