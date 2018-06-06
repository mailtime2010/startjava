package com.startjava.lesson2_3_4.calculator;
public class Calculator {

	private int a;
	private int b;
	private int c;
	private char math;

	public void setA( int a){ this.a = a;}
	public void setB( int b){ this.b = b;}
	public void setMath(char math){ this.math = math;}

/*	public int getA(){ return a;}
	public int getB(){ return b;}
	public char getMath(){return math;}*/



	public void calculate(){
		switch(math){
			case '+':  System.out.println( a + b); break;
			case '-': System.out.println( a - b); break;
			case '*': System.out.println( Math.multiplyExact(a, b)); break;
			case '/': System.out.println( a / b); break;
			case '^': System.out.println( Math.pow(a, b)); break;
			case '%': System.out.println( a % b); break;
			default: System.out.print("Error");
		}
		System.out.println();

	}

	/*private void pow(){
		int result =1;
		for(int i=0; i < b ; i++)
			{ result = result * a; }
		System.out.print(result);
	}*/
}





