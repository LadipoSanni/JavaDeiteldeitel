package interview;

public class HighSmallNum {
    public static void highestSmallest(int[] nums) {

    int highest = nums[0];
    int smallest = nums[0];

        for (int num : nums) {
            if (num > highest) {

                highest = num;
            }
            if (num < smallest)
                smallest = num;
        }
        System.out.println(highest);
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        int[] highSmallBox = {7,2,3,1,6,8};
        highestSmallest(highSmallBox);
    }

}
