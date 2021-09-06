/**
 * Tells the area and the circumference of a circle
 *
 * @author Alexander Wang
 * @version 1.0.0
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.##");

        System.out.println("What is the radius of the circle?");
        double Radius = input.nextDouble();
        System.out.println("The area is; " + format.format(Math.pow(Radius, 2) * Math.PI));
        System.out.println("The circumference is: " + format.format((Radius * 2) * Math.PI));
    }    
}
