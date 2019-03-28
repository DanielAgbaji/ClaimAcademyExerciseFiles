/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Exercise Problem

Week Day
Convert a numeric day of the week to the weekday, with the first day of the week 
being Sunday Make a provision for an invalid weekday number. 
INPUT:     5 
RESULT:    Thursday 
*/

package conditionalLogicExerciseSet;

/**
 *
 * @author danielagbaji
 */
    class Day {
    public int dayNumber; 
    public String dayName; 
    Day(int dayNumber, String dayName) 
    { 
        this.dayNumber = dayNumber; 
        this.dayName = dayName; 
    } 
        
    }
     
  
// Elements of array are objects of a class Day. 
public class WeekDay 
{ 
    public static void main (String[] args) 
    { 
        // declares an Array of integers. 
        Day [] arr; 
  
        // allocating memory for 7 objects of type Day. 
        arr = new Day[7]; 
  
        // initialize the first elements of the array 
        arr[0] = new Day(1,"Sunday"); 
  
        // initialize the second elements of the array 
        arr[1] = new Day(2,"Monday"); 
  
        // so on... 
        arr[2] = new Day(3,"Tuesday"); 
        arr[3] = new Day(4,"Wednesday"); 
        arr[4] = new Day(5,"Thursday"); 
        arr[5] = new Day(6,"Friday");
        arr[6] = new Day(7,"Saturday");
        
        System.out.println ("The fifth day of the week is " + arr[5].dayName);
  
        // accessing the elements of the specified array using an iteration(Looping through) 
        for (int i = 0; i < arr.length; i++) 
            System.out.println("Day of the week and it's number " +" : " + 
                        arr[i].dayNumber +" "+ arr[i].dayName); 
    } 
} 