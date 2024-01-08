package interview;


import java.util.Scanner;

public class Tasking {
    public static void main(String[] args) {
       int a = 0;
       int b = 0;
       String op = null;
       runtask(a, op, b);
    }

    private static void runtask(int a, String op, int b) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        a = input.nextInt();
        System.out.println("enter an operand");
        op = input.next();
        System.out.println("Enter second number");
        b = input.nextInt();

        final String sum = "+";
        final String minus = "-";
        final String multiply = "*";
        final String divide = "/";
        final String modulo = "%";
        int result = 0;
        switch (op) {
            case sum -> {
                result = a + b;
                System.out.println(result);
            }
            case minus -> {
                result = a - b;
                System.out.println(result);
            }
            case multiply -> {
                result = a * b;
                System.out.println(result);
            }
            case divide -> {
                result = a / b;
                System.out.println(result);
            }
            case modulo -> {
                result = a % b;
                System.out.println(result);
            }
            default -> System.out.println("This is not an operand for this task. you get the default result = 0");
        }
    }
}
