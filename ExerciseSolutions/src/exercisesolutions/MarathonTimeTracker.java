/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Exercise Question
Marathon Race Time 
In 2016, Kenyan runner Eliud Kipchoge
 won the Olympic gold medal in the men’s 
26.2-mile marathon race. The official timer tracked his race at 7724 seconds. 
What is his time in hours, minutes, and seconds? 
RESULT:    2hrs:8mins:44secs 
Bonus: What was his average pace per mile in minutes? 
RESULT:    Average pace: 4.885 minutes per mile
 */
package exercisesolutions;

/**
 *
 * @author danielagbaji
 */
public class MarathonTimeTracker {
    
    public static void main (String [] args){
        
// declaring and initiazing the race time tracked  

        int raceTimeTrackedInSeconds = 7724;
        
        int totalTimeTrackedInMinutes = raceTimeTrackedInSeconds/60; 
        
// Calculating the time conversion in hours 

        int convertToHours = raceTimeTrackedInSeconds/3600;
        
// Calculating the time conversion in minutes

        int convertToMinutes = (raceTimeTrackedInSeconds%3600)/60;
        
// Calculating the time conversion left in seconds

        int remainingSeconds = ((raceTimeTrackedInSeconds%3600)%60);
        
        
// Calculating the average pace raced 

         double pacedRaced = (double) ((totalTimeTrackedInMinutes)/26.2);
         
// Approximating the average pace raced into 3 decimal places
         
         double roundUpPacedRaced = Math.round (pacedRaced * 1000)/1000.0;
        
// Printing out the conversion results        
        System.out.println ("Eluid'S Official Race Time tracked "
        + "is " + convertToHours + "hrs:" + convertToMinutes + "mins:" 
        + remainingSeconds + "secs:");
        
        System.out.println ("Eluids average pace raced is " + roundUpPacedRaced);
        
       
        
        
        
    }
    
}
