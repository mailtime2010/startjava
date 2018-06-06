package com.startjava.lesson2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        boolean check = false;
        int p1 = 0;
        int p2 = 0;
        int count = 0;
        int[] pN1 = new int[10];
        int[] pN2 = new int[10];
        Player player1 = new Player("Dodo");
        Player player2 = new Player("Dudu");
        GuessNumber play = new GuessNumber();
        System.out.println("Guess the number \"X\" ");
        System.out.println("You have 10 attempts");
        int x = new GuessNumber().Random();
        System.out.println(x);
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i <= 10 - 1; i++) {
            System.out.print(player1.getName() + ", please guess a number:");
            p1 = scanner.nextInt();
            player1.setCount(i + 1);
            pN1[i] = p1;
            check = play.guessNumb(player1, p1, x);
            if(i == 9 && check != true) {
                System.out.println(player1.getName() + "has spent the attempts");
            }
            if(check == true) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + x + " с " + player1.getCount() + " попытки");
                player2.setAllNumbers(pN2);
                System.out.print(player2.getName() + Arrays.toString(player2.getAllNumbers()));
                break;
            }
            System.out.print(player2.getName() + ", please guess a number:");
            p2 = scanner.nextInt();
            player2.setCount(i + 1);
            pN2[i] = p2;
            check = play.guessNumb(player2, p2, x);
            if(i == 9 && check != true) {
                System.out.println(player2.getName() + "has spent the attempts");
            }
            if(check == true) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + x + " с " + player2.getCount() + " попытки");
                player1.setAllNumbers(pN1);
                System.out.println(player1.getName() + Arrays.toString(player1.getAllNumbers()));
                break;
            }
        }
    }
}
