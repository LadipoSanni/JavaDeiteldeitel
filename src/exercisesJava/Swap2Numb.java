package exercisesJava;

public class Swap2Numb {
    public static void main(String[] args) {
        int a = 23;
        int b = 17;
        swapp(a,b);
    }

    private static void swapp(int a, int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
