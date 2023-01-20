package chapter4_6;

public class Increment {
    public static void main(String[] args) {

        int c = 5;
        System.out.printf("c before increment: %d%n", c);
        System.out.printf("  post increment c: %d%n", c++);
        System.out.printf(" after the increment c: %d%n", c);

        System.out.println();

//        demonstrate prefix increment operator
        c=5;
        System.out.printf("c before the increment c: %d%n", c);
        System.out.printf("c pre-incrementing c: %d%n", ++c);
        System.out.printf("c after-incrementing c: %d%n", c);
    }
}
