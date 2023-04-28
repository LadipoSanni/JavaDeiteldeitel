package exercisesJava;

import java.util.ArrayList;
import java.util.List;

public class MissingNumberCheck {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,7,9};
        checkMissingNumber(numbers);
    }

    private static void checkMissingNumber(int[] numbers) {
        int previous =0;
        int now = 0;
        List<Integer> missingNumbers = new ArrayList<>();

        for (int i = previous; i < numbers.length; i++) {
            previous = numbers[i];
            if (previous-now>=2){
                now = numbers[i];
                missingNumbers.add(now);
            }
            System.out.println(previous);
        }
        System.out.println(missingNumbers + "is missing");
    }
}
