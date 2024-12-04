package Masterys;

import java.text.DecimalFormat;
import java.util.*;

public class TestLunchOrder {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        LunchOrder order = new LunchOrder();
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Item          Price     Fat(g)     Carbohydrates(g)     Fiber(g)");
        System.out.println("Hamburger     $1.85       9               33                 1");
        System.out.println("Salad         $2.00       1               11                 5");
        System.out.println("French Fries  $1.30       11              36                 4");
        System.out.println("Soda          $0.95       0               38                 0");

        System.out.print("Enter amount of hamburgers: ");
        order.setHamburger(userinput.nextInt());
        System.out.println("Each Hamburger has 9g of fat, 33g of carbs, and 1g of fiber.");
        System.out.println("  ");

        System.out.print("Enter number of salads: ");
        order.setSalad(userinput.nextInt());
        System.out.println("Each salad has 1g of fat, 11g of carbs, and 5g of fiber.");
        System.out.println("  ");

        System.out.print("Enter number of French Fries: ");
        order.setFries(userinput.nextInt());
        System.out.println("Each french fries has 11g of fat, 36g of carbs, and 0g of fiber.");
        System.out.println("  ");

        System.out.print("Enter number of soda: ");
        order.setSoda(userinput.nextInt());
        System.out.println("Each soda has 0g of fat, 38g of carbs, and 0g of fiber.");
        System.out.println("  ");

        System.out.print("Your total is: $" + df.format(order.getTotal()));
    }
}

/* Screen Dump

 Item          Price     Fat(g)     Carbohydrates(g)     Fiber(g)
Hamburger     $1.85       9               33                 1
Salad         $2.00       1               11                 5
French Fries  $1.30       11              36                 4
Soda          $0.95       0               38                 0
Enter amount of hamburgers: 2
Each Hamburger has 9g of fat, 33g of carbs, and 1g of fiber.
  
Enter number of salads: 3
Each salad has 1g of fat, 11g of carbs, and 5g of fiber.
  
Enter number of french fries: 1
Each french fries has 11g of fat, 36g of carbs, and 0g of fiber.
  
Enter number of soda: 4
Each soda has 0g of fat, 38g of carbs, and 0g of fiber.
  
Your total is: $14.80
 
 */