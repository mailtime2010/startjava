public class Guess{
	public static void main(String[] args){
		int x =55;
		int a = Integer.parseInt(args[0]);	
		if (x < a) { System.out.print("The number you entered is greater than what the computer.");} 
		if (x > a) { System.out.print("The number you entered is less than what the computer.");} 
		if (x == a) { System.out.print("You guessed!");}
	}
}