/**
  * File Name:   Comments
  * Written by:  Aaron Arlotti
  * Written on:  Jan 22, 2014
  * Class:       Intro to Programming - ONT 187
  * Instructor:  Mark Forder
  * Book page:   48-Example 11
  * "Program comments are nonexecuting statements you add to a file for the purpose of documentation."
  **/

package chapter1;
import javax.swing.JOptionPane;

/* Write, compile, and test a class that uses the command window to display the
 * following statement about comments:
 * “Program comments are nonexecuting statements you add to a file for the purpose of
 * documentation.”
 * Also include the same statement in three different comments in the class; each
 * comment should use one of the three different methods of including comments in
 * a Java class. Save the class as Comments.java.
 */ 

// Modify the Comments.java program in Exercise 10 so that the statement about
// comments is displayed in a dialog box. Save the class as CommentsDialog.java.

public class CommentsDialog {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "\"Program comments are nonexecuting statements you add to a file for the purpose of documentation.\"");
    }

}


