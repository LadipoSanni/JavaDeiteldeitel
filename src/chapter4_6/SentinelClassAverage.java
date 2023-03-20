package chapter4_6;

import java.util.Scanner;

public class SentinelClassAverage {
        public static void main(String[] args) {
            Scanner take = new Scanner(System.in);

            int total = 0;  //initialisation of total to 0
            int gradeCounter = 0; //initialisation of gradeCounter to 0


            System.out.println("Enter grade or enter -1 to quit: "); //prompt
            int grade = take.nextInt(); //collection object.take grade

            while (grade != -1){ // loop 10 times
                total = total + grade; // adds grade to total
                gradeCounter = gradeCounter+1; // increment gradeCounter by 1

                System.out.println("Enter grade: "); //prompt for grade or -1 to quit
                //keeps collecting grades until -1 is seen in the data source
                grade = take.nextInt(); //collection object.take grade
            }

            if (gradeCounter != 0){
                //use number with decimal point to calculate grade
                double average = (double) total/ gradeCounter;//right hand side

                //display total and average of grades
                System.out.printf("Class average is %.2f%n", average );
                System.out.printf("%n Total of the %d grades entered is %d%n",gradeCounter, total);
            }
            else { // output appropriate message if -1 is entered first
                System.out.println("No grade were entered");
            }

//

        }
    }


