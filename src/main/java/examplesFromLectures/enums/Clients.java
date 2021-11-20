package examplesFromLectures.enums;

import java.util.Scanner;

public class Clients {
    public static void main(String[] args) {

        System.out.println("Enter number between 1 and 3 to choose your gender: ");
        System.out.println("1 - male");
        System.out.println("2 - female");
        System.out.println("3 - agender");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int currentChoice = scanner.nextInt();

        switch (currentChoice) {
            case 1:
                System.out.println("Your gender is " + GenderEnum.MALE.getTypeOfGender() + " " + GenderEnum.MALE.getRuTypeOfGender());
                break;
            case 2:
                System.out.println("Your gender is " + GenderEnum.FEMALE.getTypeOfGender() + " " + GenderEnum.FEMALE.getRuTypeOfGender());
                break;
            case 3:
                System.out.println("Your gender is " + GenderEnum.AGENDER.getTypeOfGender() + " " + GenderEnum.AGENDER.getRuTypeOfGender());
                break;
            default:
                System.out.println("You should enter value between 1-3");
        }

// we can get the list of values that GenderEnum is contained.
//        for(GenderEnum value : GenderEnum.values()){
//            System.out.println("value = " + value);
//        }

        System.out.println();
    }
}
