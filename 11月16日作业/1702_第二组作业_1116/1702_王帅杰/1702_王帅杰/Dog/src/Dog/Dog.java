package Dog;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��15�� ����8:11:27
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Dog extends Animal{
	private String breed;// Ʒ��
	private String colour;// ��ɫ
	private int age;//����
	private double weight;//����

	void eat() {
		System.out.println("ÿ�����");

	}

	void cry() {
		System.out.println("��");

	}

	void sleep() {
		System.out.println("˯��");

	}
	//get set ����

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
