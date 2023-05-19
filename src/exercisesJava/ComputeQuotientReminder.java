package exercisesJava;

public class ComputeQuotientReminder {
    public static void main(String[] args) {
        int numA = 17;
        int numb = 3;
        remainQuotient(numA,numb);
    }

    private static void remainQuotient(int a, int b) {
        int quotient = a/b;
        int remainder = a%b;
        System.out.println(quotient);
        System.out.println(remainder);
    }
}
