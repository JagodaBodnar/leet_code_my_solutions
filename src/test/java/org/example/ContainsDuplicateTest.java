package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    @Test
    void shouldReturnTrueIfContainsDuplicates() {
        int[] nums = new int[]{1,2,3,1};
        assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }
    @Test
    void shouldReturnFalseIfContainsDuplicates() {
        int[] nums = new int[]{1,2,3,4};
        assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }
}