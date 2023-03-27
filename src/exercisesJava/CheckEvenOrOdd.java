package exercisesJava;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        int num = 4;
        oddEvenChecker(num);
    }

    private static void oddEvenChecker(int num) {
        if (num%2==0){
            System.out.println("This number is even number");
        }else {
            System.out.println("This number is an odd number");
        }
    }
}
