import java.util.Scanner;
/**
 * Tester for Balloon Class
 *
 * @author Andrew Ortiz
 * @version March 3, 2021
 */
public class Tester
{
    public static void main(String args[])
    {
        //clears terminal
        System.out.print("\f"); 
        
        //creates a scanner object to read from the user
        Scanner in = new Scanner(System.in);
        
        //start of the tester
            //Scanning for user input
        System.out.println("Enter color: ");
        String color = in.nextLine();
        
        System.out.println("Enter size: ");
        double size = in.nextDouble();
        
        //Creating a balloon with user input
        Balloon userBalloon = new Balloon(color, size);
        
        //using balloon meathods
        System.out.println("For the " + userBalloon.getColor() + " balloon");
        System.out.println("Volume is " + userBalloon.volume());
        
        userBalloon.inflate(5.0);
        
        System.out.println("For the " + userBalloon.getColor() + " balloon");
        System.out.println("Volume is now " + userBalloon.volume());
    }
}
