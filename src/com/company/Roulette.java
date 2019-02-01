package com.company;

import java.util.Random;
import java.util.Scanner;

public class Roulette {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.println("Type of bet (red|black|even|odd|high|low)");
            String bet_type = Keyboard.nextLine();

            System.out.println("Enter amount of bet money");
            int amount_money = Keyboard.nextInt();
            int d_money = amount_money * 2;

            Random r = new Random();
            int x = 1 + r.nextInt(36);
            String y = bet_type + r.nextLong();
            System.out.println("The ball landed on " + x + " "+ y);

            if (bet_type.equals("red") && x <= 36) {
                System.out.println("Congratulations you have won. ");
                System.out.println("You currently have " + "$" + d_money);
            } else if (bet_type.equals("black") && x <= 36) {
                System.out.println("Congratulations you have won. ");
                System.out.println("You currently have " + "$" + d_money);
            } else if (bet_type.equals("low") && x >= 1 && x <= 18) {
                System.out.println("Congratulations you have won. ");
                System.out.println("You currently have " + "$" + d_money);
            } else if (bet_type.equals("high") && x >= 19 && x <= 36) {
                System.out.println("Sorry you have lost");
                System.out.println("You currently have " + "$" + amount_money);
            }
            if (bet_type.equals("red") && x > 36) {
                System.out.println("Sorry you have lost");
                System.out.println("You currently have " + "$" + amount_money);
            } else if (bet_type.equals("black") && x > 36) {
                System.out.println("Sorry you have lost");
                System.out.println("You currently have " + "$" + amount_money);
            } else if (bet_type.equals("low") && x > 18) {
                System.out.println("Sorry you have lost");
                System.out.println("You currently have " + "$" + amount_money);
            } else if (bet_type.equals("high") && x > 36) {
                System.out.println("Sorry you have lost");
                System.out.println("You currently have " + "$" + amount_money);
            }

            System.out.print("Would you like to play again? (true/false)");
            String play_again = Keyboard.nextLine();

            if (play_again.equals("true")) {
                System.out.println("Enter ");

            } else if (play_again.equals("false")) {
                System.out.println("Thank you for playing.");
                System.exit(0);

            }
        }
    }
}




