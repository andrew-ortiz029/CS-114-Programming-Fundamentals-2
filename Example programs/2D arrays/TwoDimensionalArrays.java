import java.util.Random;
/**
 * Demonstrates 2D arrays.
 *
 * @author Anthony W. Smith
 * @version 7/31/2028
 */
public class TwoDimensionalArrays
{
    // constants
    // row range
    public static final int ROW_LOW  = 0;   // lowest index we want for a row
    public static final int ROW_HIGH = 3;   // highest index for a row

    // column range
    public static final int COL_LOW  = 2;  // say that we don't want to use cols 0 and 1
    public static final int COL_HIGH = 14; // highest index for a column

    /**
     * main() method
     */
    public static void main(String[] args)
    {
        // array of row * column
        // we want ROW_HIGH and COL_HIGH indexes available in the array,
        // so careful to + 1 here to achieve this
        int numbers[][] = new int[ROW_HIGH + 1][COL_HIGH + 1];

        // set elements to random numbers 0..count
        int count = 1;  // number of elements set
        Random r = new Random();
        // careful to process the correct range of index e.g. COL_LOW .. COL_HIGH inclusive
        for (int row = ROW_LOW; row <= ROW_HIGH; ++row)
            for (int col = COL_LOW; col <= COL_HIGH; ++col) {
                numbers[row][col] = r.nextInt(count);   // Random requires count > 0!
                ++count;
            }

        /* NOTE: toString() for an array just returns the base address of the array
        System.out.println(numbers.toString());
         */

        // print ALL OF the array, nicely formatted by row
        for (int row = 0; row <= ROW_HIGH; ++row) {
            for (int col = 0; col <= COL_HIGH; ++col) {
                // a number can have 1 or 2 digits.  Format them nicely
                System.out.printf("%2d", numbers[row][col]);
                if (col == COL_HIGH)
                    // just printed the last number from a row
                    System.out.println();
                else
                    System.out.print(", ");
            }
        }
    }
}
