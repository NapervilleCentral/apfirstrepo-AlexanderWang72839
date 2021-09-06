/**
 * Prints a random valid phone number
 *
 * @author Alexander Wang
 * @version 1.0.0
 */
import java.util.*;

public class phoneNumber {
    public static void main(String[] args) {
        //initialize variables and RNG
        Random generator = new Random();
        int areaCode1 = generator.nextInt(8);
        int areaCode2 = generator.nextInt(8);
        int areaCode3 = generator.nextInt(8);
        int exchangeCode = generator.nextInt(743);
        int subscriberNumber = generator.nextInt(10000);

        //print phone number
        System.out.print("Random phone number: " + areaCode1);
        System.out.print(areaCode2);
        System.out.print(areaCode3);
        System.out.println("-" + exchangeCode + "-" + subscriberNumber);
    }
}

/*
Random phone number: 120-267-4514

Random phone number: 642-119-520
*/