package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagrams2Test {

    @Test
    void groupAnagrams() {
        List<List<String>> expected  = new ArrayList<>(List.of(List.of("eat","tea","ate"),List.of("bat"),List.of("tan","nat")));
        List<List<String>> result = GroupAnagrams2.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
        assertEquals(expected, result);
    }
}