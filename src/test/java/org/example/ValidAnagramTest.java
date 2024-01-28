package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void shouldReturnTrueIfIsAnagram() {
        String s = "anagram";
        String t = "nagaram";
        assertTrue(ValidAnagram.isAnagram(s,t));
    }
    @Test
    void shouldReturnFalseIfIsAnagram() {
        String s = "rat";
        String t = "car";
        assertFalse(ValidAnagram.isAnagram(s,t));
    }
}