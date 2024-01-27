package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] expected = {0,1};
        int[] result = TwoSum.twoSum(nums,target);
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
}