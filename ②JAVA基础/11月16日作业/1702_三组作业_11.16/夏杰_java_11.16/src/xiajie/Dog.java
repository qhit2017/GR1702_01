package xiajie;

public class Dog extends Zoo{
	
	String kinds;
	private String haircolor;
	int age;
	String weight;
	
	
	
	

	


	public Dog(int legnumber, String eyescolor, String kinds, String haircolor, int age, String weight) {
		super(legnumber, eyescolor);
		this.kinds = kinds;
		this.haircolor = haircolor;
		this.age = age;
		this.weight = weight;
	}

	void wow() {
		System.out.println("����������");
	}
	
	void eat() {
		System.out.println("��Ҫ�Ե���������");
	}
	
	void sleep() {
		System.out.println("˯���������߸�");
	}

	public String gethaircolor() {
		return haircolor;
	}

	public void sethaircolor(String color) {
		this.haircolor = color;
	}

	
}
