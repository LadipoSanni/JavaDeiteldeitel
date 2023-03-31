package exercisesJava;

import java.util.Scanner;

public class Numberfactorial {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        factorialOfNum(num);
    }

    private static void factorialOfNum(int num) {
        int resot=1;
        while (num>=1) {
            resot *= num;
            num--;
        }
        System.out.println("The factorial of the number input is: "+ resot);
    }
}
