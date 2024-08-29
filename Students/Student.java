/**
 * @author Benjamin W.
 * @version 24.05.2021
 */

//Import dependencies
import java.lang.reflect.*;

public class Student {
    //Declare Students instance variables.
    private String name;
    private int age;
    private double gpa;
    
    /**
     * Student() - Substantiates a new Student constructor.
     * 
     * @param arg0_name Specifies the name of the student.
     * @param arg1_age  Specifies the age of the student.
     * @param arg2_gpa  Specifies the GPA of the student.
     */
    
    public Student (String arg0_name, int arg1_age, double arg2_gpa) {
        //Initialise instance variables
        name = arg0_name;
        age = arg1_age;
        gpa = arg2_gpa;
    }
    
    /**
     * fetchValue() - Returns the value of a given variable dynamically.
     * 
     * @param arg0_field_name The name of the variable whose value you wish to return.
     * @return Regular object type of any instance variable within this class.
     */
    
    public Object fetchValue (String arg0_field_name) throws Exception {
        //Return fetched Field as object if found.
        return this.getClass().getDeclaredField(arg0_field_name).get(this);
    }
    
    /**
     * toString() - Returns a neatly formatted string of the simple class name and all private instance variables and their respective values therein.
     * 
     * @return Returns formatted string.
     */
    
    @Override
    public String toString () {
        String arguments_list = ""; //This is the formatted string that gets returned.
        
        try {
            //Fetch all declared fields within this class.
            Field[] all_fields = this.getClass().getDeclaredFields();
            
            //Iterate through all fields in order to fetch their name and values.
            for (Field local_field : all_fields) {
                //Only set a comma if the list has not yet reached its ending index.
                String suffix = (all_fields[all_fields.length-1] == local_field) ? "" : ", ";
                
                //Fetch local_field_name and local_field_value so that they can be logged.
                String local_field_name = local_field.getName();
                Object local_field_value = local_field.get(this);
                
                //Append to arguments list.
                arguments_list += local_field_name + "=" + local_field_value.toString() + suffix;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //Return dynamically formatted string - Student[arg1=arg1_value, arg2=arg2_value, ...]
        return this.getClass().getSimpleName() + "[" + arguments_list + "]";
    }
}
