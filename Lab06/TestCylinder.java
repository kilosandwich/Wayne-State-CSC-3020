/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class TestCylinder
{
	public static void main(String[] args) {
	    //This is the user input in the code, yeah it's manual not using scanner
	    Object obj = new Cylinder(0.00,0.00,2.00,6.00);
	    Point poi = new Cylinder(5.00,5.00,3.00,9.00);
	    Circle cir = new Cylinder(10.00,10.00,4.00,12.00);
	    
	    System.out.println(((Cylinder)obj).toString());
		System.out.println(((Cylinder)obj).area());
		
		System.out.println(poi.toString());
		//ISSUE: Creating a method of the point class
		//there is no area() method in the point class, therefore
		//when an object is created of type area
		System.out.println(((Cylinder)poi).area());
		
		
		System.out.println(cir.toString());
		System.out.println(cir.area());
		


		
	}
}
