/**
 * Prints a random valid phone number
 *
 * @author Alexander Wang
 * @version 9/7/21
 */
import java.util.*;
import java.text.*;

public class phoneNumber {
    public static void main(String[] args) {
        //initialize variables, NumberFormater, and RNG
        Random generator = new Random();
        DecimalFormat fmt = new DecimalFormat("0000");
        int areaCode1 = generator.nextInt(8);
        int areaCode2 = generator.nextInt(8);
        int areaCode3 = generator.nextInt(8);
        int exchangeCode = generator.nextInt(642) + 100;
        int subscriberNumber = (int)(Math.random() * 10000);
        
        //print phone number
        System.out.print("Random phone number: " + areaCode1);
        System.out.print(areaCode2);
        System.out.print(areaCode3);
        System.out.print("-" + exchangeCode + "-");
        System.out.println(fmt.format(subscriberNumber));
    }
}

/*
Random phone number: 120-267-4514

Random phone number: 642-119-5204
*/