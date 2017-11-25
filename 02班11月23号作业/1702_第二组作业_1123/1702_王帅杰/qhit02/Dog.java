package qhit02;

public class Dog implements animal {
	String name;
	String breed;
	String color;
	private int age;

	// 无参的构造方法
	public Dog() {
		System.out.println("我是一个狗类的无参构造方法");
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String getEat() {

		return "肉";
	}

	@Override
	public String getCry() {

		return "汪";
	}

	public int getAge() {
		return 18;
	}

	public void setAge(int age) {
		this.age = age;

	}
}