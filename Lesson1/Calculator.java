public class Calculator{
	public static void main(String[] args) {
		int a = 5, b =3;
		String s =" % ";

		System.out.println("Calculator");
		System.out.println("***********");
		System.out.println(a + s + b);
		if (s.equals(" + ")){
			a+=b;
			System.out.println("= " + a);
		}
		if (s.equals(" - ")){
			a-=b;
			System.out.print(" = " + a);
		}
		if (s.equals(" * ")){
			a*=b;
			System.out.print(" = " + a);
		}
		if (s.equals(" / ")){
			a/=b;
			System.out.print(" = " + a);
		}
		if (s.equals(" ^ ")){
			a^=b;
			System.out.print(" = " + a);
		}
		if (s.equals(" % ")){
			a%=b;
			System.out.print(" = " + a);
		}

	}
}
