/**
 * File Name:   DemoIncrement
 * Written by:  Aaron Arlotti
 * Written on:  Feb 24, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder
 * Book page:   
 */

package chapter6;

public class DemoIncrement {

    public static void main(String[] args) {
        int v = 4;
        int plusPlusV = ++v;
        
        v = 4;
        int vPlusPlus = v++;
        
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
    }

}


