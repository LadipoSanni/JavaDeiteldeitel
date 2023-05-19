package interview;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] k = {1,5,100,4,10};
        getProductArray(k);

    }
    public static int[] getProductArray(int[] k) {
        int n = k.length;
        int[] product = new int[n];

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * k[i - 1];
        }

        rightProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * k[i + 1];
        }

        for (int i = 0; i < n; i++) {
            product[i] = leftProduct[i] * rightProduct[i];
        }
        System.out.println(Arrays.toString(product));
        return product;
    }

}
