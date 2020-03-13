/*
Lisa Hanna
8 March, 2020, 2020
Step 6 of Lab3 -- Multiple textbook problems
*/
package prog1lab3;

import java.util.*;

public class Manual {

    public static void main(String[] args){
        //Create a scanner for user input
        Scanner keyboard = new Scanner(System.in);

        //--------------------------------------------------------------------------------------
	//EXERCISE #42: Calculate batter's hitting percentage and check if above 0.300

	System.out.println("EXERCISE #42");
	System.out.println("---------------------------------------------");

	//Print the instructions
        System.out.print("Hello! Please enter your number of hits and at-bats: ");
        //Store the data
        int hits = keyboard.nextInt();
        int atBats = keyboard.nextInt();

        //Do the calculations required
        double totalThrows = hits + atBats;
        double percentage = hits/totalThrows;

        //Print the percentage
        System.out.println("Your hitting percentage is equal to " + String.format("%.2f",percentage));
        //Create if statements to see if the batter is eligible
        if (percentage>0.300){
            System.out.println("Congratulations! You are eligible for the All Stars Game!");
        } else{
            System.out.println("Sorry! You are not eligible for the All Stars Game.");
       }
       
        //--------------------------------------------------------------------------------------
	//EXERCISE #43: Program that reads and char and outputs if it's a valid char to start an identifier

        System.out.println("\nEXERCICE #43");
        System.out.println("-------------------------------------------");

        //Print the instructions
        System.out.print("Hello! Please enter a single character: ");
        //Store the data
        char character = keyboard.next().charAt(0);
        
        //Create a boolean to determine if the char is valid to start an identifier
        boolean result;
         result = Character.isUnicodeIdentifierPart(character);
        
        //Print the result
        System.out.println("Is the character valid to start an identifier? " + result);

        //--------------------------------------------------------------------------------------
	//EXERCISE #44: Program that calculates areas

        System.out.println("\nEXERCISE #44");
        System.out.println("-----------------------------------------");

        //Do the calculations
        double squareArea = Math.pow(0.6666666667,2);
        double rectangleArea = (1.0/9.0) * 4.0;

        //Do a test for equality
        String question = (squareArea == rectangleArea)? "Yes, it's the same.":"No, it's not the same.";

        //Print the results
        System.out.println("The area of the square is equal to " + squareArea);
        System.out.println("The area of the rectangle is equal to " + rectangleArea);
        System.out.println("Is the area the same for both shapes? " + question);
        
        //--------------------------------------------------------------------------------------
	//EXERCISE #45: Program that calculates areas

        System.out.println("\nEXERCISE #45");
        System.out.println("-----------------------------------------");
        
        //print the instructions
        System.out.print("Hello! Please enter a sentence: ");
        //Java has a bug, where if you used .next() (for your scanner), your next scanner won't work
        //Therefore, I created a "blank" scanner use, called "reboot". The one after will work just fine.
        String reboot = keyboard.nextLine();
        //Store the data
        String sentence = keyboard.nextLine();
        
        //Determine what the sentence ends with
        if (sentence.endsWith(".")){
            System.out.println("Your sentence is declarative.");
            
        } else if (sentence.endsWith("?")){
            System.out.println("Your sentence is interrogative.");
            
        } else if (sentence.endsWith("!")){
            System.out.println("Your sentence is exclamatory.");
        } else{
            System.out.println("Your sentence does not end with any ponctuation.");
        }
        
        //--------------------------------------------------------------------------------------
	//EXERCISE #46: Program that determines if an adress has "@" in it

        System.out.println("\nEXERCISE #46");
        System.out.println("-----------------------------------------");
        
        //print the instructions
        System.out.print("Hello! Please enter an email address: ");
        //Store the data
        String address = keyboard.nextLine();
        
        //Test if the string contains a "@"
        boolean test = address.contains("@");
        
        //Print the result
        System.out.println("Does the email address contain a \"@\": " + test);
        
        //--------------------------------------------------------------------------------------
	//EXERCISE #47: Program that determines if two passwords match

        System.out.println("\nEXERCISE #47");
        System.out.println("-----------------------------------------");
        
        //Print instructions
        System.out.print("Hello! Please enter your password: ");
        //Store the data
        String password = keyboard.nextLine();
        
        //Print instructions again
        System.out.print("Please confirm your password: ");
        //Store the data
        String password2 = keyboard.nextLine();
        
        //Test to see if passwords match
        if(password.equals(password2)){
            System.out.println("You are now registered as a new user.");
        } else{
            System.out.println("Sorry, there is a typo in your password.");
        }
       
        //--------------------------------------------------------------------------------------
	//EXERCISE #48: Program that determines if a user ID is between 6-10 characters (inclusive)

        System.out.println("\nEXERCISE #48");
        System.out.println("-----------------------------------------");
        
        //Print instructions
         System.out.print("Hello! Please enter your user ID: ");
        //Store the data
        String userId = keyboard.nextLine().trim();
        
        //Get the length of the string
        int length = userId.length();
        
        //Determine if the user ID is valid or not
        if ((length <= 10) && (length>=6)){
            System.out.println("Welcome " + userId + "!");
        } else{
            System.out.println("Sorry, this is not a valid user ID.");
        }
    }
}