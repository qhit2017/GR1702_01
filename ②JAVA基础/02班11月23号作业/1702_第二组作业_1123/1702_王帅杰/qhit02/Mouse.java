package qhit02;

public class Mouse implements animal {
	String name;
	String breed;
	int leg;
	private double weight;

	// 无参的构造方法
	Mouse() {
		System.out.println("我是一个鼠类的无参构造方法");
	}

	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String getEat() {

		return "大米";
	}

	@Override
	public String getCry() {

		return "唧";
	}

	public double getWeight() {
		return 1;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
