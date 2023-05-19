package interview;

public class twoSumInArray {
    public static void main(String[] args) {
        int[] sumOptions = {8,4,1,5,7,9,3};
        int target = 10;
        sumTwo(sumOptions, target);
    }

    private static void sumTwo(int[] sumOptions, int target) {
        for (int i = 0; i < sumOptions.length; i++) {
            for (int j = i+1; j < sumOptions.length; j++) {
                if(sumOptions[i]+sumOptions[j]==target){
                    System.out.println("The values that add up to target are "+ sumOptions[i]+"+"+ sumOptions[j]+"="+target);
                }
            }
        }
    }
}
