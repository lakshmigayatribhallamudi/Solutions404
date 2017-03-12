package com.mani.gayi.hackerrank;

/*
 * HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
For example,  will be rounded to  but  will not be rounded because the rounding would result in a number that is less than .

Given the initial value of  for each of Sam's  students, write code to automate the rounding process. For each , round it according to the rules above and print the result on a new line.

Input Format

The first line contains a single integer denoting  (the number of students). 
Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

Constraints

Output Format

For each  of the  grades, print the rounded grade on a new line.

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
 * */



public class GradingStudents {

    public static void main(String[] args) {
    	int n[] ={73,67,38,33};
        for(int a0 = 0; a0 < n.length; a0++){
            int result = calculateGrades(n[a0]);
            System.out.println(result);
        }
    }
    
    public static int calculateGrades(int grade)
    {
        // calculating the grade remainder...
        int graderemainder = grade%5;
        int valueneed = 5 - graderemainder;
        //if the grade remainder is greater than 3 based on the requirement and next multiple of 5 for the given grade should be           //greater than 40
        if(graderemainder>=3 && valueneed+grade>=40)
            {
            return valueneed + grade;
        }
       
            return grade;
       
    }
}

