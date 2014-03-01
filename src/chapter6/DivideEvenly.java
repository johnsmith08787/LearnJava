
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

public class DivideEvenly {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int var;
        System.out.println(LIMIT + " is evenly divisible by ");
        
        for(var = 1; var <= LIMIT; ++var)
            if(LIMIT % var == 0)
                System.out.println(var + " ");
        // Display the number and a space
        System.out.println();
    }

}
