package exercisesJava;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        char alph = ']';
        checkAlphabet(alph);
    }

    private static void checkAlphabet(char alph) {
        String vowel = "aeiouAEIOU";
        String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        if (vowel.contains(String.valueOf(alph))){
            System.out.println("This alphabet: "+alph+", is a vowel");
        }else
        if (consonant.contains(String.valueOf(alph))){
            System.out.println("This alphabet: "+alph+", is a consonant");
        }else {

            System.out.println("That is not an alphabet");
        }


    }

}
