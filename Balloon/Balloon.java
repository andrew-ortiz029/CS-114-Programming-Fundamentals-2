
/**
 * Write a description of class Balloon here.
 *
 * @author Andrew Ortiz
 * @version March 3, 2021
 */
public class Balloon
{
    // instance variables - replace the example below with your own
    public static double pi = 3.1415926;
    private String color;
    private double size;
    
    /**
     * Constructor for objects of class Balloon
     */
    public Balloon(String color, double size)
    {
        // initialise instance variables
        this.color = color;
        this.size = size;
    }

    /**
     * Inflate meathod takes param and adds it to the size varible 
     *
     * @param  amount that the balloon will be inflated by
     */
    public void inflate(double amount)
    {
        size = size + amount;
    }

    /**
     * Calculates the volume of the object
     *
     * @return    The volume of the object
     */
    public double volume()
    {
        double temp = pi * Math.pow(size, 3) * 4 / 3;
        temp = Math.round(temp * 100.0) / 100.0;
        return temp;
    }
    
    /**
     * Gets and returns color of the object
     */
    public String getColor()
    {
        return color;
    }
}
