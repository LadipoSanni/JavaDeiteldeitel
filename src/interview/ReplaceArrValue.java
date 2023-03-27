package interview;

import java.util.Arrays;

public class ReplaceArrValue {
    public static void arrValueRepl(int[] arr,int arrIndex, int replacement){
        if (arrIndex>arr.length-1){
            System.out.println("The index "+ arrIndex + " is out of bound " +
                    "for array "+ Arrays.toString(arr));
        }else System.out.println("Array before replacement "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if(i == arrIndex){
                arr[i] = replacement;
            }
        }
        System.out.println("Array after replacement "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] swapOptions = {7,2,3,1,6,8};
        int swapValue = 4;
        int index = 2;
        arrValueRepl(swapOptions,index,swapValue);

    }
}
