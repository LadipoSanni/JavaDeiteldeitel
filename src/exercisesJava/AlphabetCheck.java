package exercisesJava;

public class AlphabetCheck {
    public static void main(String[] args) {
        char opshon = ']';
        checkIfItsAlphabet(opshon);
    }

    private static void checkIfItsAlphabet(char opshon) {
        String alphabet = "[A-Za-z]";
        if (String.valueOf(opshon).matches(alphabet)){
            System.out.println("This letter: "+opshon+", is an alphabet");
        }else{
        System.out.println("This character: "+opshon+", is not an alphabet");
        }
    }

}
