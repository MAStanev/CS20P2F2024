package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {

Scanner userInput = new Scanner(System.in);
        
System.out.println("Choose which time you would like to convert between");
System.out.println("1. Hours to minutes");
System.out.println("2. Days to hours");
System.out.println("3. Minutes to hours");
System.out.println("4. Hours to days");

int converterChoice = userInput.nextInt();

if (converterChoice == 1) {
	System.out.print("How many hours?");
    int Hours2Minutes = userInput.nextInt();
    
    double finalMinutes = (Hours2Minutes * 60);
    System.out.print("There are " + finalMinutes + " minutes " + "in " + Hours2Minutes + " hours");
}

if (converterChoice == 2) {
    System.out.print("How many days?");
    int Days2Hours = userInput.nextInt();
        
    double finalHours = (Days2Hours * 24);
    System.out.print("There are " + finalHours + " hours " + "in " + Days2Hours + " days");    
}
if (converterChoice == 3) {
    System.out.print("How many minutes?");
    int Minutes2Hours = userInput.nextInt();
        
    double finalHours2 = (Minutes2Hours / 60);
    System.out.print("There are " + finalHours2 + " hours " + "in " + Minutes2Hours + " minutes"); 
}

if (converterChoice == 4) {
    System.out.print("How many hours?");
    int Hours2Days = userInput.nextInt();
        
    double finalDays = (Hours2Days / 24);
    System.out.print("There are " + finalDays + " days " + "in " + Hours2Days + " hours"); 
}

}
}


