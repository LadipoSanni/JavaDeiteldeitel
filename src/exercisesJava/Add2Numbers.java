package exercisesJava;

public class Add2Numbers {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 13;
        addTwoNumbers(num1,num2);
    }

    private static void addTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Adding 2 integers "+num1+" + "+ num2 +" = "+ result);
    }
}
