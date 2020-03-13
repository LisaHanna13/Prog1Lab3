/*
Lisa Hanna
8 March, 2020, 2020
Step 3 of Lab3 -- App that outputs different messages depending on the temperature
*/
package prog1lab3;

import java.util.*;

public class Temperature {
    
    public static void main(String[] args){
        //Create a scanner for user input 
        Scanner keyboard = new Scanner(System.in);
        
        //Print instructions 
        System.out.print("Hello! Please enter the current temperature in Celcius: ");
        //Store the data 
        double temperature = keyboard.nextDouble();
        
        //Implement the use of conditional operators (?:)
        String result = (temperature>=0)? "The temperature is in the positives, so I imagine you're not too cold!":"Wow! You must be very cold with a temperature below 0 degrees.";
        //Print the result that corresponds
        System.out.println(result);
    }
}
