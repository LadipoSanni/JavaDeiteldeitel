package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] duplicOptions = {1, 2, 1, 2, 3, 4, 5};

        removDuplicate(duplicOptions);
    }

    private static void removDuplicate(int[] duplicOptions) {
        int len = duplicOptions.length;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if (duplicOptions[j]==duplicOptions[i]){
                    for (int k = j; k < len-1; k++) {
                        duplicOptions[k] = duplicOptions[k+1];
                    }
                    len--;
                }
            }
        }
        int[] result = Arrays.copyOf(duplicOptions, len);
        duplicOptions=result;
        System.out.println(Arrays.toString(duplicOptions));

    }
}
