
import java.util.HashMap;
import java.util.Map;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class WordCounter {

    public static void main(String[] args) {
        // Przykładowy tekst pobrany z https://www.lipsum.com/
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        WordCounter wordCounter = new WordCounter();
        Map<String, Integer> wordCountMap = wordCounter.countWords(text);

        // Wyświetlenie wyników
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Map<String, Integer> countWords(String text) {
        // Usunięcie znaków specjalnych i podział tekstu na słowa
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // Mapa do przechowywania ilości tych samych słów
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iteracja po słowach i zliczanie ich wystąpień
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordCountMap;
    }
}
