package interview;

public class TwoHighestNum {
    public static void twoHighest(int[] numb) {
        int firstHighest = numb[0];
        int secondHighest = numb[0];

        for (int i = 0; i < numb.length; i++) {
            if (numb[i]>firstHighest){
                secondHighest = firstHighest;
                firstHighest = numb[i];
            }else
            if (numb[i]>secondHighest){
                secondHighest = numb[i];
            }
        }
        System.out.println("The first Highest number is " + firstHighest);
        System.out.println("The second Highest number is " + secondHighest);
    }

    public static void main(String[] args) {
        int[] twoHighestNum = {7,2,3,1,6,8};
        twoHighest(twoHighestNum);
    }
}
