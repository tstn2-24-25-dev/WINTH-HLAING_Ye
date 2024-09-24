package com.ye.niveau2;

import java.util.*;
import java.util.Map.Entry;

public class Exo2LaPlusCourantMot {

    public static void main(String[] args) {
        // Example input: an array of strings, each string is a text (simulating multiple lines)
        String[] texts = {
                "chemin chemin chevaux livres",
                "livres chemin port voiture",
                "chemin voiture chevaux livres",
                "voiture table port"
        };

        findMostCommonWords(texts);
    }

    public static void findMostCommonWords(String[] texts) {
        Map<String, Set<Integer>> wordOccurrences = new HashMap<>();
        int numTexts = texts.length;

        // take the word with lower case to store in array easily
        for (int i = 0; i < numTexts; i++) {
            String[] words = texts[i].toLowerCase().split("[^a-zA-Z]+");
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

            for (String word : uniqueWords) {
                if (!word.isEmpty()) {
                    wordOccurrences.putIfAbsent(word, new HashSet<>());
                    wordOccurrences.get(word).add(i);
                }
            }
        }

        // filter the word in the test list
        Map<String, Integer> filteredWords = new HashMap<>();
        for (Entry<String, Set<Integer>> entry : wordOccurrences.entrySet()) {
            int count = entry.getValue().size();
            if (count < numTexts) { //  keep words that don't appear in all lines
                filteredWords.put(entry.getKey(), count);
            }
        }

        // sorting words first by occurrence count in descending, then alphabetically
        List<Entry<String, Integer>> sortedWords = new ArrayList<>(filteredWords.entrySet());
        sortedWords.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // Sort by descending
            } else {
                return a.getKey().compareTo(b.getKey()); // Sort alphabetically if frequency is same
            }
        });

        // take the top 3 most frequent words in the line
        for (int i = 0; i < Math.min(3, sortedWords.size()); i++) {
            Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
    }
}
