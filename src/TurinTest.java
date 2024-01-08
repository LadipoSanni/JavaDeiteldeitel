public class TurinTest {
//    given a string S. when u iterate through that string S, the consecutive
//    4 characters must follow each other in alphabetical order.
//    while the iterator keep shifting 1 step till the end of the string with 4
//    character at each shift.
//    count how many shift has 4 characters in alphabetical order.
//    return the total of shifts with alphabetical order
public static void main(String[] args) {
    String S = "abcdcfchijk";
     shiftTheString(S);
    }
    private static int shiftTheString(String s) {
    StringBuilder shifting = new StringBuilder();
    int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (shifting.length()<4) {
                shifting.append(s.charAt(i));
            }
            if (shifting.length()==4){
                char[] shifts = String.valueOf(shifting).toCharArray();
                for (int j = 0; j < shifts.length; j++) {
                    char fes = shifts[j];
                    char temp = 'a';
                    if (temp>fes){
                        break;
                    }else {
                        temp=fes;
                        count++;
                    }

                }
                shifting.deleteCharAt(0);
            }
        }
    return count;
    }
}