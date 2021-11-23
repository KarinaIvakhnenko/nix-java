package hw1.moreUserFriendly;

import java.util.Scanner;

public class ExtractsAndFindsSum {
    public static void task1() {
        int choiceTasks;
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
        Main.mainMenu();
    }
}
