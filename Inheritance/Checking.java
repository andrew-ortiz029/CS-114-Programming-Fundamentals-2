
/**
 * Implement a bank checking account.
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class Checking
{
    private double balance;

    /**
     * Constructor for objects of class Checking
     * 
     * @param   amount  starting balance 
     */
    public Checking(double amount)
    {
        balance = amount;
    }

    /**
     * Withdraw money from the account
     * 
     * @param   amount  amount of the withdrawal 
     */
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    /**
     * Deposit money into the account
     * 
     * @param   amount  amount of the deposit 
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
    /**
     * Return account balance
     * 
     * @return     current balance of the account 
     */
    public double balance()
    {
        return balance;
    }

    /**
     * Return a string representation of the object
     *
     * @return     a string representing the object
     */
    public String toString()
    {
        return getClass().getName() + "[balance=" + balance + "]";
    }
}
