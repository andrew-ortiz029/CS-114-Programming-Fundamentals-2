/**
 * Test bank accounts and do transactions
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */

public class Tester
{
    public static void main(String arg[])
    {
        Checking business = new Checking(100.0);
        CheckingPlus personal = new CheckingPlus(200.0, 0.1);
        
        // demonstrate dynamic binding of overridden balance()        
        System.out.printf("Balance of Checking is $%.2f\n", business.balance());
        System.out.printf("Balance of CheckingPlus is $%.2f\n\n", personal.balance());

        // demonstrate CheckingPlus inherits methods from Checking        
        personal.deposit(100.0);
        System.out.printf("Balance of CheckingPlus after deposit() is $%.2f\n\n", personal.balance());
        
        // demonstrate new method from CheckingPlus
        personal.addInterest();
        System.out.printf("Balance of CheckingPlus after addInterest() is $%.2f\n\n", personal.balance());
        
        // demonstrate toString() formatting with inheritance
        System.out.println(business.toString());
        System.out.println(personal.toString());
    }
    
    // demonstrates a collection of Checking and CheckingPlus objects
    public void foo()
    {
        Checking business = new Checking(100.0);
        CheckingPlus personal = new CheckingPlus(200.0, 0.1);
        Checking accounts[] = new Checking[2];

        accounts[0] = business;
        accounts[1] = personal;     // a CheckingPlus 'is-a' Checking
        
        for (int i = 0; i < 2; ++i)
            print(accounts[i]);
    }
    
    // c is a reference to the super class.  Can actually refer to a super or sub class object
    public void print(Checking c)
    {
        // polymorphism here means call binds to correct version of balance()
        System.out.printf("Balance is $%.2f\n", c.balance());
    }
}
