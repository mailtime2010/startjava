package com.startjava.lesson2.game;
import java.util.Scanner;

public class GuessNumberTest{
	public static void main(String[] args){
		boolean isNumber =false;
		boolean isExit =false;
		String check ="";
		int p1 =0;
		int p2 =0;
		Player player1 = new Player("Dodo");
		Player player2 = new Player("Dudu");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess the number \"X\" ");
		System.out.println("*****************");
		while(!isExit){
			GuessNumber gNumber = new GuessNumber();
			int x = gNumber.Random();
			System.out.println(x);
			while(!isNumber){
				System.out.print(player1.getName() + ", please guess number:");
				p1 = scanner.nextInt();
				if (x < p1) { System.out.println("The number is greater than \"X\"");} 
				if (x > p1) { System.out.println("The number is less than \"X\"");} 
				if (x == p1) { System.out.println("You guessed!");  isNumber=true; break;}
				System.out.print(player2.getName() + ", please guess number:");
				p2 = scanner.nextInt();
				if (x < p2) { System.out.println("The number is greater than \"X\"");} 
				if (x > p2) { System.out.println("The number is less than \"X\"");} 
				if (x == p2) { System.out.println("You guessed!");  isNumber=true; break;}
			}
			gNumber.EnterDoYouContinue();
			check = scanner.next();
			if (check.equals("yes")) { isNumber = false; continue;} 
			if (check.equals("no"))  { isExit = true; break;} 

			
			while (!(check.equals("yes")) || !(check.equals("no"))){
				gNumber.EnterDoYouContinue();
				check= scanner.next();
				if (check.equals("yes")) { isNumber =false; break;} 
				if (check.equals("no"))  { isExit = true; break;} 
			}
			System.out.println();
		}
	}
}