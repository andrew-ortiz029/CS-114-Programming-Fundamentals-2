import java.util.*;     // contains Scanner and Exception

/**
 * Demonstrate Java exception handling
 * - multiple catches
 * – recovering from exceptions
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class Recover
{
    public Recover()
    {
        boolean done = false;
        
        while (!done) {
            try {
                int x = getInt();
                int y = getInt();
                System.out.println(x + " / " + y + " is " + divide(x, y));
                done = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input -- not an int or out of range");
            }
            catch (NoSuchElementException e) {
                System.out.println("No input");
            }
            catch (ArithmeticException e) {
                System.out.println("Divide by zero error");
            }
        }
        System.out.println("Program continues normally...");
    }
    
    /**
     * prompts for and reads an int
     *
     * @return     an int
     */
    public int getInt()
    {
        System.out.print("Enter an int: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();        // can throw InputMismatchException, NoSuchElementException
        sc.close();
        return i;
    }

     /**
     * returns x divided by y
     * 
     * @param  x, y   numerator, denominator
     * @return x      divided by y
     */
    public int divide(int x, int y)
    {
        return x / y;   // can throw ArithmeticException
    }
}

