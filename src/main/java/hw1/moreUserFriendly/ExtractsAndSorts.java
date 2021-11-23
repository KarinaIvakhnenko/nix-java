package hw1.moreUserFriendly;

import java.util.Scanner;

public class ExtractsAndSorts {
    public static void task2() {
        int choiceTasks;
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
        Main.mainMenu();
    }
}
