package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner SCANNER = new Scanner(System.in); // Do not change this line
    private static final String BOT_NAME = "N00b";
    private static final String CREATION_YEAR = "2025";

    public static void main(String[] args) {
        greet(BOT_NAME, CREATION_YEAR);
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.printf("Hello! My name is %s.%n", assistantName);
        System.out.printf("I was created in %s.%n", birthYear);
        System.out.println("Please, remind me of your name.");
    }

    static void remindName() {
        String name = SCANNER.nextLine().trim();
        System.out.printf("What a great name you have, %s!%n", name);
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = SCANNER.nextInt();
        int rem5 = SCANNER.nextInt();
        int rem7 = SCANNER.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!%n", age);
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = SCANNER.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!%n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int answer;
        do {
            answer = SCANNER.nextInt();
            if (answer != 2) {
                System.out.println("Please, try again.");
            }
        } while (answer != 2);
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
