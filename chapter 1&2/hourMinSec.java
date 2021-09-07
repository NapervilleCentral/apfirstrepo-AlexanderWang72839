/**
 * This tells the time in hours, minutes, and seconds from seconds
 *
 * @author Alexander Wang
 * @version 9/7/21
 */
import java.util.*;

public class hourMinSec {
    
    
   public static void main(String[] args) {
        //declare all variables
        Scanner Input = new Scanner(System.in);
        int hour, sec, min;
        int input;
        
        //prompts seconds
        System.out.print("Input seconds: ");
        input = Input.nextInt();
        
        //calculate Hors, minutes, seconds
        hour = input / 3600;
        min = (input % 3600) / 60;
        sec = input % 60;
        
        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + sec);
    }
}

/*
Input seconds: 8192
Hours: 2
Minutes: 16
Seconds: 32
*/
