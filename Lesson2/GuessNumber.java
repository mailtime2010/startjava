import java.lang.Math;

public class GuessNumber{
	public GuessNumber(){

	}
	public int Random(){
		int x = (int) (Math.random()*100);
		return x; 
	}
		public static void EnterDoYouContinue(){
			System.out.print("Do1 You want continue? [yes/no]: ");
	}
}
	//	if (x < a) { System.out.print("The number you entered is greater than what the computer.");} 
	//	if (x > a) { System.out.print("The number you entered is less than what the computer.");} 
	//	if (x == a) { System.out.print("You guessed!");}

