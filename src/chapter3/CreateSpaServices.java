/**
 * File Name:   CreateSpaServices
 * Written by:  Aaron Arlotti
 * Written on:  Feb 3, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder
 * Book page:   
 */

package chapter3;

import java.util.Scanner;

public class CreateSpaServices {

    public static void main(String[] args) {
        String service;
        double price;
        
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter service: ");
        service = keyboard.nextLine();
        System.out.print("Enter price: ");
        price = keyboard.nextDouble();
        firstService.setServiceDescription(service);
        firstService.setPrice(price);
        keyboard.nextLine();
        
        System.out.print("Enter service: ");
        service = keyboard.nextLine();
        System.out.print("Enter price: ");
        price = keyboard.nextDouble();
        secondService.setServiceDescription(service);
        secondService.setPrice(price);
        
        System.out.println("First service details: ");
            System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
        
        System.out.println("Second service details: ");
            System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    }

}


