package com.startjava.lesson1.calculator;

public class Calculator{
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);
		String s = args[1];

		System.out.println("Calculator");
		System.out.println("***********");
		System.out.println(a + s + b);

		if (s.equals("+")){
			a+=b;
		}
		if (s.equals("-")){
			a-=b;
		}
		if (s.equals("*")){
			a*=b;
		}
		if (s.equals("/")){
			a/=b;
		}
		if (s.equals("^")){
			a^=b;
		}
		if (s.equals("%")){
			a%=b;
		}
		System.out.println("= " + a);
	}
}
