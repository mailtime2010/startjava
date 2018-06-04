import java.util.Scanner;


public class CalculatorTest1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator1 calc = new Calculator1();
//*************************************
		System.out.println("******************");
		System.out.println("Calculator");
		System.out.println("******************");
//***********************************
		String	answer = "yes";
		while(answer.equals("yes")) {
			
			System.out.print("Enter first number: ");
			int firstNumber = scanner.nextInt();
			calc.setA(firstNumber);

			System.out.print("Enter the sign math. operation: ");
			char mathOperation = scanner.next().charAt(0);
			calc.setMath(mathOperation);

			System.out.print("Enter second number: ");
			int secondNumber = scanner.nextInt();
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


