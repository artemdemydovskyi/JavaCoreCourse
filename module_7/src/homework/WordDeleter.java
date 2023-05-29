package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordDeleter {

    public static void main(String[] args) {
        WordDeleter deleter = new WordDeleter();
        String phrase = "Ану вийди ОТСЮДИ розбійник";
        String[] wordsToDelete = {"ОТСЮДИ"};
        String result = deleter.remove(phrase, wordsToDelete);
        System.out.println(result);
    }

    private String remove(String phrase, String[] words) {
        String[] phraseWords = phrase.split("\\s+");
        List<String> remainingWords = new ArrayList<>();
        for (String word : phraseWords) {
            if (!Arrays.asList(words).contains(word)) {
                remainingWords.add(word);
            }
        }
        return String.join(" ", remainingWords);
    }
}