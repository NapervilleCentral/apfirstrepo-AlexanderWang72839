/**
 * Prints a random valid phone number
 *
 * @author Alexander Wang
 * @version 9/7/21
 */
import java.util.*;

public class phoneNumber {
    public static void main(String[] args) {
        //initialize variables and RNG
        Random generator = new Random();
        int areaCode1 = generator.nextInt(8);
        int areaCode2 = generator.nextInt(8);
        int areaCode3 = generator.nextInt(8);
        int exchangeCode1 = generator.nextInt(9);
        int exchangeCode2 = generator.nextInt(9);
        int exchangeCode3 = generator.nextInt(9);
        int subscriberNumber1 = (int)(Math.random() * 10);
        int subscriberNumber2 = (int)(Math.random() * 10);
        int subscriberNumber3 = (int)(Math.random() * 10);
        int subscriberNumber4 = (int)(Math.random() * 10);

        //print phone number
        System.out.print("Random phone number: " + areaCode1);
        System.out.print(areaCode2);
        System.out.print(areaCode3);
        System.out.println("-" + exchangeCode1 + "-" + subscriberNumber1);
    }
}

/*
Random phone number: 120-267-4514

Random phone number: 642-119-520
*/