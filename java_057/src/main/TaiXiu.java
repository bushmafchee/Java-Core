/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author huy
 */
public class TaiXiu {

    public static void main(String[] args) {
        double accUser = 5000000;
        Scanner sc = new Scanner(System.in);

        Locale lc = new Locale("vi", "VN");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        int choice = 1;
        do {
            System.out.println("----------MENU----------");
            System.out.println("Choose (1) continue to play.");
            System.out.println("Choose random to end.");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("=====START=====");
                double moneyPlay = 0;
                do {
                    System.out.println("=====Your account: " + numf.format(accUser) + " how much money do you want to use: ");
                    moneyPlay = sc.nextDouble();
                } while (moneyPlay <= 0 || moneyPlay > accUser);

                int choiceGame = 0;
                do {
                    System.out.println("=====Choose 1 <-> over or 2 <-> under");
                    choiceGame = sc.nextInt();
                } while (choiceGame != 1 && choiceGame != 2);

                Random die1 = new Random();
                Random die2 = new Random();
                Random die3 = new Random();

                int value1 = die1.nextInt(5) + 1;
                int value2 = die1.nextInt(5) + 1;
                int value3 = die1.nextInt(5) + 1;
                int sum = value1 + value2 + value3;

                System.out.println("Value of 3 dice: " + value1 + " - " + value2 + " - " + value3);
                if (sum == 3 || sum == 18) {
                    System.out.println("Sum of 3 dice: " + sum + ". You are lose!!!");
                    accUser -= moneyPlay;
                    System.out.println("Your account: " + numf.format(accUser));
                } else if (sum >= 4 && sum <= 10) {
                    System.out.println("Sum of 3 dice: " + sum + ". Under!!!");
                    if (choiceGame == 2) {
                        System.out.println("You are win");
                        accUser += moneyPlay;
                        System.out.println("Your account: " + numf.format(accUser));
                    } else {
                        System.out.println("You are lose");
                        accUser -= moneyPlay;
                        System.out.println("Your account: " + numf.format(accUser));
                    }
                } else {
                    System.out.println("Sum of 3 dice: " + sum + ". Over!!!");
                    if (choiceGame == 1) {
                        System.out.println("You are win");
                        accUser += moneyPlay;
                        System.out.println("Your account: " + numf.format(accUser));
                    } else {
                        System.out.println("You are lose");
                        accUser -= moneyPlay;
                        System.out.println("Your account: " + numf.format(accUser));
                    }
                }
            }
        } while (choice == 1);
    }
}
