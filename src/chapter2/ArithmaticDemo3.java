
/**
 * File name:   ArithmaticDemo
 * Written by:  Aaron Arlotti
 * Written on:  Jan 27, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder 
 * Book page:   102 - You Do It.     
 **/

package chapter2;

import java.util.Scanner;

// class description

public class ArithmaticDemo3 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an interger: ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another interger: ");
        secondNumber = input.nextInt();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2.0;
        
        System.out.println(firstNumber+ " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber+ " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
       
        
        
        
        
        
    }

}

