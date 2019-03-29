/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Kiosk Change Calculator 
A retail store is building a kiosk to enter sales and handle transactions. When 
people use cash to pay for an item, the kiosk needs to tell the cashier how much 
change should be given back to the customer. 
You are developing a simple calculator
 that will compute the right amount and most 
efficient denominations of change for a specific purchase. 
returnChange(18, 17.18)
RESULT:    Quarters: 3 
  Dimes: 0 
  Nickels: 1 
  Pennies: 2
*/
package functions;

/**
 *
 * @author danielagbaji
 */
public class KioskChangeCalculator {
    public static void main (String [] args){
         //currency conversion
        /*
        1 Dollar = 100 cents;
            1 Nickel = 1 Cent;
            1 Penny = 5 cent;
            1 Quarter = 10;
            1 Dime = 25;
        
        
        
        */
        int cash = 18;
        
        double prize = 17.18;
        
        int returnChange = (int)getReturnChange(cash, prize);
        
        //System.out.println("Your change in cent is " +returnChange);
        
        // testing for donomination
        int testForNickel = returnChange/2;
        if (returnChange>= 10 ){
          
            System.out.println ("Your change is ¢"  +returnChange);
            
            System.out.println ("Nickel:1");
            System.out.println ("Penny:2");
            System.out.println ("Quarter:3");
            
        }
        else 
            System.out.println("We don't have enough nickel, penny, and quarters for your change");
                   
        
    }
    
    public static double getReturnChange(int cash, double prize){
        
        //currency conversion
        /*
        1 Dollar = 100 cents;
            1 Nickel = 1 Cent;
            1 Penny = 5 cent;
            1 Quarter = 10;
            1 Dime = 25;
        
        
        
        */
        
        // converting transaction from dollars into cents
        
        
        double change = (double)(cash - prize)*100;
        
        double returnChange = change/2;
        
        
        
       return returnChange; 
        
    }
    
}
