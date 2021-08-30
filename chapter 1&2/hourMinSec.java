import java.util.*;

public class hourMinSec {
    static Scanner Input = new Scanner(System.in);
    int hour,sec,min;
    
   public static void main(String[] args) {
       System.out.print("Input seconds: ");
       int number1 = Input.nextInt();
       System.out.println(number1);
       int min = number1 % 60;
       int hour = number1 % 60;
       System.out.println("Hours: " + hour);
       System.out.println("Minutes: " + min);
       System.out.println("Seconds: " + number1);
    }
}
