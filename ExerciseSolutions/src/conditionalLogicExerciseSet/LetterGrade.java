/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

Exercise Problem 

Letter Grade
Convert a numeric grade to a letter grade. Use the following scale: 
A 
90 - 100% 
B 
80 - 99% 
C 
72 - 79% 
D 
64 - 71% 
F 
0 - 71% 
Make a provision for an invalid numeric grade 
INPUT:     76 
RESULT:    C 

*/
package conditionalLogicExerciseSet;

/**
 *
 * @author danielagbaji
 */
public class LetterGrade {
    
    public static void main (String [] args){
        
        // declaring and initializing the gradeNumber value;
        
        int gradeNumber = 76;
        
        // creating a range of numbers
        switch ((72 <= gradeNumber && gradeNumber <= 79 ) ? 72 :
                (64 <= gradeNumber && gradeNumber <= 71 ) ? 72 :
                (80 <= gradeNumber && gradeNumber <= 99)? 80:
                (0 <= gradeNumber && gradeNumber <= 63) ? 72 :
                (90 <= gradeNumber && gradeNumber <= 100) ? 90 : 100)
                                                        
                                                                         {
            
            case 90:
            case 100:
                System.out.println("A is your grade");
                break;
            case 80:
            case 99:
                System.out.println("B is your grade");
                break;
            case 72:
            case 79:
                System.out.println("C is your grade");
                break;
            case 64:
            case 71:
                System.out.println("D is your grade");
                break;
            case 0:
            case 63:
                System.out.println("F is your grade");
                break;
            default:
                    System.out.println("You entered an invalide grade");
                    break;
    }
        
        
    }
    
    
    
    
}
