/*

Program: CourseGrades.java          Last Date of this Revision: December 16, 2024

Purpose: Simulates a grade book for a class with 12 students that each have 5 test scores.

Author: Misha Stanev 
School: CHHS
Course: Computer Programming 20
 

*/


package Masterys;
import java.util.*;

public class CourseGrades {
    
    public int StudentNum = 3;  // Number of students
    public int Quizzes = 5;      // Number of quizzes per student
    private int[][] grades;      // array to store student grades

    // Method to initialize the grades array with student numbers and quiz numbers
    public void getStudent() {
        grades = new int[StudentNum][Quizzes];  // Initialize the array
    }

    // Method to return grades 
    public int[][] showStudent() {
        return grades;
    }

    // Method to calculate the average grade for a student
    public double studentAvg(int stuNum) {
        int sum = 0;
        
        // Loop through each quiz to calculate the sum of grades for the student
        for (int i = 0; i < grades[0].length; i++) {
            sum += grades[stuNum - 1][i];  
        }
        
        // Calculate the average grade for the student
        int stuAvg = sum / grades[0].length;
        return stuAvg; 
    }

    // Method to calculate the average grade for a specific test
    public double testAvg(int testNum) {
        int sum = 0;
        double avg = 0;

        // Loop through each student to calculate the sum of grades for the specified test
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i][testNum - 1]; 
        }

        // Calculate the average grade for the test
        avg = (double)sum / grades.length;
        return avg; 
    }

    // Main method where the program starts
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        CourseGrades student = new CourseGrades();  // Create an instance of the CourseGrades class
        
        student.getStudent();  // Initialize the grades array
        
        // Collect grades for each student and each quiz
        for (int i = 0; i < student.StudentNum; i++) {
            for (int x = 0; x < student.Quizzes; x++) {
                System.out.print("Enter the " + (i + 1) + " student grade: ");
                student.grades[i][x] = userinput.nextInt();
            }
        }

        // Display the grades of all students
        System.out.println("Here are the student grades: ");
        for (int i = 0; i < student.StudentNum; i++) {
            System.out.print("Student number: " + (i + 1) + " | ");
            for (int x = 0; x < student.Quizzes; x++) {
                System.out.print(student.grades[i][x] + " ");  
            }
            System.out.println(" ");  
        }

        // Menu for user to choose whether to get student or test average
        System.out.println("1. Get the student average.");
        System.out.println("2. Get the test average.");
        
        int userchoose = userinput.nextInt();  // Store user's choice
        
        // Perform action based on user's choice
        switch (userchoose) {
            case 1:
                System.out.print("Enter the student number you want to find the average: ");
                int stu = userinput.nextInt();  // Get student number
                double average = student.studentAvg(stu);  // Calculate student average
                System.out.print("The average of the " + stu + " student is: " + average);
                break;
            case 2:
                System.out.print("Enter the test you want to find the average: ");
                int test = userinput.nextInt();  // Get test number
                average = student.testAvg(test);  // Calculate test average
                System.out.print("The average of the " + test + " test is: " + average);
                break;
        }
    }
}


/* Screen Dump
 
 Enter the 1 student grade: 54
Enter the 1 student grade: 76
Enter the 1 student grade: 34
Enter the 1 student grade: 65
Enter the 1 student grade: 23
Enter the 2 student grade: 65
Enter the 2 student grade: 87
Enter the 2 student grade: 34
Enter the 2 student grade: 23
Enter the 2 student grade: 43
Enter the 3 student grade: 54
Enter the 3 student grade: 65
Enter the 3 student grade: 76
Enter the 3 student grade: 34
Enter the 3 student grade: 23
Here are the student grades: 
Student number: 1 | 54 76 34 65 23  
Student number: 2 | 65 87 34 23 43  
Student number: 3 | 54 65 76 34 23  
1. Get the student average.
2. Get the test average.
2
Enter the test you want to find the average: 5
The average of the 5(th) test is: 29.666666666666668
 
 
 
 
 
Enter the 1 student grade: 65
Enter the 1 student grade: 98
Enter the 1 student grade: 45
Enter the 1 student grade: 76
Enter the 1 student grade: 98
Enter the 2 student grade: 34
Enter the 2 student grade: 23
Enter the 2 student grade: 65
Enter the 2 student grade: 87
Enter the 2 student grade: 89
Enter the 3 student grade: 76
Enter the 3 student grade: 56
Enter the 3 student grade: 45
Enter the 3 student grade: 34
Enter the 3 student grade: 87
Here are the student grades: 
Student number: 1 | 65 98 45 76 98  
Student number: 2 | 34 23 65 87 89  
Student number: 3 | 76 56 45 34 87  
1. Get the student average.
2. Get the test average.
1
Enter the student number you want to find the average: 1
The average of the 1th student is: 76.0
 
 */
