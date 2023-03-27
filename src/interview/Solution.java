package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), nums[i]};
            }
            map.put(nums[i], nums[i]);
        }
    return new int[0];
    }
    public static void main(String[] args) {
        int[] add2Options = {8, 4, 1, 5, 7, 9, 3};
        int target = 9;
        int[] result = twoSum(add2Options, target);
        System.out.println("The numbers that add up to target is " + result[0] + "+" + result[1]+"=" +target);
        System.out.println(Arrays.toString(result));
    }
}

