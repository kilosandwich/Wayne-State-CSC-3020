/******************************************************************************

Download class Point and class Circle from Canvas under Lab 6 link.
A point in the x-y plane is represented by its x-coordinate and y-coordinate. class Point stores a point in the x-y plane. Class Circle stores the radius and center of the circle and performs the usual operations on a circle, such as calculating the area and circumference. Because the center of the Circle is a point in the x-y plane, class Circle is derived from the class Point.

Every cylinder has a base and height, where the base is a circle. Create class Cylinder that has property height. Derive this class from the class Circle. Override toString and area methods.
The area of the Cylinder is : 
 
Write a test program (TestCylinder) that creates three reference variables types Object, Point, and Circle; initialize each reference variable with an instance of Cylinder. Invoke methods toString and area from each instance. Do not make any change in class Point or class Circle.



*******************************************************************************/
public class Cylinder extends Circle{
    public double height;

    public Cylinder(double x, double y, double r, double h){
        super(x,y,r);
        this.height = h;
        
    }
    
    public double area(){
        return super.area()*2  +  super.circumference()*height;
    }
    
    public String toString(){
        return super.toString() + String.format(", %.2f", height);
    }
}



