package exercisesJava;

import java.util.ArrayList;
import java.util.List;

public class LCMOf2Numbers {
    public static void main(String[] args) {
        int a = 16;
        int b = 38;
        findLCM(a, b);

    }

    private static void findLCM(int a, int b) {
        int lcm = 1;
        List<Integer> casingA = new ArrayList<>();
        List<Integer> casingB = new ArrayList<>();
        int divisor = 1;
        int ansA;
        int ansB;
        while (a % 2 == 0 || a % 3 == 0) {
            if (a % 2 == 0) {
                divisor = 2;
            } else {
                divisor = 3;
            }
            ansA = a / divisor;
            a = ansA;
            casingA.add(divisor);
            lcm = lcm * divisor;
        }
        lcm *= a;
        casingA.add(a);
        while (b % 2 == 0 || b % 3 == 0) {
            if (b % 2 == 0) {
                divisor = 2;
            } else {
                divisor = 3;
            }
            ansB = b / divisor;
            b = ansB;
            casingB.add(divisor);
            if (casingA.indexOf(divisor) != casingB.indexOf(divisor)) {
                lcm = lcm * divisor;
            }
        }
        casingB.add(b);
        lcm *= b;
        System.out.println(lcm);
        System.out.println(casingA);
        System.out.println(casingB);
    }
}