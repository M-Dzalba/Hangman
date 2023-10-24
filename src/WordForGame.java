

import java.util.LinkedHashSet;
import java.util.Scanner;


public class WordForGame {


    static int wordLength;
    static int mistakes;
    static String secretWordView;
    static LinkedHashSet<Character> enteredLetters;
    public static void maskedWord(String word){

        secretWordView="*".repeat(word.length());
        System.out.println("secretWord: "+"          "+word);
        System.out.println("secretWordView: "+"      "+secretWordView);
        mistakes=0;
        enteredLetters = new LinkedHashSet<>();

        wordLength=word.length();
        Scanner scanner=new Scanner(System.in);

        while((wordLength>0)){
            System.out.println("Enter any character: ");
            char ch=scanner.nextLine().charAt(0);

            if(!enteredLetters.contains(ch)){
                enteredLetters.add(ch);
            }else{
                System.out.println("You used this letter before!");
                continue;
            }



            checkLetter(ch,word);

            DrawGame.drawGameMenu();
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
                System.out.println("You lost!");

            }
        }
    }


}




