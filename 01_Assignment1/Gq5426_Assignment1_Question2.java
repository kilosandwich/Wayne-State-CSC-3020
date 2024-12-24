/******************************************************************************

2.	(6 points) The U.S. Census Bureau projects population based on the
following assumptions:
a.	One birth every 7 seconds
b.	One death every 13 seconds
c.	One new immigrant every 45 seconds
Write a program to display the population for each of the next five years. Assume that the current population is 312,032,486, and one year has 365 days.  

Here is a sample run:
year 1: 314812582
year 2: 317592679
year 3: 320372776
year 4: 323152872
year 5: 325932969


*******************************************************************************/
public class Main
{
    static void population_Counter(int years){
		   	//first step, figure out constants.
		    int secondsPerYear = 365*24*60*60;
		    int currentPopulation = 312032486;
		    //PROFESSOR READ HERE!!!!
		    //This program gives slightly larger results than the program you designed
		    //because this program calculates ALL seconds across all years then divides
		    //them. I suspect your code calculates the growth PER YEAR, then multiplies
		    //the number of YEARS.
		    int secondsTotal = years * secondsPerYear;
		    int births = secondsTotal/7;
		    int deaths = secondsTotal/13;
		    int immigrants = secondsTotal/45;
		    int newPopulation = currentPopulation + births - deaths + immigrants;
		    System.out.println("Year " + years + " : " + newPopulation );
		}
		
	public static void main(String[] args) {
		//define a function to turn years into 

		
		population_Counter(1);
		population_Counter(2);
		population_Counter(3);
		population_Counter(4);
		population_Counter(5);
		    
	}
}
