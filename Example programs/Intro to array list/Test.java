import java.util.ArrayList;

/**
 * Test demonstrates an array list.
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class Test
{
    public static void main(String[] args)
    {
        // create a new empty array list
        ArrayList<Integer> values = new ArrayList<>();
        
        // add() method appends
        values.add(3);  // add to the end
        values.add(2);
        values.add(1);
        
        // set() method replaces
        values.set(1, 99);  // replace element at index 1
        
        // get() returns a value; size() returns number of elements
        for (int i = 0; i < values.size(); ++i)
            System.out.print(values.get(i) + " ");
        System.out.println('\n');
        
        // can use for _ each loop with array list
        // e.g. another laborious way to print values:
        for (Integer e : values)
            System.out.print(e + " ");
        System.out.println('\n');
        
        // Use toString() to print an array list
        System.out.println(values.toString());

        // or more obscurely, simply:
        System.out.println(values);
        
        // use indexOf() to search
        System.out.println("Index of 99 is: " + values.indexOf(99) + '\n');
        
        // add() also inserts into, increasing size
        values.add(1, 2);   // inserts value at index 1, elements move up
        System.out.println(values.toString());
        System.out.println("Size is now: " + values.size() + '\n');
        
        // remove() removes and returns an element, decreasing size
        // removes and returns element at index 2, elements move down
        Integer x = values.remove(2);
        System.out.println("x is: " + x);
        System.out.println(values.toString());
        System.out.println("Size is now: " + values.size());
    }
}
