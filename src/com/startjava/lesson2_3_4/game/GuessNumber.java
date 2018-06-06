package com.startjava.lesson2_3_4.game;

import java.lang.Math;

public class GuessNumber {
    public GuessNumber() {

    }

    public int Random() {
        int x = (int) (Math.random() * 100);
        return x;
    }

    public boolean guessNumb(Player player, int number, int x) {
        boolean yes = false;
        if(x < number) { System.out.println("The number is greater than \"X\"");} else if(x > number) {
            System.out.println("The number is less than \"X\"");
        } else if(x == number) {
            System.out.println("You guessed!");
            yes = true;
        }
        return yes;
    }
}
