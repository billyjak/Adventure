package main.com.adventure.settings;

import java.util.Scanner;

public class GameController {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String twoCheck() {
        String s = SCANNER.nextLine();
        switch (s) {
            case "1": return "1";
            case "2": return "2";
            default:
                System.out.println("That's not one of the two options.");
            return twoCheck();
        }
    }
    public static String threeCheck() {
        String s = SCANNER.nextLine();
        switch (s) {
            case "1": return "1";
            case "2": return "2";
            case "3": return "3";
            default:
                System.out.println("That's not one of the three options.");
                return threeCheck();
        }
    }    public static String fourCheck() {
        String s = SCANNER.nextLine();
        switch (s) {
            case "1": return "1";
            case "2": return "2";
            case "3": return "3";
            case "4": return "4";
            default:
                System.out.println("That's not one of the four options.");
                return fourCheck();
        }
    }
}
