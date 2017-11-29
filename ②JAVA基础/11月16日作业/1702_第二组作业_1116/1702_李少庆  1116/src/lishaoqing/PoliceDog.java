package lishaoqing;

public class PoliceDog extends Dog{

	
	String speed;
	

	
	public PoliceDog(int leg, String eyecolour, String breed, String colour,
			int age, String weight, String speed) {
		super(leg, eyecolour, breed, colour, age, weight);
		this.speed = speed;
	}

	
	void work(){
		System.out.println("°ïÖú¾¯²ì£¬×¥×¡×ï·¸");
	}

	
	
}
