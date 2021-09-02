import java.text.DecimalFormat;

public class circleArea {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("0.##");
        double Radius = 3; 
        System.out.println("The area is; " + format.format(Math.sqrt(Radius) * Math.PI));
        System.out.println("The circumference is: " + format.format((Radius * 2) * Math.PI));
    }    
}