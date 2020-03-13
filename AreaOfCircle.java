/*
Lisa Hanna
8 March, 2020, 2020
Step 1 of Lab3 -- Program that calculates the area of a circle based on
the radius given by user. Only work if input is positive and >0.
*/
package prog1lab3;

import java.util.*;

public class AreaOfCircle {
    
    public static void main(String[] args){
    //Create a scanner for user input
    Scanner keyboard = new Scanner(System.in);
    
    //Print the instructions
    System.out.print("Hello, please enter a value of radius: ");
    //Store the data
    double radius = keyboard.nextDouble();
    
    //Create if statements to determine if the program should proceed
    if(radius<=0){
        System.out.println("Sorry, your radius is not a valid input.");
        System.out.println("Next time, please enter a value that is higher than 0.");
    }else{
        //Do the calculations necessary
        final double PI = 3.14159;
        double area = PI * radius * radius;
        //Print the answer
        System.out.println("The area of the circle that has a radius of " + String.format("%.2f",radius) + " units is equal to " + String.format("%.2f",area) + " units squared.");
    }
  }
}
    
