/**
 * Converts pennies, nickels, dimes, and quarters into money format
 *
 * @author Alexander Wang
 * @version 1.0.0
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
      
        System.out.println(money.format((quarters * 25 + dimes * 10 + nickels * 5 + pennies) / (double)100));      
    }
}
