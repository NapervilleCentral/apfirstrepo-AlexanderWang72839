import java.util.*;
import java.text.*;
import java.math.*;

public class TESST {
    
    enum z {a, b, c, d, e, f, g}
    
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);    
    DecimalFormat fmt = new DecimalFormat("0.##");
    NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
    
    int a;
    int x = 10;
    double y = 2.5;
    
    System.out.println("(promotion)int(x) * double(y) = " + (x * y));
    System.out.println("(casting)int(x) * double(y) = " + ((int)x * y));
    System.out.println("y in DecimalFormat is: " + fmt.format(y));
    System.out.println("x in NumberFormat is: " + fmt1.format(x));
    System.out.println("enter a integer: ");
    a = scan.nextInt();
    System.out.println("your integer is: " + a);
    
        
    }
}
