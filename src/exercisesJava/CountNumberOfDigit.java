package exercisesJava;

public class CountNumberOfDigit {
    public static void main(String[] args) {
        int numOpt = 36477;
        countNumberOfDigit(numOpt);
    }

    private static void countNumberOfDigit(int numOption) {
        String check = String.valueOf(numOption);
        int result = 0;
        for (int i = 0; i < check.length(); i++) {
             result++;
        }
        System.out.println(result);
    }
}
