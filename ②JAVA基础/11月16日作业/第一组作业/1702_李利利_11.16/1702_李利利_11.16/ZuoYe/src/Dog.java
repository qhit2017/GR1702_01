
public class Dog  extends Animal{
	String breed;
	String colour;
	private double age;
	double weight;
	

	
	
	
	

	void howl() {
		System.out.println("ÍôÍôÍô!");
	}

	void eat() {
		System.out.println("Èâ£¬¹ÇÍ·");
	}

	void sleep() {
		System.out.println("Ë¯");

	}
	

	void setAge(double age) {

		System.out.println("ÄêÁä!");
        this.age = age;
	}
     double getAge() {
		return age;

	}
}
