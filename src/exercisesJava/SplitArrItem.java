package exercisesJava;

import java.util.Arrays;

public class SplitArrItem {
    public static void main(String[] args) {
        int[] splitOptions = {20,21,10,31,12,54};
        splitAndAdd(splitOptions);
    }

    private static void splitAndAdd(int[] splitOptions) {
        int[] newArray = new int[splitOptions.length*2];
        int manualCounter = 0;

        for (int i = 0; i < newArray.length; i++) {
            if (i < 6) {
                int valueA = splitOptions[i] / 10;
                int valueB = splitOptions[i] % 10;
                newArray[manualCounter] = valueA;
                newArray[manualCounter + 1] = valueB;
                manualCounter += 2;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}

