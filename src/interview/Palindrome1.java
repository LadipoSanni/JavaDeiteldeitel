package interview;

public class Palindrome1 {
    public static void pals(String sample ){
        String temp = "";
        for (int i = sample.length()-1; i >= 0; i--) {
            temp += sample.charAt(i);
        }
        if (temp.equals(sample)){
            System.out.println(sample + " is a palindrome");
        }else
            System.out.println(sample + " is not a palindrome");
    }
    public static void main(String[] args) {
        String name = "ebube";
        pals(name);
    }
}
