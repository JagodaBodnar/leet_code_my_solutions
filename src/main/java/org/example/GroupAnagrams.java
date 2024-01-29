package org.example;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> listOfStrings = new HashMap<>();
        List.of(strs).stream().forEach(word -> {
            char[] wordChar = word.toCharArray();
            Arrays.sort(wordChar);
            String wordCharStr = String.valueOf(wordChar);
            if (listOfStrings.containsKey(wordCharStr)) {
                List<String> getValue = listOfStrings.get(wordCharStr);
                getValue.add(word);
                listOfStrings.computeIfPresent(wordCharStr, (k, v) -> getValue);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                listOfStrings.put(wordCharStr, list);
            }

        });
        return listOfStrings.values().stream().toList();
    }
}
