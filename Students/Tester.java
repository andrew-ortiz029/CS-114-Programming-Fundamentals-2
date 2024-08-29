/**
 * @author Benjamin W.
 * @version 24.05.2021
 * 
 * README: Speaking of younger students, I'm actually 17. I graduated secondary school at 16 last year.
 * 
 * If you're reading this, please do not copy/paste code from here. This resource is only meant to display potential solution(s) to the lab if you're
 * struggling with it. The code should compile and run properly, in addition to generating a proper output. Multi-line comments have been given
 * for Javadoc purposes.
 */

//Import dependencies
import java.io.*;
import java.util.*;

public class Tester {
    /**
     * main() - Standard main method declaration.
     */
    public static void main (String[] args) throws Exception {
        //Initialise students object.
        Students students = new Students();
        
        //Create new output.txt file in case it doesn't exist already, initialise PrintWriter.
        new File("output.txt").createNewFile();
        PrintWriter output_log = new PrintWriter("output.txt");
        output_log.flush(); //Make sure file is cleared each time the program is run.
        
        //Read from Students.txt and output to console.
        students.readFile("Students.txt");
        students.println(output_log, "2. All Students:");
        students.println(output_log, students.toString());
        
        //Student object with the best GPA, print to 2 decimal places.
        students.println(output_log, "\n3. Student with the Best GPA:");
        students.printBestStudent(output_log);
        
        //Print the average GPA of all students.
        students.println(output_log, "\n4. Average Student GPA: " + String.valueOf(students.fetchAverageGPA()));
        
        //Print all Student objects that scored above average, and all that scored below average.
        students.printDemographics(output_log);
        
        //Print youngest student with a below average GPA.
        students.println(output_log, "\n7. Youngest Student with Below Average GPA:");
        students.printYoungestStudentBelowAverageGPA(output_log);
        
        //Print the average age of all students with a below average GPA.
        students.println(output_log, "\n8. Average Age of Students with Below Average GPA:");
        students.printBelowAverageGPAAge(output_log);
        
        //Close PrintWriter and write contents to output.txt.
        output_log.close();
    }
}