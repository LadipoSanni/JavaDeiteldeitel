package exercisesJava;

public class LeapyearChecker {
    public static void main(String[] args) {
        int yearOption = 04;
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
