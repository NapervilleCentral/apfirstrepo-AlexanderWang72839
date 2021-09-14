/**
 * Tells the area and the circumference of a circle
 *
 * @author Alexander Wang
 * @version 9/7/21
 */
import java.text.DecimalFormat;
import java.util.*;

public class circleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.##");
        double Radius = input.nextInt();
        
        System.out.println("The area is: " + format.format(Math.pow(Radius, 2) * Math.PI));
        System.out.println("The circumference is: " + format.format((Radius * 2) * Math.PI));
    }    
}
