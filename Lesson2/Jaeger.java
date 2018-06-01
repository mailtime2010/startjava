public class Jaeger{

	private String modelName="";
	private String mark ="";
	private String origin ="";
	private float height = 0;
	private int weight =0;
	private int speed = 0;
	private int strength = 0;

	public Jaeger(String modelName, String mark,
		float height, int weight, int speed, int strength){
		this.modelName =modelName;
		this.mark =mark;
		this.height = height;
		this.weight =weight;
		this.speed = speed;
		this.strength = strength;

	}
	public void printW(){
		System.out.println("**************************************************");
		System.out.println("Name: " +modelName + " || Mark: " +mark + " ||  Speed: " +speed );
		System.out.println("Height: " +height + " ||  Weight: " +weight + " ||  Strength: " +strength);
		System.out.println("***************************************************");
		System.out.println();
	}

	public void moveUp( int x, Jaeger obj){
		if (speed !=0 && speed >0 ) {
			speed+=x;
			System.out.println(obj.modelName+ " speed up " + x+ " and is :" + speed);
		}
		else{
			System.out.println(obj.modelName+ " speed is :" + speed);
		}
	}
	public void moveDown(int x, Jaeger obj ){
		if (speed !=0 && speed >0 ) {
			speed-=x;
			System.out.println(obj.modelName+ " speed down " +x+ " and is :" + speed);
		}
		else{
			System.out.println(obj.modelName+ " speed is :" + speed);
		}
	}
	public void hit(int x, Jaeger anotherobj){
		if ( x!=0 && x >0 && anotherobj !=null) {
			strength = strength+(strength/100)*x;
			anotherobj.strength = anotherobj.strength - (anotherobj.strength/100)*x;

			System.out.println(modelName+ " hit " + anotherobj.modelName +" by: " + strength + " strength." );
			System.out.println("The strength " + anotherobj.modelName + " down and is: " + anotherobj.strength);
		}
		else{
			System.out.println("The strength of hit " +modelName+ " is weak");
		}
		System.out.println();
	}
}
