package xiaxiaoyu;

public class Dog implements Animal{

	String name;
	String breed;
	String color;
	private int age;
	
	public Dog() {
		System.out.println("�޲ι��췽��");
	}
	
	public Dog(String name) {
		this.name = name;
	}

public String getEat() {
	// TODO Auto-generated method stub
	return "��ڳ���";
}

public String getCry() {
	// TODO Auto-generated method stub
	return "WWWWW";
	
	
}



public String getAge() {
	// TODO Auto-generated method stub
	return "4";
}
}
