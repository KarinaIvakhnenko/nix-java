package hw1.moreUserFriendly;

import java.util.Scanner;

public class EndLessons {
    public static void task3() {
        int choiceTasks;
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
        Main.mainMenu();
    }
}
