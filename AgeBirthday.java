/*
Lisa Hanna
8 March, 2020, 2020
Step 5 of Lab3 -- Program that tells the user when their birthday is (or was)
*/
package prog1lab3;

import java.util.*;
import java.time.*;

public class AgeBirthday {
    
    public static void main(String[] args) {
        //Create a scanner for user input
        Scanner keyboard = new Scanner(System.in);
        
        //Print instructions
        System.out.print("Hello! Please enter your birth date in the format YYYY-MM-DD: ");
        //Store the data
        String birthDate = keyboard.next();
        
        //Seperate the string into Year, Month and Day
        String birthYear = birthDate.substring(0,4);
        String birthMonth = birthDate.substring(5,7);
        String birthDay = birthDate.substring(8);
        
        //Convert the strings into ints
        int birthYearInt = Integer.parseInt(birthYear);
        int birthMonthInt = Integer.parseInt(birthMonth);
        int birthDayInt = Integer.parseInt(birthDay);
        
        //Take the birthday and use the LocalDate class to set it
        LocalDate birth = LocalDate.of(birthYearInt, birthMonthInt, birthDayInt);
        //Get the current date using LocalDate class
        LocalDate now = LocalDate.now();
        
        //Calculate the age by finding the period between both dates
        Period diff = Period.between(birth, now);
        int age = diff.getYears();
        //Print the age
        System.out.println("You are " + age + " years old.");
        
        //Create another variable for the birthday, but using the current year
        LocalDate birthday = LocalDate.of(birthYearInt + age, birthMonthInt, birthDayInt );
        //Calculate last/next birthday depending on when it is
        //if birthday is after current date
        if (birthday.compareTo(now)>0){
            Period diff2 = Period.between(now,birthday);
            int days = diff2.getDays();
            int month = diff2.getMonths() * 31;
            int totalDays = days + month;
            System.out.println("Your birthday is in " + totalDays + " days.");
            
        } else{
            Period diff3 = Period.between(birthday, now);
            int days = diff3.getDays();
            int month = diff3.getMonths() * 31;
            int totalDays2 = days + month;
            System.out.println("Your birthday was " + totalDays2 + " days ago.");
        }
        
    }
}
