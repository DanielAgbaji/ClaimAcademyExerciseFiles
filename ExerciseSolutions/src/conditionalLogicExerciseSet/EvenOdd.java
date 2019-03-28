/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
/*
Exercise Problem 

Even or Odd Number
Write an IF statement to determine if a number is even or odd. 
INPUT:     242 
RESULT:    Even
*/
package conditionalLogicExerciseSet;

/**
 *
 * @author danielagbaji
 */
public class EvenOdd {
    public static void main (String []args){
        
        int number = 243;
        
        if (number%2 == 0){
            
            System.out.println(number +" is an even number");
        }
        else if (number%2 != 0){
            
            System.out.println (number +" is an odd number");
        }
        else 
            System.out.println (number +" is not a real number");
    }
}
