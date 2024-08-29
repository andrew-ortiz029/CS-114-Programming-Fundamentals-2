import java.util.ArrayList;
/**
 * Main function to test my shapes classes
 *
 * @author Andrew Ortiz
 * @version 05/14/21
 */
public class Tester
{
    /*
     * main() method
     */
    public static void main(String[] args)
    {
        //create the empty ArrayList
        ArrayList<Shape> shapes = new ArrayList<>();
        
        //fill the ArrayList
        Triangle t1 = new Triangle("white", true, 3.0, 2.5, 2.0);
        shapes.add(t1);
        Rectangle r1 = new Rectangle("red", true, 2.0, 4.0);
        shapes.add(r1);
        Circle c1 = new Circle("yellow", false, 1.0);
        shapes.add(c1);
        
        //starting shapes traverse
        System.out.println("Starting shapes");
        System.out.println();
        for (int i = 0; i < shapes.size(); i++)
        {
            //temp for printing 
            Shape temp = shapes.get(i);
            
            //print shape toString()
            System.out.println(temp);
            
            //print perimeter
            System.out.printf("Perimeter is : " + "%.2f", temp.getPerimeter());
            System.out.println();
            
            //print area
            System.out.printf("Area is : " + "%.2f", temp.getArea());
            System.out.println();
            System.out.println();
        }
        
        //change shapes
        t1.changeFilled(false);
        r1.changeColor("blue");
        c1.changeColor("black");
        c1.changeFilled(true);
        
        //changed shapes traverse
        System.out.println("Changed shapes");
        System.out.println();
        for (int i = 0; i < shapes.size(); i++)
        {
            //temp for printing 
            Shape temp = shapes.get(i);
            
            //print shape toString()
            System.out.println(temp);
            
            //print perimeter
            System.out.printf("Perimeter is : " + "%.2f", temp.getPerimeter());
            System.out.println();
            
            //print area
            System.out.printf("Area is : " + "%.2f", temp.getArea());
            System.out.println();
            System.out.println();
        }
    }
}
