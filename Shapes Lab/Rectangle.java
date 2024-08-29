
/**
 * Rectangle is another subclass of Shape
 *
 * @author Andrew Ortiz
 * @version 05/12/21
 */
public class Rectangle extends Shape
{
    // instance variables 
    private double length;
    private double width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(String color, boolean filled, double length, double width)
    {
        // initialise instance variables
        super(color, filled); //call to superclass for original instance varibles
        this.length = length;
        this.width = width;
    }

    /**
     * calculates and returns the perimeter
     *
     * @return all the sides added up(perimeter of the rectangle)
     */
    public double getPerimeter()
    {
        double temp = (length + width) * 2;
        return temp;
    }
    
    /**
     * calculates and returns the area
     *
     * @return returns area of this instance of rectangle
     */
    public double getArea()
    {
        double temp = length * width;
        return temp;
    }
    
    /**
     * toString for the Rectangle class
     *
     * @return Returns the super classes toString and the characteristics of this instance of a rectangle
     */
    public String toString()
    {
        return "Rectangle" + super.toString() + "[length=" + length + "," +  " width=" + width + "]";
    }
}
