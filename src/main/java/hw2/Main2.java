package hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static int choiceTasks;
    public static void main(String[] args) {
        mainMenu();
    }

    public static void task1(){
        System.out.println("Enter random words");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String randomString = scanner.next();
        char [] stringToArray = randomString.toCharArray();

        String [] words = randomString.split(" ");

        for (String w : words){
            System.out.println(w);
        }
    }

    public static void task2() {

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
                    task1();
                    break;
                case 2:
                    task2();
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
