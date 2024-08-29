
/**
 * Triangle class is a subclass of shape 
 *
 * @author Andrew Ortiz
 * @version 05/12/21
 */
public class Triangle extends Shape
{
    // instance variables 
    private double side1;
    private double side2;
    private double side3;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(String color, boolean filled, double side1, double side2, double side3)
    {
        // initialise instance variables
        super(color, filled);   //call to superclass for original instance varibles
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * calculates and returns the perimeter
     *
     * @return all the sides added up(perimeter of the triangle)
     */
    public double getPerimeter()
    {
        double temp = side1 + side2 + side3;
        return temp;
    }
    
    /**
     * calculates and returns the area
     *
     * @return returns area of this instance of triangle
     */
    public double getArea()
    {
        double temp = (side2 / 2.0) * side1;
        return temp;
    }
    
    /**
     * toString for the Triangle class
     *
     * @return Returns the super classes toString and the characteristics of this instance of a triangle
     */
    public String toString()
    {
        return "Triangle" + super.toString() + "[side1=" + side1 + "," +  " side2=" + side2 + "," + " side3=" + side3 + "]";
    }
}
