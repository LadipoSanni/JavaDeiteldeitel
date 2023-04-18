package exercisesJava;

public class DisplayA2ZUsingLoop {
    public static void main(String[] args) {
        String alphabet = "";
        loopAndPrintA2Z(alphabet);
    }

    private static void loopAndPrintA2Z(String alphabet) {
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet = alphabet+i;
        }
        System.out.println(alphabet);
    }
}
