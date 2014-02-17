/**
 * File Name:   ShortCircuitTestAnd
 * Written by:  Aaron Arlotti
 * Written on:  Feb 16, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder
 * Book page:   
 */

package chapter5;

public class ShortCircuitTestAnd {

    public static void main(String[] args) {
        if(trueMethod() && falseMethod())
            System.out.println("Both are true");
        else
            System.out.println("Both are not true");
    }
    
    public static boolean trueMethod(){
        System.out.println("True statement");
        return true;
    }
    
    public static boolean falseMethod(){
        System.out.println("False statement");
        return false;
    }
    // Commit again. 

}


