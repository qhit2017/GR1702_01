
public class Dog  extends Animal{
	String breed;
	String colour;
	private double age;
	double weight;
	

	
	
	
	

	void howl() {
		System.out.println("������!");
	}

	void eat() {
		System.out.println("�⣬��ͷ");
	}

	void sleep() {
		System.out.println("˯");

	}
	

	void setAge(double age) {

		System.out.println("����!");
        this.age = age;
	}
     double getAge() {
		return age;

	}
}
