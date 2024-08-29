
/**
 * Students takes a list of students in file and makes an ArrayList out of them to have the ability to fetch data and change data
 *
 * @author Andrew Ortiz
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;

public class Students
{
    // instance variable
    private ArrayList<Student> students;

    /**
     * Constructor for objects of class Students
     */
    public Students()
    {
        // initialise instance variables
        students = new ArrayList<Student>();
    }

    /**
     * readFile() opens the students file and creates and adds student objects to the students ArrayList
     * 
     * @param takes a filePath as a string and if the string doesn't work, we already told the compiler through FileNotFoundException
     */
    public void readFile(String filePath) throws FileNotFoundException
    {
        // open file
        Scanner file = new Scanner(new File(filePath));
        
        //Read file for students
        while (file.hasNextLine())
        {
            //read and store lines into temp variables
            String tempName = file.nextLine();
            int tempAge = Integer.parseInt(file.nextLine());
            double tempGpa = Double.parseDouble(file.nextLine());
            
            //create student object 
            Student temp = new Student(tempName, tempAge, tempGpa);
            
            //lets test our student
            //System.out.println(temp.toString());
            
            //append temp to students
            students.add(temp);
        }
        
        //close file
        file.close();
    }
    
    /**
     * bestGpa sorts through the students in the ArrayList to find the highest Gpa among them
     */
    public String bestGpa()
    {
        // intitialize int variable for index of student
        int index = 0;
        
        //traverse the students ArrayList and sort for the best GPA
        for(int i = 0; i < students.size(); i++)
        {
            //check for higher Gpa value
            if (students.get(i).getGpa() > students.get(index).getGpa())
            {
                index = i;
            }
        }
        
        return students.get(index).toString();
    }
    
    /**
     * traverses studnets ArrayList to find the average Gpa
     *
     * @return    returns average Gpa of all the students
     */
    public double averageGpa()
    {
        // set average to 
        double average = 0;
        
        //traverse ArrayList and collect all Gpa values
        for(int i = 0; i < students.size(); i++)
        {
            average += students.get(i).getGpa();
        }
        
        //divide by ArrayList size and set it to 2 decimal places
        average = average / students.size();
        average = Math.round(average * 100) / (double) 100;
        
        return average;
    }
    
    /**
     * sorts through the ArrayList to find the amount of above average students
     *
     * @return    amount of above average students
     */
    public int aboveAverage()
    {
        // initialize varibles needed
        int amount = 0;
        double averageGpa = averageGpa();
        
        //iterate through ArrayList and compare Gpas
        for(int i = 0; i < students.size(); i++)
        {   
            if (students.get(i).getGpa() > averageGpa)
            {
                amount++;
            }
        }
        
        return amount;
    }
    
    /**
     * Sorts through the ArrayList to find the amount of students that are below the average Gpa
     *
     * @return    amount of below average students
     */
    public int belowAverage()
    {
        // initialize varibles needed
        int amount = 0;
        double averageGpa = averageGpa();
        
        //iterate through ArrayList and compare Gpas
        for(int i = 0; i < students.size(); i++)
        {   
            if (students.get(i).getGpa() < averageGpa)
            {
                amount++;
            }
        }
        
        return amount;
    }
    
    /**
     * printAboveAverage() prints all above average students
     * 
     * @return   a formatted string of all above average students
     */
    public String printAboveAverage()
    {
        // initialize varibles needed
        String list = "";
        double averageGpa = averageGpa();
        
        //iterate through ArrayList and compare Gpas
        for(int i = 0; i < students.size(); i++)
        {   
            if (students.get(i).getGpa() > averageGpa)
            {
                list += students.get(i).toString() + "\n"; 
            }
        }
        
        return list;
    }
    
    /**
     * printBelowAverage() prints all below average students
     *
     * @return    a formatted string of all below average students
     */
    public String printBelowAverage()
    {
        // initialize varibles needed
        String list = "";
        double averageGpa = averageGpa();
        
        //iterate through ArrayList and compare Gpas
        for(int i = 0; i < students.size(); i++)
        {   
            if (students.get(i).getGpa() < averageGpa)
            {
                list += students.get(i).toString() + "\n"; 
            }
        }
        
        return list;
    }
    
    /**
     * Finds the youngest below average student
     *
     */
    public String youngBelow()
    {
        //initialize needed variables
        int index = 0;
        double averageGpa = averageGpa();
        
        //iterate through ArrayList and compare ages and Gpas
        for(int i = 0; i < students.size(); i++)
        {   
            if (students.get(i).getGpa() < averageGpa && students.get(i).getAge() <= students.get(index).getAge())
            {
                index = i;
            }
        }
        
        //print the student
        return students.get(index).toString();
    }
    
    
    /**
     * calculates the age of below average students in the ArrayList
     *
     * @return    calculated average age of below average students
     */
    public double averageBelowAge()
    {
        // initialize needed variables
        double average = 0;
        double averageGpa = averageGpa();
        
        //iterate through ArrayList and add the ages of below average students
        for(int i = 0; i < students.size(); i++)
        {   
            if (students.get(i).getGpa() < averageGpa)
            {
                average += students.get(i).getAge();
            }
        }
        
        //divide by amount of students and set to 2 decimal places
        average = average / belowAverage();
        average = Math.round(average * 100) / (double) 100;
        
        return average;
    }
    
    public String toString()
    {
        //initialize return value
        String list = "";
        
        //iterate through ArrayList and add students.toString to return value
        for(int i = 0; i < students.size(); i++)
        {
            list += students.get(i).toString() + "\n"; 
        }
        
        return list;
    }
}
