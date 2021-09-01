import java.util.*;
import java.text.*;

public class coinCalc {
    public static void main(String[] args) {
        //declare all variables
        Scanner Input = new Scanner(System.in);
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
