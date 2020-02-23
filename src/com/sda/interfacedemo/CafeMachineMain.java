package com.sda.interfacedemo;

import java.util.Scanner;

public class CafeMachineMain {

    static CafeMachine cafeMachine = new TchiboCafeMachine();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        //pokazanie menu
        showMenu();

        //wybranie kawy
        int userInput = getUserInput();
        Cafe[] cafes = cafeMachine.showMenu();
        Cafe chosenCafe = cafes[userInput];
        cafeMachine.chooseCafe(chosenCafe);

        //pobranie kwoty od użytkownika
        double userMoneyInput = getUserMoney();
        cafeMachine.makeCafe(userMoneyInput, chosenCafe);

    }

    private static void showMenu(){
        System.out.println("Dzień dobry. Wybierz kawę...");

        Cafe[] cafes = cafeMachine.showMenu();

        for (int i = 0; i < cafes.length; i++) {
            System.out.println(i + ":" + cafes[i].getName());
        }
    }

    private static int getUserInput(){
        return scanner.nextInt();
    }

    private static double getUserMoney(){
        return scanner.nextDouble();
    }

}
