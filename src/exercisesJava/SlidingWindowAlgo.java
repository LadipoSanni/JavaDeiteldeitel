package exercisesJava;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowAlgo {
    public static void main(String[] args) {
        int target = 19;
        int range = 4;
        int[] slider = {2,7,6,4,4,2,5,8,4};
        slideTheWindow(slider,target);
        slideTheWindow(slider,target,range);
    }

    private static void slideTheWindow(int[] slider, int target, int range) {
        List<Integer> tempBox = new ArrayList<>();
        int tempTarget = 0;

        for (int i = 0; i < slider.length; i++) {
            tempBox.add(slider[i]);
            tempTarget += slider[i];

            if (tempBox.size() > range){
               int num = tempBox.remove(0);
               tempTarget -= num;
            }

            if (tempBox.size() == range && target == tempTarget){
                System.out.println("The sum of " + tempBox + " equals " + target);
            }
        }

    }


    private static void slideTheWindow(int[] slider, int target) {
        int firstSlider = 0;

        for (int i = firstSlider; i <= slider.length-3; i++) {
            firstSlider = slider[i];
            int secondSlider = slider[i+1];
            int thirdSlider = slider[i+2];
            int sum = firstSlider+secondSlider+thirdSlider;
            if (sum == target) {
                System.out.println(firstSlider + "+" + secondSlider + "+" + thirdSlider + "=" + sum);
            }
        }
    }

/*    private static void slideTheWindow(int[] slider, int target, int range) {
        List<Integer> tempBox = new ArrayList<>();

        int firstSlider = 0;
        for (int i = firstSlider; i < slider.length-range; i++) {
            int lastSlider = slider[i+range-1];
            int sum = 0;

            for (int j = i; j < lastSlider ; j++) {
                tempBox.add(slider[j]);
                sum += slider[j];


                if (sum==target){
                    System.out.println("All element in the range sum up to: "+sum);
//                    sum=0;
//                    tempBox.remove(slider[firstSlider]);
                }
// {2,7,6,4,4,2,5,8,4}
            }

        }
    }*/
}



