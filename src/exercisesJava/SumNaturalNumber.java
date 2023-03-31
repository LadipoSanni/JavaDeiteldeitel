package exercisesJava;

public class SumNaturalNumber {
    public static void main(String[] args) {
        naturalNumSum();

    }

    private static void naturalNumSum() {
        int[] natSum = {1,2,3,4,5,6,7,8};
        int result = 0;
        for (int i = 0; i < natSum.length; i++) {
            result += natSum[i];
        }
        System.out.println("The sum value of natural numbers from 1 to 8 is: "+result);
    }
}
