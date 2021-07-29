package aggregationAndComposition_Task1;

import java.util.ArrayList;

public class Text {
    ArrayList <Sentence> sentences = new ArrayList<>();
    public void addSentence (Sentence sentence){
        sentences.add(sentence);
    }

    public void appendText(String inputText) {
        String[] inputSentences = inputText.split("\\.");
        for(String sent: inputSentences) {
            Sentence sentence = new Sentence();

            String[] inputWords = sent.split(" ");
            for(String word: inputWords) {
                Word w = new Word(word);
                sentence.addWord(w);
            }
            addSentence(sentence);
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Sentence sent: sentences) {
            builder.append(sent.toString().trim());
            builder.append(". ");
        }
        return builder.toString();
    }

    public String getHeader() {
        return sentences.get(0).toString();
    }
}
