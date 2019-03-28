/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. Conditional Logic
*/
/*
Exercise Problem  

Positive or Negative Number
Write an IF statement to determine if a number is positive or negative. 
INPUT:     -7 
RESULT:    Negative 
 */
package conditionalLogicExerciseSet;

/**
 *
 * @author danielagbaji
 */
public class PositiveNegative {
    
    public static void main (String[] args){
        
        int number = -7;
        
        if (number <= -1 ){
            
            System.out.println (number + " is a negative number");
            
        
        }
        else if (number >-1 ) {
            
            System.out.println ("The number is positive");
            
        }
        else 
            System.out.println("The number does not exist");
            
        
        
    }
    
    
}
