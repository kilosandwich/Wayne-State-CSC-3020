/******************************************************************************

3.	(8 points) Write a program that prompts the user to enter the seconds (e.g., 1 billion), and displays the number of years, days, hours, minutes, and seconds. For simplicity, assume a year has 365 days.  

Here is a sample run:

Enter number of seconds (e.g., 1 billion) 1987000000
In 1987000000 there are: 63 years
In 1987000000 there are: 2 days
In 1987000000 there are: 16 hours
In 1987000000 there are: 26 minutes
In 1987000000 there are: 40 seconds

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void secondsAndStuff(int seconds){
        //declares constants because math is confusing
        int SecondsPerYear = (365*24*60*60);
        int SecondsPerDay= (24*60*60);
        int SecondsPerHour = (60*60);
        int SecondsPerMinute= 60;
        
        //converts to Seconds
        int years = seconds / SecondsPerYear;
        int yearsmod = seconds % SecondsPerYear;
        
        int days = yearsmod / SecondsPerDay;
        int daysmod = yearsmod % SecondsPerDay;
        
        int hours = daysmod / SecondsPerHour;
        int hoursmod = daysmod % SecondsPerHour;
        
        int minutes = hoursmod / SecondsPerMinute;
        int minutesmod = hoursmod % SecondsPerMinute;
        
        int secondsleft = minutesmod;
        
        System.out.println("In " + seconds + " there are: " + years + " years");
        System.out.println("In " + seconds + " there are: " + days + " days");
        System.out.println("In " + seconds + " there are: " + hours + " hours");
        System.out.println("In " + seconds + " there are: " + minutes + " minutes");
        System.out.println("In " + seconds + " there are: " + secondsleft + " seconds");
    }
    
	public static void main(String[] args) {
		System.out.println("Enter number of seconds (e.g., 1 billion)");
		Scanner userInput = new Scanner(System.in);
		int intInput = userInput.nextInt();
		secondsAndStuff(intInput);
	}
}
