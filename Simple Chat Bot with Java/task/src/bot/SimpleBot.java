package bot;

import java.util.Scanner;

public class SimpleBot {
    private static final String BOT_NAME = "N00b";
    private static final int CREATION_YEAR = 2025;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            greeting();
            String name = askForName(scanner);
            System.out.printf("What a great name you have, %s!%n", name);
            System.out.println("Let me guess your age.");
            guessAge(scanner);
        }
    }

    private static void guessAge(Scanner scanner) {
        RemaindersInput input = getRemainders(scanner);
        int age = (input.remainder3() * 70 + input.remainder5() * 21 + input.remainder7() * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!", age);
    }

    private static RemaindersInput getRemainders(Scanner scanner) {
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        return new RemaindersInput(remainder3, remainder5, remainder7);
    }

    private record RemaindersInput(int remainder3, int remainder5, int remainder7) {}

    private static void greeting() {
        System.out.printf("Hello! My name is %s.%n", BOT_NAME);
        System.out.printf("I was created in %d.%n", CREATION_YEAR);
    }

    private static String askForName(Scanner scanner) {
        System.out.println("Please, remind me your name.");
        return scanner.nextLine().trim();
    }
}
