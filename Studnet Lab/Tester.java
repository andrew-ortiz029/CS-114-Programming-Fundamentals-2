import java.util.ArrayList;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;
import java.util.*;

public class Tester
{
    //main method 
    public static void main(String[] args) throws Exception
    {
        //create students object
        Students tester = new Students();
        
        //Create output file and PrintWriter obj
        new File("output.txt").createNewFile();
        PrintWriter print = new PrintWriter("output.txt");
        print.flush();
        
        //printing the ArrayList
        tester.readFile("/Users/Andrew Ortiz/Desktop/Studnet Lab/Students.txt");
        System.out.println(tester.toString());
        
        print.println(tester.toString());
        
        //best Gpa
        System.out.println("Student with the best Gpa: ");
        System.out.println(tester.bestGpa());
        
        print.println("\nStudent with the best Gpa: ");
        print.println(tester.bestGpa());
        
        //average Gpa
        System.out.println("\nAverage Gpa: ");
        System.out.println(tester.averageGpa());
        
        print.println("\nAverage Gpa: ");
        print.println(tester.averageGpa());
        
        //num of Above and Below average Gpa
        System.out.println("\nNumber of above average students: ");
        System.out.println(tester.aboveAverage());
        System.out.println("\nNumber of below average students: ");
        System.out.println(tester.belowAverage());
        
        print.println("\nNumber of above average students: ");
        print.println(tester.aboveAverage());
        print.println("\nNumber of below average students: ");
        print.println(tester.belowAverage());
        
        //print all students with above average Gpa
        System.out.println("\nStudents with above average Gpa: ");
        System.out.println(tester.printAboveAverage());
        
        print.println("\nStudents with above average Gpa: ");
        print.println(tester.printAboveAverage());
        
        //youngest student with below average Gpa
        System.out.println("\nYoungest student with below average Gpa: ");
        System.out.println(tester.youngBelow());
        
        print.println("\nYoungest student with below average Gpa: ");
        print.println(tester.youngBelow());
        
        //Average age of students with below average Gpa
        System.out.println("\nAverage age of below average students: ");
        System.out.println(tester.averageBelowAge());
        
        print.println("\nAverage age of below average students: ");
        print.println(tester.averageBelowAge());
        
        //close file
        print.close();
    }
}
