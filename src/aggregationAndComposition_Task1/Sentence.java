package aggregationAndComposition_Task1;

import java.util.ArrayList;


public class Sentence {
    ArrayList<Word> words = new ArrayList<>();

    public void addWord(Word word) {
        words.add(word);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Word word: words) {
            builder.append(word.toString());
            builder.append(" ");
        }
        return builder.toString();
    }
}
