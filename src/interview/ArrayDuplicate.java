package interview;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] dupOptions = {7,2,1,8,6,2,7,9};
        findDuplicate(dupOptions);
    }

    private static void findDuplicate(int[] dupOptions) {
        for (int i = 0; i < dupOptions.length; i++) {
            for (int j = i+1; j < dupOptions.length; j++) {
                if (dupOptions[j]==dupOptions[i]){
                    System.out.println(dupOptions[i]+" has duplicate @ index "+j);
                }
            }

        }
    }
}
