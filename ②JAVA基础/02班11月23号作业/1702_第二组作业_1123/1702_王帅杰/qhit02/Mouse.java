package qhit02;

public class Mouse implements animal {
	String name;
	String breed;
	int leg;
	private double weight;

	// �޲εĹ��췽��
	Mouse() {
		System.out.println("����һ��������޲ι��췽��");
	}

	public Mouse(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public String getEat() {

		return "����";
	}

	@Override
	public String getCry() {

		return "��";
	}

	public double getWeight() {
		return 1;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
