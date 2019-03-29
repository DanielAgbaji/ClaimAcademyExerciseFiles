/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Functions
 Exercise Set 
Savings Calculator
Write a function that returns the anticipated future value based on an account’s 
present value, interest rate, and time. The formulae for simple future value is FV = 
PV * [1 + (rate x time) ] (Note that rate is given in %; you will need to covert to the 
decimal). 
savings(20000, 4.5, 15)
RESULT:    33500 
*/
package functions;


/**
 *
 * @author danielagbaji
 */

public class SavingsCalculator {
    public static void main (String [] args){
        
        int presentInvestment = 20000;
        double futureValue=0; 
        
        futureValue = getFutureValue(presentInvestment, futureValue);
        
        System.out.println("The future value of the investment is " + futureValue);
        
        
    }
    // Define the future value formula parameters
    // Note the actual formula for future investment is FV=PV[1+(Rate)^15]
    public static double getFutureValue (int presentInvestment, double ratePeriod){
        
        int period = 15;
        double rate   = 4.5;
        double ratePercent = rate/100 + 1;//
        double result = Math.pow(ratePercent,period);
        ratePeriod = result;
        int presentInvestement = 20000;

            
        double futureValue = presentInvestement * ratePeriod;
        
        
        
        System.out.println(futureValue);
        return futureValue;
        
       
       
    }
    
}
