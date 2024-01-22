public class TurinTest {
//    given a string S. when u iterate through that string S, the consecutive
//    4 characters must follow each other in alphabetical order.
//    while the iterator keep shifting 1 step till the end of the string with 4
//    character at each shift.
//    count how many shift has 4 characters in alphabetical order.
//    return the total of shifts with alphabetical order
public static void main(String[] args) {
    String S = "abdcbcfchijkz";
     shiftTheString(S);
    }
    static int shiftTheString(String s) {
    StringBuilder shifting = new StringBuilder();
    int count = 0;
    char last = 'a';

        for (int i = 0; i < s.length(); i++) {
            if (shifting.length()<4) {
                    char temp = s.charAt(i);
                    if(temp >= last){
                        shifting.append(temp);
                        last = temp;
                    }
                    else {
                        last = temp;
                    }
            }
            if (shifting.length()==4){
                count++;
                shifting.deleteCharAt(0);
            }
        }
        System.out.println(count);
        return count;
    }
}

