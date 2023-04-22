package hackerank;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class StaticInitializer {
    static Scanner scanner = new Scanner(System.in);
    static int B = scanner.nextInt();
    static int H = scanner.nextInt();
    static boolean flag;
    static boolean res;
    static  {
        if (B<=100&&H<=100){
            if (B <= 0 || H <= 0) {
                res = flag;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            } else {
                res = true;
            }
            flag = res;
        }
    }



    public static void main(String[] args){
        if(flag){
                int area=B*H;
                System.out.print(area);
            }
        }//end of main
    }// end of class
