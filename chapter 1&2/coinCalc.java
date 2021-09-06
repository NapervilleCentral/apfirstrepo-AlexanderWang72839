/**
 * Converts pennies, nickels, dimes, and quarters into money format
 *
 * @author Alexander Wang
 * @version 1.0.0
 */
import java.util.*;
import java.text.*;
<<<<<<< HEAD

=======
    
>>>>>>> e96b3506f3f1b3f35b021c2b66c79554e27a5a28
public class coinCalc {
    public static void main(String[] args) {
        //declare all variables
        Scanner Input = new Scanner(System.in);
<<<<<<< HEAD
        NumberFormat format = NumberFormat.getCurrencyInstance();
        int quarters, nickels, dimes, pennys;
        int output;
        
        //prompts for coins
        System.out.println("Input number of quarters: ");
        quarters = Input.nextInt();
        System.out.println("Input number of nickels: ");
        nickels = Input.nextInt();
        System.out.println("Input number of dimes: ");
        dimes = Input.nextInt();
        System.out.println("Input number of pennys: ");
        pennys = Input.nextInt();
        
        //prints total amount of money
        System.out.println("Total amount of money: " + format.format((quarters * 25 + nickels * 5 + dimes * 10 + pennys) / (double) 100));
=======
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
        
>>>>>>> e96b3506f3f1b3f35b021c2b66c79554e27a5a28
    }
}

/*
Input number of quarters: 
1
Input number of nickels: 
1
Input number of dimes: 
1
Input number of pennys: 
1
Total amount of money: $0.41
*/
