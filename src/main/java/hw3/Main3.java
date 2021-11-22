package hw3;

import java.util.Scanner;

public class Main3 {

        public static int choiceTasks;
        public static void main(String[] args) {
            mainMenu();
        }

        public static void task1(){

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
