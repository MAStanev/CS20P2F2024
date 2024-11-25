package Masterys;

import java.util.*;
import java.text.DecimalFormat;

public class MySavings {	

	private double total;

	private int penny, nickel, dime, quarter;

	public MySavings() {

		total = 0; //Default amount of money
}

public MySavings(int penny, int nickel, int dime, int quarter) 
{
	total = (penny * 0.01) + (nickel * 0.05) + (dime * 0.1) +(quarter * 0.25); // Value of each coin
}
public void setTotal() 
{
	total = penny*0.01+nickel*0.05+dime*0.1+quarter*0.25;
}
public void setPenny(int p)
{
	penny += p;
}
public void setNickel(int n)
{
	nickel += n;
}
public void setDime(int d) 
{
	dime += d;
}
public void setQuarter(int q) 
{
	quarter += q;
}
public double getTotal()
{
	return total;
}
public boolean TakeMoney(double TOMoney) 
{
	if (TOMoney<=total) {
		total-=TOMoney;
		return true;
}

else 
{
return false;
}

}

public static void main(String[] args) 
{
Scanner userinput = new Scanner (System.in);

MySavings PiggyBank = new MySavings();

DecimalFormat decimalFormat = new DecimalFormat("$0.00");

int userChoice;

do {
System.out.println("1. Show total in bank."); // Prompt the user with options
System.out.println("2. Add pennies.");
System.out.println("3. Add nickels.");
System.out.println("4. Add dimes.");
System.out.println("5. Add quarters.");
System.out.println("6. Take money out of bank.");
System.out.println("Enter 0 to quit.");
System.out.print("Enter your choice: ");
userChoice = userinput.nextInt(); // Store input

switch (userChoice) { // Switch case statement which prints something depending on userChoice
case 1:
PiggyBank.setTotal();
System.out.println("Bank balance: "+ decimalFormat.format(PiggyBank.getTotal()));
System.out.println(" ");
break;

case 2:
System.out.print("Enter the amount of pennies: ");
PiggyBank.setPenny(userinput.nextInt());
System.out.println(" ");
break;

case 3:
System.out.print("Enter the amount of nickels: ");
PiggyBank.setNickel(userinput.nextInt());
System.out.println(" ");
break;

case 4:
System.out.print("Enter the amount of dimes: ");
PiggyBank.setDime(userinput.nextInt());
System.out.println(" ");
break;

case 5:
System.out.print("Enter the amount of quarters: ");
PiggyBank.setQuarter(userinput.nextInt());
System.out.println(" ");
break;

case 6:
System.out.print("Enter number of money you want to take out: $");
double MoneyTakeOut = userinput.nextDouble();
if (PiggyBank.TakeMoney(MoneyTakeOut)) {
System.out.println("Now your account remains: $"+PiggyBank.getTotal());
}

else 
{
System.out.println("Invalid, please try again.");
}
System.out.println(" ");
break;
}

} while(userChoice !=0);

System.out.print("End of Program! Thanks for using."); //End of program//
}
}
