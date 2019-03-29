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
        
        int cash = 18;
        
        double prize = 17.18;
        
        double returnChange = getReturnChange(cash, prize);
        
        System.out.println(returnChange);
        
    }
    
    public static double getReturnChange(int cash, double prize){
        
        
        double change = (double)(cash - prize)*100;
        
        double returnChange = change/2;
        
        if (returnChange == 41 ){
          
            System.out.println ("Your change is "  +returnChange);
            
            
        }
        
       return returnChange; 
        
    }
    
}
