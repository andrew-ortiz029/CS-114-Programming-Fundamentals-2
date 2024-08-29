/**
 * Represents one (x, y) point.
 *
 * @author Anthony W. Smith
 * @version 7/31/2028
 */
public class Point
{
    // instance variables
    // final means that points cannot be changed once initialized.
    // Cool!
    private final int x;
    private final int y;

    /**
     * Constructor for objects of class Point.
     * 
     * @param  xIn  to set x
     * @param  yIn  to set y
    */
    public Point(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
    }

    /**
     * Returns a point, nicely formatted.
     *
     * @return    nicely formatted String
     */
    public String toString()
    {
        // x and y can be 1 or 2 digits
        // always print them in 2 places for nice formatting
        return "(" + String.format("%2d", x) + ", " + String.format("%2d", y) + ")";
    }
}
