/******************************************************************************

Design an interface named Colorable with a void method named howToColor(). Every class of a colorable object must implement the Colorable interface. Design a class named Square that extends GeometricObject and implements Colorable. Override method howToColor to display the message Color all four sides. The Square class contains a private data field side with getter and setter methods, and a constructor for constructing a Square with a specified side. 
Class GeometricObject can be downloaded from Assignment 7 link on Canvas.
Test your code by creating an array of GeometricObject and initialize it with three instances of Square, one instance of Circle, and one instance of Rectangle. Use a loop to iterate thru the array and invoke method getArea from each instance; if applicable, invoke method howToColor on each instance.


*******************************************************************************/
interface Colorable{
    void howToColor();
}

public class Square extends GeometricObject implements Colorable
{
    private double side; //Sides are a double for easy math
    
    Square(double s){
        this.side = s;
    }
    
    double getSide(){
        return this.side;
    }
    
    void setSide(double s){
        this.side = s;
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides");
    }
    @Override
    public double getArea(){
        return this.side * this.side;
    }
    @Override
    public double getPerimeter(){
        return this.side * 4;
    }
	public static void main(String[] args) {
		GeometricObject[] g = new GeometricObject[5];
		g[0] = new Square(1);
		g[1] = new Square(2);
		g[2] = new Square(3);
		g[3] = new Circle(4);
		g[4] = new Rectangle(5,5);
		
		for(int i=0; i<5;i++){
		    System.out.println(g[i].getArea());
		      if (g[i] instanceof Colorable) {
                ((Colorable)g[i]).howToColor();
            }
		}
	}
}
