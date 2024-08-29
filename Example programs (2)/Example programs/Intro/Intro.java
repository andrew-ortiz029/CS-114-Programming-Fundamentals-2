/**
 * Demonstrate Java exception handling
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class Intro
{
    public static void main(String argv[])
    {
        try {
            System.out.println(10 / 5);    // no problem
            System.out.println(10 / 0);    // deliberate divide by 0 error here
            System.out.println("Never see this");    // this is not seen
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException CAN BE HANDLED HERE");
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
        finally {    // this is optional. Always executed.  Braces are necessary
            System.out.println("Optional finally block executed");
        }
        System.out.println("Program continues normally here...");
    }
}
