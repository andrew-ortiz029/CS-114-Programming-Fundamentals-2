
/**
 * Class to create and change stocks
 *
 * Andrew Ortiz
 * 2/17/2021
 */
public class Stock
{
    // instance variables - replace the example below with your own
    private String symb;
    private double currentPrice;

    /**
     * Constructor for objects of class Stock
     */
    public Stock(String symb, double currentPrice)
    {
        // initialise instance variables
        this.symb = symb;
        this.currentPrice = currentPrice;
    }

    /**
     * returns the symbol of the stock
     */
    public String getSymbol()
    {
        return symb;
    }
    
    /**
     * returns the current price of the stock
     */
    public double getPrice()
    {
        return currentPrice;
    }
    
    /**
     * Changes the current price of the stock
     */
    public void changePrice(double byPercent)
    {
        currentPrice = currentPrice + (currentPrice *(byPercent * .01));
    }
}

