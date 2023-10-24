import java.util.Scanner;

public class MainClass {
    private static final Dictionary dictionary = new Dictionary();
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            System.out.println("\n[n]ew game, or [e]xit");
            switch (input.next().charAt(0)) {
                case ('n') -> Game.startGame(dictionary.getRandomWordFromList());
                case ('e') -> {
                    System.out.println("bye!");
                    System.exit(0);
                }
                default -> {
                }
            }
        }

    }
}
