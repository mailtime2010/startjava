package com.startjava.lesson2.calculator;

import java.util.Scanner;


public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
//*************************************
		System.out.println("******************");
		System.out.println("Calculator");
		System.out.println("******************");
//***********************************
		String	answer = "yes";
		while(answer.equals("yes")) {
			
			System.out.print("Enter math expression :");
			String enters = scanner.nextLine();
			String[] e= enters.split(" ");
			int firstNumber = Integer.parseInt(e[0]);
			calc.setA(firstNumber);
			char mathOperation = e[1].charAt(0);
			calc.setMath(mathOperation);
			int secondNumber = Integer.parseInt(e[2]);
			calc.setB(secondNumber);

			calc.calculate();

			do{
				System.out.print("Do You want continue? [yes/no]: ");
				answer = scanner.next();
			}
			while(!answer.equals("yes") && !answer.equals("no"));

			System.out.println();
		}
	}
}


