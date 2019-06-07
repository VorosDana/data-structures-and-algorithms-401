package hashes;

public class RepeatedWord {
    public static String repeatedWord(String text) {
        String[] words = text.split(" ");

        HashMap<String> foundWords = new HashMap<>();

        for (String word : words) {

            // Removes whitespace and puts word in lowercase, to
            // remove case sensitivity
            // https://stackoverflow.com/questions/18830813/how-can-i-remove-punctuation-from-input-text-in-java
            word = word.replaceAll("[^A-Za-z]", "").toLowerCase();

            // Add returns true if value goes if, false if not
            // If it returns false, that word is already in,
            // and we found our duplicate!
            if (!foundWords.add(word, word)) {
                return word;
            }
        }

        // iff no repeats found, return null
        return null;
    }
}
