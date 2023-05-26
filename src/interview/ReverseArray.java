package interview;


public class ReverseArray {
    public static void main(String[] args) {
        char[] inst = {'s','e','m','i','c','o','l','o','n'};
        String love = "!!!uoY evol i";
        reverseArr(love.toCharArray());
        reverseArr2(String.valueOf(inst));
    }

    private static void reverseArr2(String valueOf) {
        String result = "";
        for (int i = valueOf.length()-1; i >= 0 ; i--) {
            result += valueOf.charAt(i);
        }
        System.out.println(result);

    }

    private static void reverseArr(char[] toCharArray) {
        String result1 = "";
        for (int i = toCharArray.length-1; i >=0 ; i--) {
            result1 += toCharArray[i];
        }
        System.out.println(result1);
    }
}