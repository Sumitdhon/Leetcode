package leetcode;

import java.util.*;
public class Replacewords {
    public static String replaceWords(List<String> roots, String sentence) {
        Set<String> rootSet = new HashSet<>(roots);
        StringBuilder result = new StringBuilder();

        // Tokenize the sentence
        String[] words = sentence.split(" ");

        for (String word : words) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (rootSet.contains(prefix)) {
                    break; // Found a root
                }
            }
            result.append(prefix).append(" ");
        }

        // Remove the trailing space and return the modified sentence
        return result.toString().trim();
    }

    public static void main(String[] args) {
        List<String> roots = Arrays.asList("cat", "bat", "rat");
        String sentence = "the cattle was rattled by the battery";
        String modifiedSentence = replaceWords(roots, sentence);
        System.out.println("Modified sentence: " + modifiedSentence);
    }
}

    
