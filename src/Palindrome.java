
public class Palindrome {
    public static void paliChecker(String words){
        int thisEnd = 0;
        int thatEnd = words.length()-1;
        char[] temp = words.toCharArray();
        if (temp[thisEnd] == temp[thatEnd]){
            while (thisEnd<thatEnd){
                thisEnd++;
                thatEnd--;
            }
            System.out.println("This word " + words + " is a palindrome");
        }else {
            System.out.println("This word " + words + " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        String choiceWord = "nnenna";
        paliChecker(choiceWord);
    }

}
