package hw1.moreUserFriendly;

import java.util.Scanner;

public class Main {
    public static int choiceTasks;

    public static void main(String[] args) {
        mainMenu();
    }

    public static void task1() {
        do {
            System.out.println();
            System.out.println("Enter value:");

            int sum = 0;
            String currentNumber;

            Scanner scanner = new Scanner(System.in);
            currentNumber = scanner.next();
            char[] numberOnly = currentNumber.toCharArray();

            for (char ch : numberOnly) {
                if (Character.isDigit(ch)) {
                    sum += Character.getNumericValue(ch);
                }
            }

            System.out.println("Result sum: " + sum);
            System.out.println();

            System.out.println("Do you want to 1 - repeat or other number - return to Main Menu?");
            choiceTasks = scanner.nextInt();
        } while (choiceTasks == 1);

    }

    public static void task2() {
        do {
            String characters;
            int maxSize = 256;
            int[] count = new int[maxSize];

            System.out.println();
            System.out.println("Enter value: ");
            Scanner scanner = new Scanner(System.in);
            characters = scanner.next();

            String lowerCh = characters.toLowerCase();
            String onlyLetters = lowerCh.replaceAll("[^a-z]", "");

            char[] allCharacter = onlyLetters.toCharArray();

            for (int i = 0; i < onlyLetters.length(); i++) {
                count[onlyLetters.charAt(i)]++;
            }

            boolean[] bool = new boolean[256];

            for (int i = 0; i < onlyLetters.length(); i++) {
                if (!bool[onlyLetters.charAt(i)]) {
                    bool[onlyLetters.charAt(i)] = true;
                    System.out.println(onlyLetters.charAt(i) + " : " + count[onlyLetters.charAt(i)]);
                }
            }

            System.out.println();
            System.out.println("Do you want to 1 - repeat or other number - return to Main Menu?");
            choiceTasks = scanner.nextInt();

        } while (choiceTasks == 1);
    }

    public static void task3() {
        do {
            System.out.println();
            System.out.println("Please, enter number of your lesson from 1 to 10");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            int numberOfLesson = scanner.nextInt();

            numberOfLesson = numberOfLesson * 45 + (numberOfLesson / 2) * 5 + ((numberOfLesson + 1) / 2 - 1) * 15;

            System.out.println("Your lesson will end at " + (numberOfLesson / 60 + 9) + " " + (numberOfLesson % 60));
            System.out.println();
            System.out.println("Do you want to 1 - repeat or other number - return to Main Menu?");
            choiceTasks = scanner.nextInt();

        } while (choiceTasks == 1);
    }

    public static void mainMenu () {
        int choice;

        do {
            System.out.println("Enter one of the following commands: ");
            System.out.println("1 - first task");
            System.out.println("2 - second task");
            System.out.println("3 - third task");
            System.out.println("0 - exit ");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Choice must be a value between 0 and 3.");

            }
            System.out.println();
        }
        while (choice != 0);
    }

    public static void exit() {
        System.exit(0);
    }
}
