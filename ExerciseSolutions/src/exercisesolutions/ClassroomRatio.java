/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesolutions;

/**
 *
 * @author danielagbaji
 */
public class ClassroomRatio {
    
    public static void main (String [] args){
    /**
     *   NOTE: 
     *   The number of girls,boys, teacher and assistant teacher are integers because individuals are 
     *   considered as a whole- we normally don't have half a human being.
     *  
     *   
     * 
     */
    /*
        Next line declares and initiazes the variables (girls, boys, teacher, 
        and assistant teacher) mentioned above
    */
        int numberOfBoys = 11;
        
        int numberOfGirls = 16;
        
        int numberOfTeachers = 1;
        
        int numberOfAssistantTeachers = 1;
        
    /*
        Next line starts the calculation to compute the percentage of girls and 
        ratio of students-teachers in the classroom.
        
    */    
        
    // The total number of students is calculated in the next line 
    
        int totalNumberOfStudents = numberOfBoys + numberOfGirls;
        
        
        
    // The total number of teachers is calculated in the next line
    
        int totalNumberOfTeachers = numberOfTeachers + numberOfAssistantTeachers;
        
        
        
    // This next line cast the integer data type of the variables used above into a double data type
        double percentageOfGirls = (double) (numberOfGirls)/(totalNumberOfStudents) * 100;
        
        
    //  Calculating the ratio of students-27 to teachers-2 in the class  
        double studentsTeachersRatio = (double) (totalNumberOfStudents)/(totalNumberOfTeachers);
        
        
    /*
       The next line rounds up the percentage of girls gotten into 3 decimal numbers
    */  
        double RoundedFigureOfGirlsPercentage = Math.round(percentageOfGirls * 1000)/1000.0;
        
    /*
        The next line prints the required results for the exercise
        
        
        */
            
        
        System.out.println ("The percentage of Girls in the class is " + RoundedFigureOfGirlsPercentage);
        
        System.out.println ("The ratio of students to teachers is " + studentsTeachersRatio);
    
    }
    
    
    
}
