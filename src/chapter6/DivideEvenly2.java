
/**
 * File name:   DivideEvenly
 * Written by:  Aaron Arlotti
 * Written on:  Feb 27, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder 
 * Book page:          
 **/

package chapter6;

// class description

public class DivideEvenly2 {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int var;
        int number;
        
        
        for(number = 1; number <= LIMIT; ++number)
        {
            System.out.println(number + " is evenly divisible by ");
            for(var = 1; var <= number; ++var)
                if(number % var == 0)
                    System.out.println(var + "");
                    //Display the number and a space
            System.out.println();
        }
    }

}
