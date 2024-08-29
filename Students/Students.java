/**
 * @author Benjamin W.
 * @version 24.05.2021
 */

//Import dependencies
import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class Students {
    //Declare Student instance variables.
    private ArrayList<Student> students;
    
    /**
     * Students() - substantiates a new Students constructor and initialises ArrayList<Student> students.
     */
    
    public Students () {
        //Initialise instance variable - students
        students = new ArrayList<Student>();
    }
    
    /**
     * fetchAveragesAsObjects() - Used for both internal and external purposes.
     * 
     * @return A 2D ArrayList of all students that: { scored_below_average, scored_above_average }.
     */
    
    public ArrayList<ArrayList<Student>> fetchAveragesAsObjects () throws Exception {
        //Initialise below_average_students and above_average_students.
        ArrayList<ArrayList<Student>> all_students = new ArrayList<ArrayList<Student>>();
        all_students.add(new ArrayList<Student>());
        all_students.add(new ArrayList<Student>());
        
        //Iterate through all students, appending to ArrayList if the student scored above the average GPA.
        for (Student local_student : students) {
            //Dynamically fetch value of 'gpa' field from local_student and append to ArrayList<Student> local_students if GPA is exceeded.
            double local_GPA = Double.parseDouble(local_student.fetchValue("gpa").toString());
            
            //Append to either the first or second sub-ArrayList if object is determined to beneath the mean GPA.
            if (local_GPA < fetchAverageGPA()) { all_students.get(0).add(local_student); };
            if (local_GPA > fetchAverageGPA()) { all_students.get(1).add(local_student); };
        }
        
        return all_students;
    }
    
    /**
     * fetchAverageGPA() - returns average GPA as a double, rounded to 2 decimal places.
     * 
     * @return A double rounded to two decimal places representing the average GPA of all students.
     */
    
    public double fetchAverageGPA () throws Exception {
        //Initialise local GPA_sum variable.
        double GPA_sum = 0;
        
        //Iterate through all students.
        for (Student local_student : students) {
            //Dynamically fetch value of 'gpa' field from local_student and add to GPA_sum.
            GPA_sum += Double.parseDouble(local_student.fetchValue("gpa").toString());
        }
        
        //Return neatly formatted double to hundreths place. Remember to cast.
        return (double) Math.round((GPA_sum/students.size())*100)/100;
    }
    
    /**
     * fetchAverages() - fetches the mean distribution of students that fell on both sides of the normal curve as a 1-D array.
     * 
     * @return A 1-D integer count array of all students that: { scored_below_average, scored_above_average }.
     */
    
    public int[] fetchAverages () throws Exception {
        int[] mean_distribution = { 0, 0 }; //{ below_average_students, above_average_students }
        
        for (Student local_student : students) {
            //Increment to either below_average_students or above_average_students, depending on result.
            double local_GPA = Double.parseDouble(local_student.fetchValue("gpa").toString());
            mean_distribution[0] += (local_GPA < fetchAverageGPA()) ? 1 : 0;
            mean_distribution[1] += (local_GPA > fetchAverageGPA()) ? 1 : 0;
        }
        
        return mean_distribution;
    }
    
    /**
     * printBelowAverageGPAAge() - prints the mean age of students with a below average GPA to 2 decimal places.
     * 
     * @param arg0_print_writer Used to log to a file output stream.
     */
    
    public void printBelowAverageGPAAge (PrintWriter arg0_print_writer) throws Exception {
        double below_avg_age = 0; //Cumulative sum of the age of all Student elements with a below average GPA.
        
        //Iterate over all students with a below average GPA, as 0 is the index for the bottom 50th percentile.
        for (Student local_student : fetchAveragesAsObjects().get(0)) {
            below_avg_age += (int) local_student.fetchValue("age");
        }
        
        //Print formatted string to two decimal places using the *100/100 trick.
        println(arg0_print_writer, String.valueOf(Math.round((below_avg_age/fetchAveragesAsObjects().get(0).size())*100)/100));
    }
    
    /**
     * printBestStudent() - prints the Student object with the highest GPA.
     * 
     * @param arg0_print_writer Used to log to a file output stream.
     */
    
    public void printBestStudent (PrintWriter arg0_print_writer) throws Exception {
        Student current_best_student = new Student("Dropout", 0, 0); //Used because of ternary operator comparisons.
        for (Student local_student : students) {
            current_best_student = ((double) local_student.fetchValue("gpa") > (double) current_best_student.fetchValue("gpa")) ?
                local_student : current_best_student; //Only override if the person has a higher GPA than the previous person with the highest GPA.
        }
        
        //Print statement.
        println(arg0_print_writer, current_best_student.toString());
    }
    
    /**
     * printDemographics() - prints all students that scored below/above average.
     * 
     * @param arg0_print_writer Used to log to a file output stream.
     */
    
    public void printDemographics (PrintWriter arg0_print_writer) throws Exception {
        for (ArrayList<Student> local_student_demographic : fetchAveragesAsObjects()) {
            //Return formatted header as a ternary operator for compressed formatting, including the number that scored above/below that GPA.
            String local_header = (fetchAveragesAsObjects().get(0).equals(local_student_demographic)) ? 
                "\n5/6. Below Average Students: " + String.valueOf(fetchAverages()[0]) + "\n---" : //Below Average Students header
                "\n5/6. Above Average Students: " + String.valueOf(fetchAverages()[1]) ; //Above Average Students header
            
            //Print to console and output file.
            println(arg0_print_writer, local_header);
        }
        
        //Iterate again to print every child Student object that scored a higher GPA.
        for (Student local_student : fetchAveragesAsObjects().get(1)) {
            //Print Student local_student object using toString().
            println(arg0_print_writer, local_student.toString());
        }
    }
    
    /**
     * println() - used for simultaneous printing.
     * 
     * @param arg0_print_writer Used to log to a file output stream.
     * @param arg1_string       String to log to both file output and terminal.
     */
    
    public void println (PrintWriter arg0_print_writer, String arg1_string) {
        //Print to file, then to ouutput stream.
        arg0_print_writer.println(arg1_string);
        System.out.println(arg1_string);
    }
    
    /**
     * printYoungestStudentBelowAverageGPA() - prints the youngest student with a below average GPA.
     * 
     * @param arg0_print_writer Used to log to a file output stream.
     */
    public void printYoungestStudentBelowAverageGPA (PrintWriter arg0_print_writer) throws Exception {
        Student youngest_student_below_avg = new Student("Methuselah", 1000, 0.00); //Used because of ternary opreator comparisons.
        double below_avg_age = 0;
        for (Student local_student : fetchAveragesAsObjects().get(0)) { //0 is the index for the below average students demographic.
            youngest_student_below_avg = ((int) local_student.fetchValue("age") < (int) youngest_student_below_avg.fetchValue("age")) 
                ? local_student : youngest_student_below_avg; //Only override if the person is younger than the previous youngest person.
            below_avg_age += (int) local_student.fetchValue("age");
        }
        
        //Print statement.
        println(arg0_print_writer, youngest_student_below_avg.toString());
    }
    
    /**
     * readFile() dynamically reads from Students.txt and substantiates Student objects from the list before appending them to ArrayList.
     * 
     * @param arg0_file_path The file path to read from.
     */
    public void readFile (String arg0_file_path) throws FileNotFoundException {
        //Clear previous students array first in case method is called more than once.
        students.clear();
        
        //Declare file reader and begin reading from file, in addition to a local_student Object array used to store data values per Student Object.
        Scanner students_reader = new Scanner(new File(arg0_file_path));
        ArrayList<Object> local_student = new ArrayList<Object>();
        int local_tick = 0;
        
        //Iterate through all lines in file.
        while (students_reader.hasNextLine()) {
            //Increment local_tick to keep track of iterative count.
            local_tick++;
            
            //Fetch local_data from the next line and append it to ArrayList local_student_data.
            Object local_student_data = students_reader.nextLine();
            local_student.add(local_student_data);
            
            //Clear local_student_data every 3 ticks, and push a new Student object to ArrayList students.
            if (local_tick % 3 == 0) {
                //Add new Student object via constructor.
                students.add(new Student(
                    local_student.get(0).toString(), 
                    Integer.parseInt(local_student.get(1).toString()), 
                    Double.parseDouble(local_student.get(2).toString())
                ));
                local_student.clear();
            }
        }
        
        //Close file reader.
        students_reader.close();
    }
    
    /**
     * toString() - returns a dynamically formatted string from the students array list.
     * 
     * @return Returns a neatly formatted string from ArrayList<Student> Students.
     */
    
    public String toString () {
        //Initialise processed_string variable - all child .toString() appendices are placed here.
        String processed_string = "";
        
        for (Student local_student : students) {
            //Only set a comma and newline if the list has not yet reached its ending index, append local_student.toString() to processed_string.
            String suffix = (students.get(students.size()-1) == local_student) ? "" : ",\n";
            processed_string += local_student.toString() + suffix;
        }
        
        //Return dynamically formatted string with child Student object formatted strings.
        return this.getClass().getSimpleName() + "[" + processed_string + "]";
    }
}
