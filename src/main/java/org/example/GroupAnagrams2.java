package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GroupAnagrams2 {
    public static class Anagram {
        String wordSorted;
        String word;

        public Anagram(String wordSorted, String word) {
            this.wordSorted = wordSorted;
            this.word = word;
        }

        @Override
        public String toString() {
            return word;
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<Anagram> anagramList = Arrays.stream(strs)
                .map(word -> {
                    char[] wordChar = word.toCharArray();
                    Arrays.sort(wordChar);
                    String wordCharStr = String.valueOf(wordChar);
                    return new Anagram(wordCharStr, word);
                })
                .toList();
        Map<String, List<String>> groupedWords = anagramList.stream()
                .collect(groupingBy(word -> word.wordSorted, Collectors.mapping(
                        Anagram::toString,
                        Collectors.toList())));
        var groupedWordsValues = groupedWords.values().stream().toList();
        return groupedWordsValues;
    }
}
