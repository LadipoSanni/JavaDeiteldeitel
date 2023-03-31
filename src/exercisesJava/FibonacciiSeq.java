package exercisesJava;

public class FibonacciiSeq {
    public static void main(String[] args) {
        int num =17;
        fiboSeries(num);
    }

    private static void fiboSeries(int num) {
       int start = 0;
       int end  = 1;
       int temp;
       int[] resot = {start, end};

       while (resot.length<=num) {
           temp = resot[start] + resot[end];
           resot[start] = resot[end];
           resot[end] = temp;
           System.out.println(" "+ resot[end]);
           num--;
       }

//            s + e = t
//            s = e
//            e = t
//            t = s + e
//

//            0 + 1 = 1
//            1 + 1 = 2
//            1 + 2 = 3
//            2 + 3 = 5
//            3 + 5 = 8
//            5 + 8 = 13


    }
}
