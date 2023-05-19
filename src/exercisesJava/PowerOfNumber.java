package exercisesJava;

public class PowerOfNumber {
    public static void main(String[] args) {
        int num = 2;
        int power = 6;
        powerOfNum(num, power);
    }

    private static void powerOfNum(int num, int power) {
        int resut = 1;
        while (power>0){
           resut *= num;
           power--;
        }
        System.out.println(resut);
    }
}
