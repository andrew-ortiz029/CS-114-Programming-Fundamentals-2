import java.util.ArrayList;
/**
 * Works with bunches of points.  Demonstrates many classes,
 * many ArrayLists.
 *
 * @author Anthony W. Smith
 * @version 7/31/2028
 */
public class BunchOfPoints
{
    // constants
    public static final int BUNCHES = 3;    // how many bunches we want
    public static final int POINTS = 4;    // how many points we want
    
    /**
     * Creates and uses many Bunch objects.
     */
    public static void main(String[] args)
    {
        // create a new, empty Bunch object
        Bunch bigBunch = new Bunch();
        
        // put in some points, in 'diagonal order'
        bigBunch.fill();
        System.out.println("Put in some points, in 'diagonal order'");
        System.out.println(bigBunch.toString());
        
        // shake up bigBunch into random order
        bigBunch.shake();
        System.out.println("Shake");
        System.out.println(bigBunch.toString());
        
        // create a new AL to contain some empty bunches
        ArrayList<Bunch> bunches = new ArrayList<>();
        for (int b = 1; b <= BUNCHES; ++b)
            bunches.add(new Bunch());  // add a new empty Bunch object
        
        // take first several points from bigBunch and put into first
        // bunch, and so on...
        // careful here that this time b is the index of a bunch in
        // bunches
        for (int b = 0; b < BUNCHES; ++b)
            for (int count = 1; count <= POINTS; ++count)
                bunches.get(b).addPoint(bigBunch.getPoint());
        
        // print each bunch in turn
        // b is the index of a bunch again
        System.out.println("Print each bunch");
        for (int b = 0; b < BUNCHES; ++b)
            System.out.println(bunches.get(b).toString());
        System.out.println();

        // print what remains in bigBunch
        System.out.println("What remains");
        System.out.println(bigBunch.toString());
    }
}