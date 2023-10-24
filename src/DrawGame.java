import java.util.Iterator;
import java.util.LinkedHashSet;

public class DrawGame {

    public static void drawGameMenu(){
        StagesOfHangman.drawHangman(Game.mistakes);
        System.out.println("guessed letters: "+ Game.secretWordView);
        System.out.print("you used letters: ");
        printEnteredLetters(Game.enteredLetters);
        System.out.println("\nmistakes: "+ Game.mistakes);
    }
    public static void printEnteredLetters(LinkedHashSet<Character> characters){
        Iterator<Character> itr = characters.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next().toString()+" ");
        }
    }
    public static void youWon(String secretWord){
        System.out.println("\n"+secretWord);
        System.out.println("You won! Congratulations!");
    }
    public static void youLost(String secretWord){
        System.out.println("\nYou lost! Maybe next time I'll be lucky");
        System.out.println("The hidden word was: "+secretWord);
    }
}
