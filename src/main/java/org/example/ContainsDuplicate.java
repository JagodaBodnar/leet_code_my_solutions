package org.example;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> setOfNums =  new HashSet<>();
        for(int number : nums){
            setOfNums.add(number);
        }
        return setOfNums.size() != nums.length;
    }
}
