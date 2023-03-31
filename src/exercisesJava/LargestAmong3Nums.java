package exercisesJava;

import java.util.Arrays;

public class LargestAmong3Nums {
    public static void main(String[] args) {

        int[] largestOptions = {6,5,4};
        largestNum(largestOptions);
    }

    private static void largestNum(int[] largestOptions) {
        int highest = 0;
        int index = 0;
        for (int i = 0; i < largestOptions.length; i++) {
            if(largestOptions[i]>highest){
                highest= largestOptions[i];
                index = i;
            }
        }
        System.out.println(highest+ " is the highest number @ index "+
                Arrays.toString(new int[]{index}));
        
    }
}
