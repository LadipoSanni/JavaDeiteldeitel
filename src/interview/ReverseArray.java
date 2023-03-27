package interview;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArr(char[] aray) {
        int start = 0;
        int end = aray.length-1;
        char temp;

        while (start < end){
            temp = aray[start];
            aray[start] = aray[end];
            aray[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(aray));
    }

    public static void main(String[] args) {
        char[] inst = {'s','e','m','i','c','o','l','o','n'};
        reverseArr(inst);
    }
}
