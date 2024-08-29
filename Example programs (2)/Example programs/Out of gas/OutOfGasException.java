/**
 * OutOfGasException used when car doesn't have any gasoline.
 * 
 * Inherits from Exception, so is a checked exception
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class OutOfGasException extends Exception
{
	/**
	 * Default constructor for objects of class OutOfGasException
	 */
	public OutOfGasException()
	{
	}

	/**
	 * Constructor for objects of class OutOfGasException
	 */
	public OutOfGasException(String message)
	{
	    super(message);
	}
}
