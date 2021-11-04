package hw1;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
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
                    System.out.println("Choice must be a value between 0 and 4.");

            }
            System.out.println();
        }
        while (choice != 0);
    }

    public static void task1() {
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
    }

    public static void task2() {

    }

    public static void task3() {

    }

    public static void exit() {
        System.exit(0);
    }
}
