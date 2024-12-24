/******************************************************************************

5.	(6 points) Write a program that prompts the user to enter the 
center coordinates and radii of two circles and determines whether
the second circle is inside the first or overlaps with the first,
as shown in the below figure.

This is where my figure would go, IF I HAD ONE!!!!

Hint: 
circle2 is inside circle1 if the distance between the two centers < = r1 - r2 
circle2 overlaps circle1 if the distance between the two centers  <= r1 + r2. 

Test your program to cover all cases.

Here are sample runs:
Enter circle1’s center x-, y-coordinates, and radius: 0.5 5.1 13
Enter circle2’s center x-, y-coordinates, and radius: 1 1.7 4.5
circle2 is inside circle1
Enter circle1’s center x-, y-coordinates, and radius: 3.4 5.7 5.5
Enter circle2’s center x-, y-coordinates, and radius: 6.7 3.5 3
circle2 overlaps circle1

Enter circle1’s center x-, y-coordinates, and radius: 3.4 5.5 1
Enter circle2’s center x-, y-coordinates, and radius: 5.5 7.2 1
circle2 does not overlap circle1


*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void circler(){
        Scanner userInput = new Scanner(System.in);
        
        //get the user input, I am too lazy to do it outside of this function
        System.out.println("Enter the first circle's x coordinate: ");
        double xcor1 = userInput.nextDouble();
        System.out.println("Enter the first circle's y coordinate: ");
        double ycor1 = userInput.nextDouble();
        System.out.println("Enter the first circle's radius: ");
        double radii1 = userInput.nextDouble();
        System.out.println(" ");
        System.out.println("Enter the second circle's x coordinate: ");
        double xcor2 = userInput.nextDouble();
        System.out.println("Enter the second circle's y coordinate: ");
        double ycor2 = userInput.nextDouble();
        System.out.println("Enter the second circle's radius: ");
        double radii2 = userInput.nextDouble();
        
        double distance = Math.sqrt( Math.pow(xcor2-xcor1 ,2 ) + Math.pow(ycor2-ycor1 ,2 )  );
        if( distance <= (radii1- radii2 )){
            System.out.println("Circle 2 is inside circle 1");
        }else if( distance <= (radii2 + radii1)){
            System.out.println("Circle 2 overlaps circle 1");
        }else{
            System.out.println("Circle 2 does not overlap circle 1");
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		circler();
		circler();
		circler();
	}
}