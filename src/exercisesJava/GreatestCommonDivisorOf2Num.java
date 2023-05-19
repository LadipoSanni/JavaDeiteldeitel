package exercisesJava;

import java.util.ArrayList;

public class GreatestCommonDivisorOf2Num {
    public static void main(String[] args) {
        int a = 60;
        int b = 36;
        greatestComDiv(a, b);
    }

    private static void greatestComDiv(int a, int b) {
        int gcd = 0;

        while (b > 0) {
            int remainder = a % b;
            a = b;
            b =  remainder;
            if (b==0){
                gcd= a;
                System.out.println(gcd);
                break;
            }
        }
    }



//      36 = 2 x 2 x 3 x 3
//      60 = 2 x 2 x 3 x 5
//  GCD = Multiplication of common factors
//         =  2 x 2 x 3
//    *****************
//         =  12
}
