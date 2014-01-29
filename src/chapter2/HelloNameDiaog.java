
/**
 * File name:   HelloNameDiaog
 * Written by:  Aaron Arlotti
 * Written on:  Jan 27, 2014
 * Class:       Intro to Programming - ONT 187
 * Instructor:  Mark Forder 
 * Book page:   86       
 **/

package chapter2;

import javax.swing.JOptionPane;

// class description

public class HelloNameDiaog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
        
    }

}
