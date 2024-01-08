package exercisesJava;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearOption = scanner.nextInt();
        checkLeapYear(yearOption);
    }

    private static void checkLeapYear(int yearOption) {
        if (yearOption%4==0){
            System.out.println("This year "+yearOption+" is a leap year");
        }
        else {
            System.out.println("This year "+yearOption+" is a not leap year");
        }

    }
}
