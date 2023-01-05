import java.util.Scanner;

public class ComparisonOperator {
    static int classDigit = 2;
    public static void main(String[] args) {
//        Instantiating the Scanner Object= input
        Scanner scanner = new Scanner(System.in);
//        the scanner object collects the value from the user of type int
//        as the system prompt the user for input
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1*classDigit);
        System.out.println(num2*classDigit);
        System.out.println(num2*6);
        System.out.println(num2*2+4);
//          using the IF() block of code to validate the statement.
//        If an if block is valid it gets executed. if
//        not the program skips the If() block of code
        if(num1 == num2){
            System.out.printf("%d==%d%n", num1,num2);
        }
        if(num1 != num2){
            System.out.printf("%d!=%d%n", num1,num2);
        }
        if(num1 < num2){
            System.out.printf("%d<%d%n", num1,num2);
        }
        if(num1 > num2){
            System.out.printf("%d>%d%n", num1,num2);
        }
        if(num1 <= num2){
            System.out.printf("%d<=%d%n", num1,num2);
        }
        if(num1 >= num2){
            System.out.printf("%d>=%d", num1,num2);
        }

    }
}
