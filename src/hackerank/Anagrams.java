package hackerank;

import java.util.ArrayList;

public class Anagrams {
    public static void main(String[] args) {
        String a = "flat";
        String b = "laft";
        isAnagram(a,b);
    }
    static boolean isAnagram(String a, String b) {
        boolean isAnagram = false;
        ArrayList<Character> tempChar = new ArrayList<>();
        char temp;

        if(a.length()==b.length()){
            for(int i = 0; i < a.length();i++) {
                temp = a.charAt(i);
                tempChar.add(temp);
                if (b.charAt(i)==temp) {
                    isAnagram = true;
                }
            }
            if (isAnagram){
                System.out.println("It's anagram");
            }else {
                System.out.println("It's not anagram");
            }
        }
        return isAnagram;
    }

}
//validate that the 2 variables are the same length
//sort the 2 strings
//compare each character in each variable
//iterate over each variable
