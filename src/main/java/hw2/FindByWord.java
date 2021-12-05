package hw2;


import java.util.Scanner;

public class FindByWord {

    public static String fullString;
    public static String keyword;
    public static String[] arrString;

    public static void findByStart() {
        System.out.print("1. ");
        boolean ifContains = false;
        for (String a : arrString) {
            if (a.startsWith(keyword)) {
                ifContains = true;
                System.out.print(a + ", ");
            }
        }
        if (!ifContains) {
            System.out.print("false,");
        }
        System.out.println();
    }

    public static void findByEnd() {
        System.out.print("2. ");
        boolean ifContains = false;
        for (String b : arrString) {
            if (b.endsWith(keyword)) {
                ifContains = true;
                System.out.print(b + ", ");
            }
        }
        if (!ifContains) {
            System.out.print("false,");
        }
        System.out.println();
    }

    public static void findAllCommon() {  //Не працює, якщо символи стоять на різних позиціях (не один за одним) - як це виправити?
        System.out.print("3. ");
        boolean ifContains = false;
        for (String c : arrString) {
                if (c.contains(keyword)) {
                    ifContains = true;
                    System.out.print(c + ", ");
            }
        }

//        for (int i = 0; i < arrString.length; i++) { //Була спроба зрівнювати кожен символ ключа із символами у слові
//            for (int j = 0; j < keyword.length(); j++) {
//                if (arrString[i].equals(j)) {
//                    ifContains = true;
//                    System.out.print(i + ", ");
//                }
//            }
//        }

        if (!ifContains) {
            System.out.print("false,");
        }
        System.out.println();
    }

    public static void findByConsonants() {
        System.out.print("4. ");boolean ifContains = false;

        for (String d : arrString) {
            String onlyConsonants = d.toLowerCase();
            onlyConsonants = d.replaceAll("[aeiou]", "");
            if (onlyConsonants.contains(keyword)) {
                ifContains = true;
                System.out.print(d + ", ");
            }
        }
        if (!ifContains) {
            System.out.print("false,");
        }
        System.out.println();
    }

    public static void findByVowels() {
        System.out.print("5. ");
        boolean ifContains = false;

        for (String s : arrString) {
            String onlyVowels = s.toLowerCase();
            onlyVowels = s.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
            if (onlyVowels.contains(keyword)) {
                ifContains = true;
                System.out.print(s + ", ");
            }
        }
        if (!ifContains) {
            System.out.print("false,");
        }
        System.out.println();
    }

    public static void findByWordMethod() {
        int choiceTasks;
        do {
            System.out.println();
            System.out.println("Please, enter the String:");
            Scanner scanner = new Scanner(System.in);
            fullString = scanner.nextLine();
            System.out.println();

            System.out.println("Thanks! Please, enter Keyword:");
            Scanner scanner1 = new Scanner(System.in);
            keyword = scanner1.nextLine();
            System.out.println();

            arrString = fullString.split(" ");

            findByStart();
            findByEnd();
            findAllCommon();
            findByConsonants();
            findByVowels();

            System.out.println();
            System.out.println("Do you want to 1 - repeat or other number - return to Main Menu?");
            choiceTasks = scanner.nextInt();

        } while (choiceTasks == 1);
        Main2.mainMenu();
    }
}
