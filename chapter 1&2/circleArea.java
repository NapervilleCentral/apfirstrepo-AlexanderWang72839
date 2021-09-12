/**
 * Tells the area and the circumference of a circle
 *
 * @author Alexander Wang
 * @version 9/7/21
 */
import java.text.DecimalFormat;

public class circleArea {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.##");
        double Radius = 3; 
        System.out.println("The area is: " + format.format(Math.pow(Radius, 2) * Math.PI));
        System.out.println("The circumference is: " + format.format((Radius * 2) * Math.PI));
    }    
}
