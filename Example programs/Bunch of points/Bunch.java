import java.util.ArrayList;
import java.util.Random;
/**
 * Holds Point objects.  Uses ArrayList.
 *
 * @author Anthony W. Smith
 * @version 7/31/2028
 */
public class Bunch
{
    // constants
    // fill a bunch with this many points
    public static final int POINTS = 20;
    // print this many points per line
    public static final int POINTS_PER_LINE = 10;

    // instance variables
    ArrayList<Point> points; // number of points in a bunch changes

    /**
     * Constructor for objects of class Bunch.
     */
    public Bunch()
    {
        // create new, empty ArrayList
        points = new ArrayList<>();
    }

    /**
     * Fills the bunch with some constant number of 'diagonal' points.
     */
    public void fill()
    {
        // coordinates of new point
        // diagonal if x == y
        int x = 1;
        int y = 1;
        for (int count = 1; count <= POINTS; ++count) {
            // create a new Point object, then append to end of points
            // add() here is an ArrayList library method
            points.add(new Point(x, y)); 
            ++x;
            ++y;
        }
    }

    /**
     * Shakes the bunch into a random order.
     */
    public void shake()
    {
        Random r = new Random();
        // uses a temporary array list
        ArrayList<Point> temp = new ArrayList<>();

        // remove each point randomly and add to another AL
        while (points.size() > 0)
            temp.add(points.remove(r.nextInt(points.size())));

        // simply set points to temp
        points = temp;
    }

    /**
     * Removes the point from the front of the bunch and returns it.
     *
     * @return    the point from the front of the bunch
     */
    public Point getPoint()
    {
        // exit the program if the bunch is empty!
        // isEmpty() here is an ArrayList library method
        if (points.isEmpty()) {
            // send error message to System.err
            System.err.println
                ("In Bunch::getPoint() -- bunch is empty");
            // also send to standard output, to see it there too
            System.out.println
                ("In Bunch::getPoint() -- bunch is empty");
            System.exit(1);     // non-0 means bad news!
        }
        // assumes index 0 is the front of the bunch
        // removes this point from the bunch, reducing its size
        return points.remove(0);
    }

    /**
     * Adds a point to the end of the bunch.
     *
     * @param  p  point to add
    */
    public void addPoint(Point p)
    {
        points.add(p);    // add p to the end
    }
    
    /**
     * Returns a bunch, nicely formatted.
     *
     * @return    nicely formatted String
     */
    public String toString()
    {
        String out = "";

        int count = 0;  // number of points printed
        // only traverse whatever points are left in the bunch!
        for (Point point : points) {
            out += point.toString() + " ";
            ++count;
            // lines of P_P_L/10 points
            if (count % POINTS_PER_LINE == 0)
                out += '\n';
        }

        return out;
    }
}
