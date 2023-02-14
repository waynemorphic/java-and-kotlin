package programs;

/*
HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to 
these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade
up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a 
failing grade.
Examples

grade = 84 round to 85 (85 - 84 is less than 3)
grade = 29 do not round (result is less than 40)
grade = 57 do not round (60 - 57 is 3 or higher)
Given the initial value of grade for each of Sam's n students, write code to automate the 
rounding process.

Function Description

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

int grades[n]: the grades before rounding
Returns

int[n]: the grades after rounding as appropriate
Input Format

The first line contains a single integer, , the number of students.
Each line i of the n subsequent lines contains a single integer, grades[i].

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
 */

import java.util.*;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades){
        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer i : grades){
            if (i % 5 >= 3 && i >= 38){
                i += (5 - i % 5);
            }
            roundedGrades.add(i);
        }
        return roundedGrades;
    }

    public static void main(String[] args){
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        System.out.println(GradingStudents.gradingStudents(grades));

    }
}
