package exercisesJava;



public class ReverseANumber {
    public static void main(String[] args) {
        int numOption = 263537;
        reverseNum(numOption);
    }

    private static void reverseNum(int numOption) {
       char[] rev = String.valueOf(numOption).toCharArray();
       int start = 0;
       int end = rev.length-1;
       char tem;

       while (start<end){
           tem = rev[start];
           rev[start] = rev[end];
           rev[end] = tem;
           start++;
           end--;
       }
        System.out.println(rev);

    }
}
