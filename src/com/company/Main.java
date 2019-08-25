package com.company;

import com.sun.xml.internal.ws.util.StringUtils;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class Main {

    public static void main(String[] args) {
        // welcome message
        System.out.println("Hello, user!\nPlease answer the following series of questions:\n\n");
        // get inputs
        Scanner input = new Scanner(System.in);

        // first name
        System.out.println("What is your first name? ");
        String firstName = StringUtils.capitalize((input.nextLine()));
        // sloppy quit code
        if(toLowerCase(firstName).equals("quit")){
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }
        // last name
        System.out.println("Hello, " + firstName + ", what is your last name?");
        String lastName = StringUtils.capitalize((input.nextLine()));
        // sloppy quit code
        if(toLowerCase(lastName).equals("quit")){
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }
        // age
        System.out.println("Great! Tell me, " + firstName + " " + lastName + ", how old are you?");
        String age = input.nextLine();
//        int age = input.nextInt();
        // sloppy quit code
        if(toLowerCase(age).equals("quit")){
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }
        // birth month
        System.out.println("And in what month were you born (enter a number 1-12)?");
        String month = input.nextLine();
        // sloppy quit code
        if(toLowerCase(month).equals("quit")){
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }
        // fav color
        boolean colorMet = false;
        String color;
        do {
            System.out.println("What is your favorite ROYGBIV color (type 'help' for help)?");
            color = toLowerCase(input.next());
            switch (color) {
                case "help":
                    System.out.println("R = red\nO = orange\nY = yellow\nG = green\nB = blue\nI = indigo\nV = violet\n");
                    break;
                case "red":
                    colorMet = true;
                    break;
                case "orange":
                    colorMet = true;
                    break;
                case "yellow":
                    colorMet = true;
                    break;
                case "green":
                    colorMet = true;
                    break;
                case "blue":
                    colorMet = true;
                    break;
                case "indigo":
                    colorMet = true;
                    break;
                case "violet":
                    colorMet = true;
                    break;
                case "quit":
                    System.out.println("Nobody likes a quitter…");
                    System.exit(0);
                default:
                    System.out.println("Invalid response, please spell out a ROYGBIV color!\n");
            }
        }
        while (!colorMet);
        System.out.println("so your favorite color is " + color + ", interesting!\n");
        // siblings
        System.out.println("And finally, how many siblings to you have?");
        String siblings = input.next();
        // sloppy quit code
        if(toLowerCase(siblings).equals("quit")){
            System.out.println("Nobody likes a quitter…");
            System.exit(0);
        }

        // calculate fortune values

        // retirement
        int retirementYears;
        if(Integer.parseInt(age) > 65){
            retirementYears = 2;
        } else if (Integer.parseInt(age) < 30){
            retirementYears = 20;
        } else {
            retirementYears = 40;
        }
        // bank
        float bankBalance;
        if(Integer.parseInt(siblings) % 2 == 0){
            bankBalance = 23513151351630.52f;
        } else if (Integer.parseInt(siblings) % 3 == 0){
            bankBalance = 50.09f;
        } else {
            bankBalance = 0.05f;
        }
        // vacation
        String vacationHome = "";
        switch(color){
            case "red":
                vacationHome = "your mothers basement";
                break;
            case "orange":
                vacationHome = "Idaho, USA";
                break;
            case "yellow":
                vacationHome = "North Pole, Santa's House";
                break;
            case "green":
                vacationHome = "an unknown location";
                break;
            case "blue":
                vacationHome = "an underwater fortress";
                break;
            case "indigo":
                vacationHome = "a cardboard box under a busy bridge";
                break;
            case "violet":
                vacationHome = "Africa";
                break;
        }
        // vehicle
        String transportation;
        if(Integer.parseInt(month) <= 4 ){
            transportation = "rat-powered chariot";
        } else if (Integer.parseInt(month) >= 8){
            transportation = "an energy efficient Honda";
        } else {
            transportation = "the car of your dreams";
        }

        // present fortune
        System.out.println(firstName + " " + lastName +
                ", you will retire in " + retirementYears +" years" + " with " +
                NumberFormat.getCurrencyInstance(Locale.US).format(bankBalance) +
                " in the bank, a vacation home in " + vacationHome + ", and travel by " + transportation + ".");
    }
}
