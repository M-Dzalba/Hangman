public class StagesOfHangman {
public static void drawHangman(int num){
    switch (num) {
        case 0 -> System.out.println("    +---+\n" +
                "    |   |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    =========");
        case 1 ->  //first mistake
                System.out.println("    +---+\n" +
                        "    |   |\n" +
                        "    |   O\n" +
                        "    |\n" +
                        "    |\n" +
                        "    |\n" +
                        "    =========");
        case 2 -> System.out.println("    +---+\n" +
                "    |   |\n" +
                "    |   O\n" +
                "    |   |\n" +
                "    |\n" +
                "    |\n" +
                "    =========");
        case 3 -> System.out.println("    +---+\n" +
                "    |   |\n" +
                "    |   O\n" +
                "    |  /|\n" +
                "    |\n" +
                "    |\n" +
                "    =========");
        case 4 -> System.out.println("    +---+\n" +
                "    |   |\n" +
                "    |   O\n" +
                "    |  /|\\\n" +
                "    |\n" +
                "    |\n" +
                "    =========");
        case 5 -> System.out.println("    +---+\n" +
                "    |   |\n" +
                "    |   O\n" +
                "    |  /|\\\n" +
                "    |  /\n" +
                "    |\n" +
                "    =========");
        case 6 -> System.out.println("    +---+\n" +
                "    |   |\n" +
                "    |   O\n" +
                "    |  /|\\\n" +
                "    |  / \\\n" +
                "    |\n" +
                "    =========");
        default -> System.out.println("invalid operator");
    }
}

}
