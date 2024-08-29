/**
 * Tests the Stock class.
 * 
 * @author Anthony W. Smith 
 * @version 5/31/2028
 */
public class Tester
{
    /**
     * main() method
     */
    public static void main(String[] args)
    {
        Stock apple = new Stock("AAPL", 134.34);
        apple.changePrice(25.0);	// Apple up 25.0%!

        System.out.println(apple.getSymbol() + " now at: " +
                                                  apple.getPrice());

        Stock oracle = new Stock("ORCL", 61.75);
        oracle.changePrice(-15.0);	// Oracle down 15.0%!

        System.out.println(oracle.getSymbol() + " now at: " +
                                                  oracle.getPrice());
    }
}

