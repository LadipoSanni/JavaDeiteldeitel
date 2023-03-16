
import java.util.Arrays;


public class TestClass {
    public static void main(String[] args) {
        int[] table= {1,2,6,8,9};
        table[0] = 9;
        table[1] = 8;
        table[3] = 2;
        table[4] = 1;
        System.out.println(Arrays.toString(table));

    }
}
