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
		System.out.println("汪汪汪汪汪");
	}
	
	void eat() {
		System.out.println("我要吃掉整个世界");
	}
	
	void sleep() {
		System.out.println("睡觉觉，长高高");
	}

	public String gethaircolor() {
		return haircolor;
	}

	public void sethaircolor(String color) {
		this.haircolor = color;
	}

	
}
