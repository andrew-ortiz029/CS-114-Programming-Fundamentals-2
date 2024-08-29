/**
 * CheckingPlus is a checking account that pays interest.
 * Inherits from Checking superclass.
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class CheckingPlus extends Checking
{
    private double rate;    // annual interest rate
    
    /**
     * Constructor for objects of class CheckingPlus
     */
    public CheckingPlus(double amount, double r)
    {
        super(amount);      // call Checking constructor
        rate = r;
    }

    /**
     * Calculate interest due on current balance then deposit this amount
     */
    public void addInterest()
    {
        double interest;
        
        interest = super.balance() * rate;    // balance is private in Checking
        deposit(interest);
    }
    
    /**
     * Print rate and return balance.  Overrides Checking balance()
     * 
     * @return     balance 
     */
    public double balance()
    {
        System.out.print("CheckingPlus rate is " + rate + ". ");
        return super.balance();
    }
    
    /**
     * Return a string representation of the object
     *
     * @return     a string representing the object
     */
    public String toString()
    {
        // call superclass toString()
        return super.toString() + "[rate=" + rate + "]";
    }
}
