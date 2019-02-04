package com.company;

import java.util.Random;
import java.util.Scanner;

public class Roulette {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        int amount_money = 0;
        String quit= "";
        //int counter;
        do {
            System.out.println("Type of bet (red|black|even|odd|high|low)");
            String bet_type = Keyboard.nextLine();

            System.out.println("Enter amount of bet money");
            amount_money = Keyboard.nextInt();

            Random r = new Random();
            int x = 1 + r.nextInt(36);

            System.out.println("The ball landed on " + x);

            if (x % 2 == 0 && bet_type.equalsIgnoreCase("even")) {
                amount_money = amount_money * 2;
                System.out.println("Congratulations you have won.");
                System.out.println("You currently have " + "$" + amount_money);
            } else if (x % 2 != 0 && bet_type.equalsIgnoreCase("odd")) {
                amount_money = amount_money * 2;
                System.out.println("Congratulations you have won.");
                System.out.println("You currently have " + "$" + amount_money);

            } else if (x >= 1 && x <= 18 && bet_type.equalsIgnoreCase("low")) {
                amount_money = amount_money * 2;
                System.out.println("Congratulations you have won.");
                System.out.println("You currently have " + "$" + amount_money);

            } else if (x >= 19 && x <= 36 && bet_type.equalsIgnoreCase("high")) {
                amount_money = amount_money * 2;
                System.out.println("Congratulations you have won.");
                System.out.println("You currently have " + "$" + amount_money);

            } else {
                System.out.println("Sorry you have lost this bet.");
                amount_money = amount_money - amount_money;
                System.out.println("You currently have " + "$" + amount_money);
            }

            System.out.print("Would you like to play again (true|false)?");
            quit = Keyboard.next();
            Keyboard.nextLine();
        } while (quit.equalsIgnoreCase("true"));


        if (quit.equalsIgnoreCase("false"))
           System.out.println("Thank you for playing.");

        //counter ++;

           System.out.println("This is how much money you have remaining: " + "$" + amount_money);


    }
    }





