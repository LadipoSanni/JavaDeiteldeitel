package exercisesJava;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumberCheck {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,7,9};
//        int[] numbers = {1,10,7,2,-22,8,3,9,4,15,7,17,-2,24,22};
//        int[] numbers = {2,4,6,8,-14,18,12,14,16,20};
        checkMissingNumber(numbers);
    }

    private static void checkMissingNumber(int[] numbers) {
        Arrays.sort(numbers);
        int prev = 0;
        int next = 0;
        int numMissing = 0;
        ArrayList<Integer> missingNumbers = new ArrayList<>();
        ArrayList<Integer> tempCasing = new ArrayList<>();
            for (int i = 0; i < numbers.length; i++) {
                next = numbers[i];
                tempCasing.add(next);
                if (tempCasing.size()==2){
                    prev = tempCasing.get(0);
                    next = tempCasing.get(1);
                    numMissing = next-prev;
                    if (numMissing!=1&&next>1&&prev>1){
                        while (prev<next-1){
                        missingNumbers.add(++prev);
                        }
                    }
                    prev = next;
                    tempCasing.remove(tempCasing.get(0));
                }
            }
        System.out.println("These are the List of missing numbers: "+missingNumbers);
    }
}