
/**
 * File name:   ArithmaticDemo
 * Written by:  Aaron Arlotti
 * Written on:  Jan 27, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder 
 * Book page:   96 - You Do It.     
 **/

package chapter2;

import java.util.Scanner;

// class description

public class ArithmaticDemo2 {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter an double: ");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double: ");
        secondNumber = input.nextDouble();
        
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum/2;
        
        System.out.println(firstNumber+ " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber+ " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
       
        
        
        
        
        
    }

}

