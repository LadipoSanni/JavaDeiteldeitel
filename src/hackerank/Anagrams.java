package hackerank;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String a = "stuff";
        String b = "tsffu";
        isAnagramMethod(a,b);
    }
    static boolean isAnagramMethod(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        Arrays.sort(A);
        Arrays.sort(B);
        boolean isAnagram = true;
            for (int i = 0; i < A.length; i++) {
                if (a.length() != b.length() || A[i] != B[i]) {
                    System.out.println(a + " and " + b + " is not Anagram");
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram){
                System.out.println(a + " and " + b + " is Anagram");
            }
        return isAnagram;
    }
}