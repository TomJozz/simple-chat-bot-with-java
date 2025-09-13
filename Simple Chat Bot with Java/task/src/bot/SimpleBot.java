package bot;

import java.util.Scanner;

public class SimpleBot {
    private static final String BOT_NAME = "N00b";
    private static final int CREATION_YEAR = 2025;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            greeting();
            String name = askForName(scanner);
            complimentName(name);
        }
    }

    private static void greeting() {
        System.out.printf("Hello! My name is %s.%n", BOT_NAME);
        System.out.printf("I was created in %d.%n", CREATION_YEAR);
    }

    private static String askForName(Scanner scanner) {
        System.out.println("Please, remind me your name.");
        return scanner.nextLine().trim();
    }

    private static void complimentName(String name) {
        System.out.printf("What a great name you have, %s!%n", name);
    }
}
