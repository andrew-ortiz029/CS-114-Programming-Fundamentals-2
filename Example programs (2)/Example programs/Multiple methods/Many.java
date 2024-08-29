/**
 * Demonstrate Java exception handling - with method(s) between try and throw
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class Many
{
    public static void main(String argv[])
    {
        Many many = new Many();
        
        try {
            System.out.println(many.dummy(10, 5));    // no problem
            System.out.println(many.dummy(10, 0));    // deliberate divide by 0 error here
            System.out.println("Never see this");     // not seen
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!!!");
        }

        System.out.println("Program continues normally...");
    }
    
    /**
     * Extra level between try and throw
     *
     * @param  x, y   numerator, denominator
     * @return        x divided by y
     */
    public int dummy(int x, int y)
    {
        return divide(x, y);
    }

    /**
     * returns x divided by y
     * 
     * @param  x, y   numerator, denominator
     * @return        x divided by y
     */
    public int divide(int x, int y)
    {
        return x / y; // throws ArithmeticException - unchecked
    }
}
