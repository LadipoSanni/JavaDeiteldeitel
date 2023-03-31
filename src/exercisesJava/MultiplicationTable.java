package exercisesJava;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 2;
        generateMultiplTable(num);
    }

    private static void generateMultiplTable(int num) {
            int result = 0;
        for (int i = 1; i <12; i++) {
            for (int j = 1; j <= 12; j++) {
                result = num * j;
                System.out.println(num + " * "+ j +" = "+result);
            }
            num++;
        }
        System.out.println();
        System.out.println();
    }
}
