package com.startjava.lesson2.calculator;

public class Calculator{

	public Calculator(){}
	
	public static void Caption(){
		System.out.println("******************");
		System.out.println("Calculator");
		System.out.println("******************");
	}
	public static void EnterFirstNumber(){
		System.out.println();
		System.out.print("Enter first number: ");
	}
	public static void EnterSignMath(){
		System.out.print("Enter the sign math. operation: ");
	}
	public static void EnterSecondNumber(){
		System.out.print("Enter second number: ");
	}
	public static void EnterDoYouContinue(){
			System.out.print("Do You want continue? [yes/no]: ");
	}
}




