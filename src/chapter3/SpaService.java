
/**
 * File Name:   SpaService
 * Written by:  Aaron Arlotti
 * Written on:  Feb 3, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder
 * Book page:   
 */

package chapter3;

public class SpaService {
    private String serviceDescription;
    private double price;
    
    public void setServiceDescription(String service){
        serviceDescription = service;
    }
    public void setPrice(double pr){
        price = pr;
    }
    public String getServiceDescription(){
        return serviceDescription;
    }
    public double getPrice(){
        return price;
    }
}

