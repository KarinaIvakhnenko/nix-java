package hw1.moreUserFriendly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mainMenu();
        ExtractsAndFindsSum task1;
        ExtractsAndSorts task2;
        EndLessons task3;
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
                    ExtractsAndFindsSum.task1();
                    break;
                case 2:
                    ExtractsAndSorts.task2();
                    break;
                case 3:
                    EndLessons.task3();
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
