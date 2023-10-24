
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Game {
    static int wordLength;
    static int mistakes;
    static String secretWordView;
    static LinkedHashSet<Character> enteredLetters;
    static boolean isGame;
    public static void startGame(String word){
        isGame=true;
        secretWordView="*".repeat(word.length());
        //System.out.println("secretWord: "+"          "+word); //quick debug
        System.out.println("Guess the hidden word: "+"      "+secretWordView);
        mistakes=0;
        enteredLetters = new LinkedHashSet<>();
        wordLength=word.length();
        Scanner scanner=new Scanner(System.in);

        while(isGame){
            System.out.println("Enter any character: ");
            char ch=scanner.nextLine().charAt(0);

            if(!enteredLetters.contains(ch)){
                enteredLetters.add(ch);
            }else{
                System.out.println("You used this letter before!");
                continue;
            }
            checkLetter(ch,word);
            if((wordLength==0)&&(mistakes<6)){
                DrawGame.youWon(word);
                isGame=false;
            }else DrawGame.drawGameMenu();
        }
    }
    public static void checkLetter(char ch,String word){
        if(word.contains(String.valueOf(ch))){
            char[] temp=word.toCharArray();
            char[] tempView=secretWordView.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                if(temp[i]==ch){
                    tempView[i]=ch;
                    wordLength--;
                }
            }
            secretWordView = new String(tempView);
        }
        else {
            System.out.println("wrong letter!");
            mistakes++;
            if(mistakes==6){
                StagesOfHangman.drawHangman(mistakes);
                DrawGame.youLost(word);
                isGame=false;

            }
        }
    }
}




