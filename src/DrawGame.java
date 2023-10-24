import java.util.Iterator;
import java.util.LinkedHashSet;

public class DrawGame {

    public static void drawGameMenu(){
        StagesOfHangman.drawHangman(WordForGame.mistakes);
        System.out.println("with guessed letters: "+ WordForGame.secretWordView);
        System.out.print("you used letters: ");
        printEnteredLetters(WordForGame.enteredLetters);
        System.out.println("\nmistakes: "+ WordForGame.mistakes);
        System.out.println("word length: "+ WordForGame.wordLength);
    }

    public static void printEnteredLetters(LinkedHashSet<Character> characters){
        Iterator<Character> itr = characters.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next().toString()+" ");
        }

    }
}
