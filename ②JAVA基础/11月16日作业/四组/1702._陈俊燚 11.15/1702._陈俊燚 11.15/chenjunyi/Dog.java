package chenjunyi;

public class Dog extends Animal {
	//��һ��
	// ����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ�� ���䣬����  �����������С��ԡ�˯��
	//Ҫ������˽�У����ṩget��set����
	private String breed;//Ʒ��
	private String color;//ë����ɫ
	private int age;//����
    private double weight;//����
    double quantity;//�ȵ�����
	String EyeColor;//�۾�����ɫ
	 //get��set����
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	//�����������С��ԡ�˯��
	void wow(){
		System.out.println("������");
	} 
	void eat(){
		System.out.println("��");
	}
	void sleep(){
		System.out.println("˯��");
	}
}
