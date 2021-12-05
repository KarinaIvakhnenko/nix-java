package hw2;

import java.util.*;

// 1. В завданні не було вказано, чи можна використовувати мапу. Така реалізація підійде?

public class EncryptionGame {

    public static Map<Integer, String> map = new LinkedHashMap<>();

    public static void saveNewWords() {

        int yourChoice;

        do {
            System.out.println();
            System.out.println("Please, enter the word that you want to save:");
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();

            map.put(map.size() + 1, word);

            System.out.println();
            System.out.println("Do you want to add more? 1 - Yes, 2 - No");
            yourChoice = scanner.nextInt();
        } while (yourChoice == 1);
        igra();
    }

    public static void viewContains() {

        Set set = map.entrySet();
        System.out.println("Your dictionary contains: ");

            if(map.isEmpty()){
                System.out.println("Sorry, the dictionary is empty. Add some words.");
                System.out.println();
            }
            for (Object element : set) {
                Map.Entry mapEntry = (Map.Entry) element;
                System.out.println(mapEntry.getKey() + " - " + mapEntry.getValue());
            }
            System.out.println("Do you want 1 - add new word, 2 - return to Main Menu?");
            Scanner scanner = new Scanner(System.in);
            int yourChoice = scanner.nextInt();

            switch (yourChoice){
                case 1:
                    saveNewWords();
                case 2:
                    Main2.mainMenu();
                default:
                    System.out.println("Sorry, you should select between 1 and 2");
            }
    }

    public static void igra() {
        int choiceTasks;
        do {
            System.out.println();
            System.out.println("Please, select what you want to do: ");
            System.out.println("1. Save new word");
            System.out.println("2. View contains of dictionary");
            System.out.println("3. Return to Main Menu");
            System.out.println();
            Scanner scanner = new Scanner(System.in);
            int choiceFromMenu = scanner.nextInt();

            if (choiceFromMenu == 1) {
                saveNewWords();
            } else if (choiceFromMenu == 2) {
                viewContains();
            } else if (choiceFromMenu == 3){
                Main2.mainMenu();
            }
            else {
                System.out.println("Sorry, you should select between 1 and 3");
            }

            System.out.println();
            System.out.println("Do you want to 1 - repeat or other number - return to Main Menu?");
            choiceTasks = scanner.nextInt();

        } while (choiceTasks == 1);
        Main2.mainMenu();
    }
}
