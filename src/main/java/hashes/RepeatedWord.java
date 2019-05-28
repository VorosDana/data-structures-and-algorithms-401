package hashes;

public class RepeatedWord {
    public static String repeatedWord(String text) {
        String[] words = text.split(" ");

        HashMap<String> foundWords = new HashMap<>();

        for (String word : words) {
            if (!foundWords.add(word, word)) {
                return word;
            }
        }

        return "";
    }
}
