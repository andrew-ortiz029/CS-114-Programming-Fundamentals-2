
/**
 * Super class for all my shape classes
 *
 * @author Andrew Ortiz
 * @version 05/12/21
 */
public class Shape
{
    // instance variables 
    private String color;
    private boolean filled;

    /**
     * Constructor for objects of class Shape
     */
    public Shape(String color, boolean filled)
    {
        // initialise instance variables
        this.color = color;
        this.filled = filled;
    }

    /**
     * changes Color instance of this shape
     *
     * @return returns color
     */
    public void changeColor(String newColor)
    {
        // put your code here
        color = newColor;
    }
    
    /**
     * changes filled instance of this shape
     *
     * @return returns wether or not its filled.
     */
    public void changeFilled(boolean newFill)
    {
        // put your code here
        filled = newFill;
    }
    
    /**
     * made for override
     *
     * @return nothing method is for override
     */
    public double getPerimeter()
    {
        return 0;
    }
    
    /**
     * made for override
     *
     * @return nothing method is for override
     */
    public double getArea()
    {
        return 0;
    }
    
    /**
     * toString format that suits all subClasses of shapes.
     *
     * @return returns toString format for Shape and all subclasses
     */
    public String toString()
    {
        // put your code here
        return "[color=" + color + ", filled=" + filled + "]";
    }
}
