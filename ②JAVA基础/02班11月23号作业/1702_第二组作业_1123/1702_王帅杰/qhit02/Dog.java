package qhit02;

public class Dog implements animal {
	String name;
	String breed;
	String color;
	private int age;

	// �޲εĹ��췽��
	public Dog() {
		System.out.println("����һ��������޲ι��췽��");
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String getEat() {

		return "��";
	}

	@Override
	public String getCry() {

		return "��";
	}

	public int getAge() {
		return 18;
	}

	public void setAge(int age) {
		this.age = age;

	}
}