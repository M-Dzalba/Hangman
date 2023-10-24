
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Random;

public class Dictionary {
    private final String pathFile="dictionary.txt";
    private List<String>listWords;
    public Dictionary() {
        loadListWordsFromFile();
    }
    private void loadListWordsFromFile() {
        InputStream resource = this.getClass().getClassLoader().getResourceAsStream(pathFile);
        if (resource == null) {
            throw new RuntimeException("Resource " + pathFile + " not found");
        }
        listWords = new BufferedReader(new InputStreamReader(resource)).lines().toList();
    }
    protected String getRandomWordFromList() {
        final int minWordLength = 5;
        final int maxWordLength = 10;
        String word = listWords.get(new Random().nextInt(listWords.size()));
        while (word.length() < minWordLength || word.length() > maxWordLength || word.contains("-")) {
            word = listWords.get(new Random().nextInt(listWords.size()));
        }
        return word;
    }

}
