
/**
 * Circle is another subclass of Shape
 *
 * @author Andrew Ortiz
 * @version 05/12/21
 */
public class Circle extends Shape
{
    // instance variables 
    private double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(String color, boolean filled, double radius)
    {
        // initialise instance variables
        super(color, filled); //call to superclass for original instance varibles
        this.radius = radius;
    }

    /**
     * calculates and returns the perimeter
     *
     * @return calculated perimeter of this instance of circle
     */
    public double getPerimeter()
    {
        double temp = 2.0 * Math.PI * radius;
        return temp;
    }
    
    /**
     * calculates and returns the area
     *
     * @return returns area of this instance of circle
     */
    public double getArea()
    {
        double temp = Math.PI * Math.pow(radius, 2.0);
        return temp;
    }
    
    /**
     * toString for the Circle class
     *
     * @return Returns the super classes toString and the characteristics of this instance of a circle
     */
    public String toString()
    {
        return "Circle" + super.toString() + "[radius=" + radius + "]";
    }
}
