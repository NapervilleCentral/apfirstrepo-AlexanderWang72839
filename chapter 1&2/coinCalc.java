/**
 * Converts pennies, nickels, dimes, and quarters into money format
 * 2.12
 * @author Alexander Wang
 * @version 9/7/21
 */
import java.util.*;
import java.text.*;
public class coinCalc {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        
        System.out.println("How many pennies?");
        int pennies = Input.nextInt();
        System.out.println("How many nickels?");
        int nickels = Input.nextInt();
        System.out.println("How many dimes?");
        int dimes = Input.nextInt();
        System.out.println("How many quarters?");
        int quarters = Input.nextInt();
      
        //caculating the doller value of all the coin input.
        System.out.println("The total amount of money is: " + money.format((quarters * 25 + dimes * 10 + nickels * 5 + pennies) / (double)100));
        

    }
}
