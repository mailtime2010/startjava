import java.util.Scanner;

public class CalculatorTest{
	public static void main(String[] args) {
		int a = 0, b = 0;
		String s ="",	check ="";
		boolean isExit = false;
//*************************************
		Calculator calculator = new Calculator();
		calculator.Caption();
//**************************************
		while(!isExit){
			Scanner scanner = new Scanner(System.in);
			calculator.EnterFirstNumber();
			a = scanner.nextInt();
			calculator.EnterSignMath();
			s = scanner.next();
			calculator.EnterSecondNumber();
			b = scanner.nextInt();
			System.out.println();

			switch(s){
				case "+": a+=b;break;
				case "-": a-=b;break;
				case "*": a*=b;break;
				case "/": a/=b;break;
				case "^": a^=b;break;
				case "%": a%=b;break;
				default: return;
			}
			System.out.println( a +" "+ s+" "+ b+" = "+ a);
			System.out.println();

			calculator.EnterDoYouContinue();
			check = scanner.next();
			if (check.equals("yes")) { continue;} 
			if (check.equals("no"))  { break;} 

			
			while (!(check.equals("yes")) || !(check.equals("no"))){
			calculator.EnterDoYouContinue();
				check= scanner.next();
				if (check.equals("yes")) { break;} 
				if (check.equals("no"))  { isExit = true; break;} 
			}
			System.out.println();
		}
	}
}

