// This program calculates tutition bills as credits times rate per credit hour
package chapter3;

public class FixDebugThree4
{
   public static void main(String args[])
   {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84;
      System.out.println("My tuition:");
      tuitionBill(myCredits, rate);
      System.out.println("Your tuition:");
      tuitionBill(yourCredits, rate);
   }
   public static void tuitionBill(int myCredits, double rate)
   {
      System.out.println("Total due " + (rate * myCredits));
   }
}
