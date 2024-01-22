package interview;


public class ReverseArray {
    public static void main(String[] args) {
        char[] inst = {'s','e','m','i','c','o','l','o','n'};
        String love = "!!!uoY evol i";
        reverseArr(love.toCharArray());
        reverseArr2(String.valueOf(inst));
    }

    private static void reverseArr2(String newValueOf) {
        StringBuilder result = new StringBuilder();
        for (int i = newValueOf.length()-1; i >= 0 ; i--) {
            result.append(newValueOf.charAt(i));
        }
        System.out.println(result);

    }

    private static void reverseArr(char[] toCharArray) {
        StringBuilder result1 = new StringBuilder();
        for (int i = toCharArray.length-1; i >=0 ; i--) {
            result1.append(toCharArray[i]);
        }
        System.out.println(result1);
    }
}