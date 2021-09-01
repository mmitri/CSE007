// Mark Mitri
// 2/29/2020
// CSE 002
// HW5

import java.util.Scanner;

public class WhatIsTheDay{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        // Declaring variables
        boolean monthInt = false, dayInt = false, yearInt = false;
        int month = -1; int day = -1; int year = -1; int centuryCode = -1;
        int leapYearCode = -1; int yearTwoDig = -1; int yearCode = -1; 
        int dayOfWeek = -1; int monthCode = -1;
        String dayWeek;

        // Every While loop has a condition that if met,
        // the user will be asked to input againa
        // This is to check for the correct input for the equations
        // Every While loop also has a condition that if met,
        // will "throw out" the incorrect input 

        System.out.println("Input a month as a number (1-12): ");

        // While loop for input of month
        while(!monthInt){
            if(input.hasNextInt()){
               month = input.nextInt(); 
               if(month < 1 || month > 13){
                    System.out.println("Not a number of a month.");
                    System.out.println("Enter a positive number.");
               }else{
                    if(month == 1 || month == 10){
                        monthCode = 0;
                    }else if(month == 2 || month == 3 || month == 11){
                        monthCode = 3;
                    }else if(month == 4 || month == 7){
                        monthCode = 6;
                    }else if(month == 5){
                        monthCode = 1;
                    }else if(month == 6){
                        monthCode = 4;
                    }else if(month == 8){
                        monthCode = 2;
                    }else if(month == 12 || month == 9){
                        monthCode = 5;
                    }
                    monthInt = true; 
               }
            }else{
                // String junkMonth = input.next();
                System.out.println("Not the right type.");
                System.out.println("Enter a positive number.");
            }
        }

        System.out.println("Input a day as a number (1-31): ");

        // While loop for input of day
        while(!dayInt){
            if(input.hasNextInt()){
                day = input.nextInt();
                if(day < 1 || day > 32){
                    System.out.println("Not a number of a day.");
                    System.out.println("Enter a positive number.");
                }else{
                    dayInt = true;
                }
            }else{
                // String junkDay = input.next();
                System.out.println("Not the right type.");
                System.out.println("Enter a positive number.");
            }
        }

        System.out.println("Input a year as a number (1700 - 2399): ");

        // While loop for input of year
        while(!yearInt){
            if(input.hasNextInt()){
                year = input.nextInt();
                if(year < 1700 || year > 2399){
                    System.out.println("Not a number of a day.");
                    System.out.println("Enter a positive number.");
                }else{

                    // If-statement for the century code
                    if(year>=1700 && year<=1799 || year>=2100 && year<=2199){
                        centuryCode = 4;
                    }else if(year>=1800 && year<=1899 || year>=2200 && year<=2299){
                        centuryCode = 2;
                    }else if(year>=1900 && year<=1999 || year>=2300 && year<=2399){
                        centuryCode = 0;
                    }else{
                        centuryCode = 6;
                    }

                    // Converts year input to the last two digits
                    // i.e. 1876 ---> 76
                    yearTwoDig = (year % 100);

                    // More math
                    yearCode = (yearTwoDig + (yearTwoDig / 4)) % 7;

                    // Leap year code if-statement
                    if((year%4) == 0 || (year%400) == 0){
                            leapYearCode = 1;
                        }else if((year%4) == 0 || (year%100) == 0){
                            leapYearCode = 0;
                        }else{
                            leapYearCode = 0;
                        }
                    }
                    yearInt = true;
            }else{
                // String junkYear = input.next();
                System.out.println("Not the right type.");
                System.out.println("Enter a positive number.");
            }
        }
        // Final formula for the number corresponding to the weekday
        dayOfWeek = (yearCode + monthCode + centuryCode + day);

        // Final if-statement to deal with leap year and months
        // january and febuary
        if((month==1 || month == 2) && leapYearCode == 1){
            dayOfWeek = dayOfWeek - 1;
        }
        dayOfWeek = dayOfWeek % 7;

        // Switch statement to print the day of the week for the specific date
        switch(dayOfWeek){
            case 0: dayWeek = "Sunday";
                    System.out.println("Congradulations! Your date falls on a " + dayWeek);
            break;
            case 1: dayWeek = "Monday";
                    System.out.println("Congradulations! Your date falls on a " + dayWeek);
            break;
            case 2: dayWeek = "Tuesday";
                    System.out.println("Congradulations! Your date falls on a " + dayWeek);
            break;
            case 3: dayWeek = "Wednesday";
                    System.out.println("Congradulations! Your date falls on a " + dayWeek);
            break;
            case 4: dayWeek = "Thursday";
                    System.out.println("Congradulations! Your date falls on a " + dayWeek);
            break;
            case 5: dayWeek = "Friday";
                    System.out.println("Congradulations! Your date falls on a " + dayWeek);
            break;
            case 6: dayWeek = "Saturday"; 
                    System.out.println("Congradulations! Your date falls on a " + dayWeek);
            break;
            default: System.out.println("If this statement prints, you did something very wrong o_o");
        }
        input.close();

    }
}