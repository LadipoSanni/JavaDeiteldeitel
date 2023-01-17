package chapter4_6;
//solving the class-average problem using counter control iteration.

import java.util.Scanner;

public class ClassAverage {
//    This is the main method used to run java application
    public static void main(String[] args) {
//      this is the statement to prompt data input and source of data collection
        Scanner collect = new Scanner(System.in);
//        declaration and initialisation of class variables
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){ // loop 10 times
            System.out.println("Enter grade: "); //prompt
            int grade = collect.nextInt(); //collection object
            total = total + grade; // adds grade to total
            gradeCounter = gradeCounter+1; // increment gradeCounter by 1
        }
//      calculates the average of the total grade
        int average = total/10;

        //display total and average of grades
        System.out.printf("%n Total of all grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);
    }
}
