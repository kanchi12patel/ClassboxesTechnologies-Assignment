import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String sentence = "Hi I am Kanchi , my name is Kanchi Patel";

        // Split sentence into words
        String[] words = sentence.toLowerCase().split("\\s+");

        // Store frequencies
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        // Print each word with count and find most frequent
        String maxWord = "";
        int maxFreq = 0;

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.println("Most frequent word: " + maxWord + " (" + maxFreq + ")");
    }
}