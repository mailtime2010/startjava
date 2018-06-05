package com.startjava.lesson2.game;
import java.lang.Math;

public class GuessNumber{
	public GuessNumber(){

	}
	public int Random(){
		int x = (int) (Math.random()*100);
		return x; 
	}
		public static void EnterDoYouContinue(){
			System.out.print("Do You want continue? [yes/no]: ");
	}
}
