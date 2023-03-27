
public class Palindrome {
    public static void paliChecker(String words){
        int startPointer = 0;
        int endPointer = words.length()-1;
        char[] temp = words.toCharArray();
        if (temp[startPointer] == temp[endPointer]){
            while (startPointer<endPointer){
                startPointer++;
                endPointer--;
            }
            System.out.println("This word " + words + " is a palindrome");
        }else {
            System.out.println("This word " + words + " is not a palindrome");
        }

    }
    public static void main(String[] args) {
        String choiceWord = "nnenn";
        paliChecker(choiceWord);
    }

}
