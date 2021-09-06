/**
 * Prompts and reformats first, middle, and last name. 
 *
 * @author Alexander Wang
 * @version 1.0.0
 */
import java.util.*;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        System.out.println("What is your name?");
        String name = input.nextLine();
        String first = name.substring(0, name.indexOf(" "));
        String middle = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2);
        String last = name.substring(name.lastIndexOf(" ") + 1, name.length());
                
        System.out.println(first + " " + middle + ".");
        System.out.println(last);
    }
}

/*
What is your name?
First Middle Last
First M.
Last

What is your name?
My Name Is
My N.
Is
*/
