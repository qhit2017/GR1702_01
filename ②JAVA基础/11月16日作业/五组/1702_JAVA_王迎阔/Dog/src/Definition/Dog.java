package Definition;

/**
 * @author ���� E-mail:1456014420@qq.com
 * @date ����ʱ�䣺2017��11��15�� ����8:24:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animals {
	private String breed;
	private String colour;
	private int age;
	private double weight;

	void wow() {
		System.out.println("������");
	}

	void eat() {
		System.out.println("�ԳԳ�");
	}

	void sleep() {
		System.out.println("˯��");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
