import java.util.Scanner;

public class Addition {
    static int classDigit = 2;
    public static void main(String[] args) {
//        Instantiating the Scanner Object= input
        Scanner input = new Scanner(System.in);
//        the scanner object collects the value from the user of type int
//        as the system prompt the user for input
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();

        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
//        Printout using the variable
        System.out.println("Printout using the variable: "+sum);
//        Printout using the formatted specifier
        System.out.printf("%d%n%d%n%d%n",num1,num2,sum);
//        Printing result using the class digit variable
        System.out.println(" Printing result using the class digit variable:");
        System.out.println(sum*classDigit);
    }

}
