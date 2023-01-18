package chapter4_6;

import java.util.Scanner;

public class ExamAnalysis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //initialising variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        //process 10 students using counter-controlled loop
        while( studentCounter <= 10){
            //prompt user to enter the next result
            System.out.println("Enter result(1= pass, 2= fail): ");
            int result = scanner.nextInt();

            //if...else is nested in the while loop
            if (result == 1){
                passes = passes+1;
            }
            else {
                failures = failures+ 1;
            }

            //  increment student counter so loop eventually terminates
            studentCounter = studentCounter + 1;
        }
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

//        determine whether more than 8 students passed
                if (passes > 8){
                    System.out.println("Bonus to instructor!");
                }
                else {
                    System.out.println("instructor try do well make ur students pass " +
                            "well well u hear!");
                }
    }
}
