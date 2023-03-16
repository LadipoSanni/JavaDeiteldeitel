package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
        public static int[] twoSum(int[] nums, int target){
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)){
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i );
            }
        return new int[0];

//    Scanner input = new Scanner(System.in);
//    public int[] twoSum(int[] nums, int target){
//        nums = new int[9];
//        target = 9;
//        nums[0] = input.nextInt();
//
//        int total = 0;
//        int[] resut = {};
//        for (int i = 1; i <= nums.length; i++) {
//            if (nums[0]<target) {
//                total += i;
//                i = resut[i];
//            }
//        }
//        return new int[0];
//    }

    }

}
