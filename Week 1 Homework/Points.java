import java.awt.Point;

/**
* CSCI 114 homework.
*
* @author    Andrew Ortiz
* @version   2/11/2021
*/
public class Points
{
   public static void main(String[] args)
   {
       Point pointA = new Point(0, 10);
       Point pointB = new Point(20, 30);
       
       System.out.println("pointA is: " + pointA.toString());
       System.out.println("pointB is: " + pointB.toString());
       
       pointA.setLocation(20, 30);
       System.out.println("The new location of pointA is: " + pointA.toString());
       
       pointB.translate(50, 20);
       System.out.println("The new location of pointB is: " + pointB.toString());
   }
}
