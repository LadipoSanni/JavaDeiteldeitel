package interview;
public class ReverseArray {
    public static void main(String[] args) {
        char[] inst = {'s','e','m','i','c','o','l','o','n'};
        reverseArr(inst);
    }
    public static void reverseArr(char[] inst) {
   StringBuilder revAray = new StringBuilder();
        for (int i =  inst.length-1; i >= 0; i--) {
            revAray.append(inst[i]);
        }
        inst = revAray.toString().toCharArray();
        System.out.print(inst);
    }
}