/**
 * Driving a car.  Uses custom exception to handle running out of gas.
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class Car
{
    private double gas;     // gallons in the gas tank
    private double mpg;
    
    public static void main(String[] args)
    {
        Car c = new Car(10.0, 20.0);    // 10.0 gallons, 20.0 mpg
        
        try {
            c.drive(100.0);
            c.drive(500.0);                 // now try to drive 500.0 miles!!!
        }
        catch (OutOfGasException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Done");
    }

    /**
     * Constructor for objects of class Car
     */
    public Car(double g, double mpgIn)
    {
        gas = g;
        mpg = mpgIn;
    }

    /**
     * Drive car for some distance, reducing amount of gas in the tank
     */
    public void drive(double miles) throws OutOfGasException
    {
        double gasNeeded = miles / mpg;
        
        if (gasNeeded > gas) {
            gas = 0.0;
            throw new OutOfGasException("Ran out of gas");
        }
        gas -= gasNeeded;
    }
}
