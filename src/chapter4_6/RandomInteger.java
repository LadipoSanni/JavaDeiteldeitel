package chapter4_6;

import java.security.SecureRandom;

public class RandomInteger {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for (int counter = 0; counter < 5; counter++) {
            int drop = 1 + randomNumbers.nextInt(90);

            System.out.printf("%d ", drop);

//            if(counter % 10 == 0 ){
//                System.out.println();
//            }
        }
    }
}
