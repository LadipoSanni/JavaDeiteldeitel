package interview;

public class HighSmallNum {
    public static void highestSmallest(int[] nums) {

    int highest = nums[0];
    int smallest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>highest){

                highest = nums[i];
            }
            if(nums[i]<smallest)
                smallest = nums[i];
        }
        System.out.println(highest);
        System.out.println(smallest);
    }

    public static void main(String[] args) {
        int[] highSmallBox = {7,2,3,1,6,8};
        highestSmallest(highSmallBox);
    }

}
