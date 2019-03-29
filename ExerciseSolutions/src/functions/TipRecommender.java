/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Tip Recommender
Write a function that returns the recommended tip based on the amount of the tab 
and the service performed. 
Use the following table to calculate the tip: 
Service Quality  
Tip Percent 
Poor    
16% 
Good   
22% 
Great   
26% 
computeTip(33.57, "Great")
RESULT:    8.7282 
*/
package functions;

/**
 *
 * @author danielagbaji
 */
public class TipRecommender {
    public static void main (String [] args){
        double tap = 33.57;
        
        double great = 0.26;
        
        double tip= 0;
        
        tip = computeTip(tap, great);
        
        System.out.println ("You deserve a tip of $" + tip );
        
              
        
        
    }
    public static double computeTip (double tap, double great){
        
        /*double poorTipPercent = 16;
        double goodTipPercent = 22;
        double greatTipPercent = 26;
        
        
        double poor = poorTipPercent/100;
        double good = goodTipPercent/100;
               great = goodTipPercent;
               
        */
        
        double calculateTip = tap * great;
        
        return calculateTip;
        
        
        
        
        
        
    }
    
}
