package org.example;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == sub) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
