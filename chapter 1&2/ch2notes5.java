/********************************************************************
// These are the notes for ch 2 used in hayes class
//******************************************************************* */
//Name
//Date
//Program
//Description
//Who helped me: Mr. Hayes

import java.util.Random; // lets us use the random class
//you import the Scanner Class!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
import java.util.Scanner; // last word is the the Class

//util is a package
//Scanner and Random are classes.

import java.util.*;  // let me use any class in the package
//import java.text.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;



public class ch2notes5 {   
    enum Flavor {chocolate, strawberry, mitChocolateChip, razberry}

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        Scanner Keyboard = new Scanner(System.in);
    
        //Flavor cone = Flavor.razberry;
    
        //these are basic data types
            int length;
            int x = 9,y,z;
            int id = 789;
            double num = 5, num1 = 23.89765, num2 = 3.4;
            char letter = 'd'; //is the same as an int only time to use sinlge quotes
            boolean choice = false;
            float num5 = 3.14f; //must have f
    
            //These are Objects
            Integer number = new Integer(47); // evey basic data type has a wrapper class
           
            /*Start with a letter or _
             * Have numbers Cannote have symbols except $
             * a lot of character (more than 40)
             * must have new
             * Class id    must have  constructor(data, may be optional)
             * name        new        has the same name as the class
             */
           
            String myname = new String("Kevin Hayes");
            //Integer n2 = 7;//Auto Boxing
    /**/
            String word = new String("Homer Simpson");
            String word2 = new String("Homer Simpson");
            String word3 = new String("Bart Simpson");
            String name = new String("Mike");
            String last = "Hayes"; // string dosnt need new, String is special
    
            //System.out.println(word.length());
            //System.out.println("The name is " + name);
    /*
            System.out.printf("Name:  %s \t ID: %5d \n", name,id);
            System.out.println( 'a' + 100 ); //97 + 100 = 197, ASCII "a" = 97 chars are ints
            System.out.println('a'   );
            System.out.println("A"+100  );
            System.out.println("The add is : " + 7 + 5); //prints The add is : 75
            System.out.println(7 + 5 + "is the add"); //prints 12 is the add
    
    //      System.out.printf(  );
    
    //      System.out.printf( );
    
            System.out.println(  );
    
        System.out.println( );
        System.out.println(  );
    
    /*
    
            num1 = 23.89765; num2 = 3.4;
    //Your create a NumberFormat and Decimalformat object
    
    
            NumberFormat money = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            DecimalFormat fmt = new DecimalFormat("0.###");//<-- this is constructor ## max decimal spaces, rounds, and floadting decimal pt
            DecimalFormat fmt2= new DecimalFormat("0.00");//  .00 pads with 0s, rounds ## vs 00
            
    
            System.out.println( "Sub Total: " + money.format(num1) );// prints $23.90
            System.out.println( "Sub Total: " + percent.format(.5) ); //pirnts 50%
            System.out.println( "Sub Total: " + fmt.format(num1) ); //prints 23.898
            System.out.println( "Sub Total: " + fmt2.format(num2) ); //prints 3.40
            System.out.println( "Sub Total: " + fmt.format(num2) ); //prints 3.4
            System.out.println( "Sub Total: " + fmt2.format(num1) ); //prints 23.90
            
    
    // page 90 Why do we get this Error???
    /*
            System.out.print("Enter a number ");
            x = Keyboard.nextInt(); //scanner obj is how we get inputs from user
            System.out.println(x);
            
            System.out.println("Enter a word ");
            word = Keyboard.next(); //reads to the next line
            //word = Keyboard.nextLine(); //reads to the next white space
            System.out.println(word);
            
            System.out.print("Enter 3 numbers ");
            
            x = Keyboard.nextInt();
            y = Keyboard.nextInt();
            z = Keyboard.nextInt();
            
            System.out.println("Your first number is: " + x + "\nYour second number is: " + y + "\nYour third number is: " + z);
    
    /*
            System.out.print("Enter a decimal");
            num = Keyboard.nextDouble ();
            System.out.println(num  );
    
    
            // what happens when you have both of these together
    /*
            System.out.print("Enter a word");
            Keyboard.nextLine();
            word = Keyboard.nextLine();
            System.out.println(word);
    
    /*      System.out.println( "enter a word" );
            word = Keyboard.nextLine();
            System.out.println(word  );
    /*
            System.out.print("Enter a word "  );
            word = Keyboard.next   ();
            lname = Keyboard.next();
            System.out.println(word + "\n" + lname  );
    
    
    
    /*
    //  Can we make a Math Object? What type of class is Math???
    //      Math silly = new Math(); don't make objects from static classes pg.88
    
            System.out.println(Math.abs(-4)); //returns a number
            System.out.println(Math.sqrt (12));
            System.out.println(Math.pow(2,3) * 10);
    //      System.out.println(silly.pow(2,4));
    
    
    /*
    //!!!!!!!!!!!! Make a Random Object called generator
            Random generator = new Random();
            //100 numbers from 0 to 99
            x = generator.nextInt(100);
            System.out.println("the Random number is " + x);
    
            //decimal of 17 digits from 0 -1 exclusive
            
            num = generator.nextDouble()*50;
            System.out.println(num);
    //                            how many + the range        
            num = Math.random() * 100 -50;
            System.out.println(num);
    /*
    
    /**/
    //----------------------------Know it live it love it p 78
            //word is an oject can do things (NOT len(word))
            System.out.println(word.length());
            System.out.println(word == word2); //compares obj == obj/memory address
            System.out.println(word.equals(word2)); //compares String == String
            System.out.println(x == 9 );
            System.out.println(word.compareTo(word3)); //subtracts ACSCII value
            System.out.println(word3.compareTo(word)); //prints -6
            System.out.println(word.indexOf("p"));
            //System.out.println();
            //substring(index_ returns string from index to the end
            System.out.println(word.substring(word.indexOf("r"))); //slice up the String - substring
            //substring(start, end);
            int find = word.indexOf("S");
            System.out.println(word.substring(find,find + 2));
    
    
    
    
    
    
    //System.out.println((int)(letter + letter ) );
    
        //System.out.println( (char)101 );
    /*
    //                                 | int/int gives int result
    //                                 v
            x = 9;
            y = 5;
            //double conversionFactor = 9.0/5; //(double)x/5; //9/5 logic error -- promotion 5.0
            double conversionFactor = (double) x/y; //casting
            System.out.println("conversion factor: " + conversionFactor);
            final int BASE = 32;            // cast is (data type)
            int celsiusTemp = 30;
    
            double fahrenTemp = celsiusTemp * conversionFactor + BASE;
    
            System.out.println("Celsius Temp: " + celsiusTemp );
            System.out.println("Fahrenheit Equivalent " + fahrenTemp  );
            System.out.println((int)(Math.random()*100));
    
    /*
        num = num + num;
        num = num - num;
        num = num * num;
        num = num / num;
        num = num % 3; //modulas num/3
        System.out.println(num);
    
    
    
    /**/
    
    }//end of main

}//end of class

















