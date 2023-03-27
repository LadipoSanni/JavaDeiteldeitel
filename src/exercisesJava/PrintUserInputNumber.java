package exercisesJava;

import java.util.Scanner;

public class PrintUserInputNumber {
    public static void main(String[] args) {
        printNumber();
    }

    private static void printNumber() {
        Scanner scanner = new Scanner(System.in);
        int outPut = scanner.nextInt();
        System.out.println(outPut);
    }
}

