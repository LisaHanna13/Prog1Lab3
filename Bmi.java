/*
Lisa Hanna
8 March, 2020, 2020
Step 2 of Lab3 -- Program that calculates BMI,
and tells the user what his or her classification is.
*/
package prog1lab3;

import java.util.*;

public class Bmi {

    public static void main(String[] args) {
        //Create a scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //print the instructions
	System.out.print("Hello! Please enter your weight (in pounds) and your height (in feet): ");
	//Store the data
	double weight = keyboard.nextDouble();
	double height = keyboard.nextDouble();

        //Do the conversions
	double finalWeight = weight * 0.4535924;
	double finalHeight = height * 0.3048;
	//Do the calculation for BMI
	double bmi = finalWeight/(finalHeight*finalHeight);

	//Print out the results
	System.out.println(String.format("\n%.2f",weight) + " pounds is equal to " + String.format("%.2f",finalWeight) + " kilograms.");
	System.out.println(String.format("%.2f",height) + " feet is equal to " + String.format("%.2f",finalHeight) + " meters.");
	System.out.println("Therefore, your BMI is equal to " + String.format("%.2f",bmi));

	//Determine what classification the user is
	if (bmi<18.5){
            System.out.println("Furthermore, since your bmi is equal to " + String.format("%.2f",bmi) + ", you are underweight.");
	} else if (bmi<25){
            System.out.println("Furthermore, since your bmi is equal to " + String.format("%.2f",bmi) + ", you are at a normal weight.");
	} else if (bmi<30){
            System.out.println("Furthermore, since your bmi is equal to " + String.format("%.2f",bmi) + ", you are overweight.");
	} else if (bmi<35){
            System.out.println("Furthermore, since your bmi is equal to " + String.format("%.2f",bmi) + ", you have class I obesity.");
        } else if (bmi<40){
            System.out.println("Furthermore, since your bmi is equal to " + String.format("%.2f",bmi) + ", you have class II obesity.");
	} else if (bmi>=40.0){
            System.out.println("Furthermore, since your bmi is equal to " + String.format("%.2f",bmi) + ", you have class III obesity.");
        }
    }
}