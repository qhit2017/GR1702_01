package xiajie;

public class PoliceDog extends Dog{

	String speed ;
	
	




	public PoliceDog(int legnumber, String eyescolor, String kinds, String haircolor, int age, String weight,
			String speed) {
		super(legnumber, eyescolor, kinds, haircolor, age, weight);
		this.speed = speed;
	}


	void work() {
		System.out.println("坏人统统滚出来的干活！");
	}
	}
