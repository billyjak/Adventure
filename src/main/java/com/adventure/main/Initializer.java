package com.adventure.main;

import com.adventure.player.Player;
import com.adventure.settings.GameController;

import java.util.Scanner;

public class Initializer {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static Player newPlayer(String name) {
        System.out.println("Great! Just so I got it right, your name is " + name + " right?");
        System.out.println("1. Yes, that is my name!");
        System.out.println("2. No, that is not my name!");
        if (GameController.twoCheck().equals("1")) {
            return Player.initializePlayer(name);
        } else {
            System.out.println("Oops. Musta been a typo. Please enter your name. Properly.");
            String s = SCANNER.nextLine();
            return newPlayer(s);
        }
    }

    public static void initialize() {
        System.out.println("Hello! Please enter your name.");
        Player newPlayer = Initializer.newPlayer(SCANNER.nextLine());
        System.out.println("Hello " + newPlayer.getName() + "! It's great to meat you!" +
                " Are you ready for an adventure?");
        System.out.println("1. Yeah I'm ready!");
        System.out.println("2. Na, Maybe later.");
        if (GameController.twoCheck().equals("1")) {
            System.out.println("Great! Me too!");
        } else {
            System.out.println("Ok. Come back when you're ready I guess.");
            System.exit(0);
        }
    }
}
