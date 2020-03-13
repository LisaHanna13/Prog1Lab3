/*
Lisa Hanna
8 March, 2020, 2020
Step 4 of Lab3 -- App that gives a menu of 5 options,
and asks the user which one they wish to use. 
*/
package prog1lab3;

import java.util.*;

public class MenuOptions {
    
    public static void main(String[] args){
        //Create a scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //Print instructions
        System.out.println("Hello! Please choose one of the 5 options depeding on what you wish to convert:");
        System.out.println("(1) Convert meters to feet");
        System.out.println("(2) Convert CAD to USD");
        System.out.println("(3) Convert Celcius to Fahrenheit");
        System.out.println("(4) Convert seconds to minutes");
        System.out.print("(5) Convert pounds to kilograms\nEnter here: ");
        //Store the choice
        int choice = keyboard.nextInt();
        
        //Create switch statement to determine which steps to use for each case
        switch(choice){
            case 1:
                //Print instructions
                System.out.println("You chose to convert meters to feet.");
                System.out.print("Please enter a distance in meters: ");
                //Storing the user input
		double meters = keyboard.nextDouble();

		//convert the meters into feet
		double feet = meters * 3.28084;
		
		//Print the result
		System.out.println(String.format("%.2f",meters) + " meters is equal to " + String.format("%.2f",feet) + "feet.");
            break;
            
            case 2:
                //Print instructions
                System.out.println("You chose to convert CAD to USD");
                System.out.print("Please enter an amount in CAD: ");
                //Store the user input
		double cadMoney = keyboard.nextDouble();

		//convert CAD money to USD
		double usdMoney = cadMoney * 0.76;

		//Print out the results
		System.out.println(cadMoney + " CAD is equal to " + usdMoney + " USD.");
            break;
            
            case 3:
                //Print instructions
                System.out.println("You chose to convert Celcius to Fahrenheit.");
                System.out.print("Please enter a temperature in Celcius: ");
                //Store the user input
                double celcius = keyboard.nextDouble();
                
                //convert celcius to fahrenheit
                double fahrenheit = (celcius * 9/5) + 32;
                
                //Print out the results
                System.out.println(String.format("%.2f",celcius) + "Celcius is equal to " + String.format("%.2f",fahrenheit) + " Fahrenheit.");
            break;
            
            case 4:
                //Print instructions
                System.out.println("You chose to convert seconds to minutes.");
                System.out.print("Please enter an amount of seconds: ");
                //Store the data
		int seconds = keyboard.nextInt();

		//Do the conversion to minutes
		int minutes = seconds/60;
		int remainder = seconds%60;

		//Print the result
		System.out.println(seconds + " seconds is equal to " + minutes + ":" + remainder + " minutes.");
            break;
            
            case 5:
                //Print instructions
                System.out.println("You chose to convert pounds to kilograms");
                System.out.print("Please enter a weight in pounds: ");
                //Store the data
                double pounds = keyboard.nextDouble();
                
                //Do the conversion to kilograms
                double kilograms = pounds * 0.4535924;
                
                //Print the result
                System.out.println(String.format("%.2f",pounds) + " pounds is equal to " + String.format("%.2f",kilograms)+ " kilograms.");
            break;
            
            default:
                System.out.println("Sorry, that isn't part of the options. Please select a proper option next time.");
        }
    }             
}