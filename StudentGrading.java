package Day2Challange;

/*


Exercise 4: Student Grading
Scenario: You are developing a student grading application for a teacher. You need to implement a feature that calculates the average grade of students in a class.
Given : Grades for Five Students as : 8,9,5,4,8
Task: Write a program that calculates their average grade. Print the average grade.
// here also use appropriate data type.

 */
public class StudentGrading {

    public static void main(String[] args) {

        float student1Grade = 8;
        float student2Grade = 9;
        float student3Grade = 5;
        float student4Grade = 4;
        float student5Grade = 8;

        float averageGrade = 0;

        averageGrade = (student1Grade + student2Grade + student3Grade + student4Grade + student5Grade) / 5;

        System.out.println("Average grade is " + averageGrade);


    }
}
