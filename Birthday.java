/*
Lisa Hanna
8 March, 2020, 2020
Step 5 of Lab3 -- Program that tells the user when their birthday is (or was)
*/
package prog1lab3;

import java.util.*;

public class Birthday {
    
    public static void main(String[] args){
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
        
        //Convert the data into dates using Date class
        Date birth = new Date();
        birth.setYear(birthYearInt-1900);
        birth.setMonth(birthMonthInt-1);
        birth.setDate(birthDayInt);
        
        //Using date class, get current year, month, and day
        Date today = new Date();
        
        int year = today.getYear() + 1900;
        int month = today.getMonth() + 1;
        int day = today.getDay();
        
        //Calculate the age
        
        
        
//        //Use LocalDate to determine the difference between the birthday and the current date
//        LocalDate birth = LocalDate.of(birthYearInt, birthMonthInt, birthDayInt);
//        LocalDate now = LocalDate.now();
//        
//        //Use the LocalDate.now and seperate it into year, month, and day
//        int yearNow = now.getYear();

    }
}
