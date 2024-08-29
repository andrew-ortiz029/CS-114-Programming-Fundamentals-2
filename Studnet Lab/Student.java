
/**
 * Student class creates objects that store data about a student
 *
 * @author Andrew Ortiz
 * @version 05/28/21
 */
public class Student
{
    // instance variables
    private String name;
    private int age;
    private double gpa;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, int age, double gpa)
    {
        // initialise instance variables
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getAge()
    {
        // put your code here
        return age;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getGpa()
    {
        // put your code here
        return gpa;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        // put your code here
        return "Student[name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
    }
}
