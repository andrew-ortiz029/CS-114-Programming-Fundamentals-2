/**
 * Demonstrate Java default exception handling
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
*/
public class Crash
{
    public static void main(String argv[])
    {
        System.out.println(10 / 5);    // no problem
        System.out.println(10 / 0);    // deliberate divide by 0 error here

        System.out.println("Program ends normally");    // this is not seen
    }
}
