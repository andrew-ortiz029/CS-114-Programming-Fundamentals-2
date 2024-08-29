
/**
 * Demonstrates arrays in Java.
 * 
 * @author Anthony W. Smith
 * @version 5/31/2028
 */
public class ArraysInJava
{
    // Use constant to create an array
    public static final int MAX_STUDENTS = 5;
    
    /**
     * Constructor for objects of class ArraysInJava
     */
    public ArraysInJava()
    {
        // use new to allocate memory for an array in Java
        int scores[];
        
        scores = new int[5];
        
        // more usual array declaration
        //int scores[] = new int[MAX_STUDENTS];
        
        // Use square brackets [] for value in array
        scores[2] = 87;     // (read as ‘scores sub 2’)
        scores[4] = 86;
        scores[0] = 94;
        
        // An array element is just a variable
        scores[3] = 74;
        scores[4] += 7;
        int scale = scores[0] - 10;
        scores[1] = scores[2] - scores[3];
        int total = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];

        // Use expressions to ‘index into’ an array
        int i = 0;
        System.out.println(scores[i]);    // output: 94
        System.out.println(scores[i++]);      // output: 94 then i becomes: 1
        System.out.println(scores[++i]);      // i becomes: 2 then output: 87
        System.out.println(scores[2 * i]); // output: 93, i still 2
        System.out.println(scores[i]);    // output: 87, i still 2

        // Do not confuse i with  scores[i] -- always draw picture!
        i = 0;
        System.out.println("Value at index " + i + " is " + scores[i]);

        // Use constant to create an array
        for (i = 0; i < MAX_STUDENTS; ++i)
            total += scores[i];
            
        // Java checks array bounds at runtime
        // scores[1000] = 74;   // NO!
        // int newGrade = scores[MAX_STUDENTS] + 10;    // NO!

        // Can initialize a small array
        int moreScores[] = {94, 13, 87, 74, 93};
        
        // Arrays are always passed by reference
        initialize(moreScores);
        
        // a for _ each loop
        total = 0;
        for (int s : scores)
            total += s;
        System.out.println("Total is: " + total);
        
        // use for loop if you have to process array indexes e.g.
        System.out.println("Index is: " + find(scores, 74));
        System.out.println("Index is: " + find(scores, 99));
    }

    /**
     * Initializes all array elements to 0.
     * 
     * @param  array   an array of int to be initialized
     */
    public void initialize(int array[])
    {
        // for (int i = 0; i < MAX_STUDENTS; ++i)
        //  Use length for an array in Java
        for (int i = 0; i < array.length; ++i)
            array[i] = 0;
    }
    
    /**
     * Returns index of first occurrence of target within a[],
     * or -1 if not found.
     *
     * @param  a[]  array to search
     * @param  target  value to search for
     * @return    index of first occurrence, or -1 if not found
     */
    public int find(int a[], int target)
    {
        // traverse a, look for target
        for (int i = 0; i < a.length; ++i)
            if (a[i] == target)
                return i;
        
        // not found
        return -1;
    }
}
