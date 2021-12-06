package hw2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        mainMenu();
        FindByWord findByWordMethod;
        EncryptionGame igra;
    }

    public static void mainMenu () {
        int choice;

        do {
            System.out.println("Enter one of the following commands: ");
            System.out.println("1 - first task");
            System.out.println("2 - second task");
            System.out.println("0 - exit ");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    FindByWord.findByWordMethod();
                    break;
                case 2:
                    EncryptionGame.igra();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    System.out.println("Choice must be a value between 0 and 2.");

            }
            System.out.println();
        }
        while (choice != 0);
    }

    public static void exit() {
        System.exit(0);
    }
}
