package xiaxiaoyu;

public class Dog implements Animal{

	String name;
	String breed;
	String color;
	private int age;
	
	public Dog() {
		System.out.println("无参构造方法");
	}
	
	public Dog(String name) {
		this.name = name;
	}

public String getEat() {
	// TODO Auto-generated method stub
	return "大口吃肉";
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
