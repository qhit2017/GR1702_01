/*1  ����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ��
 *  ���䣬����  �����������С��ԡ�˯��
 *       Ҫ������˽�У����ṩget��set���� 
 * * */
	//����һ���ࣺ��
public class Dog extends Animal{
	//���԰���
	private String breed;
	private String color;
	private int age;
	private double weight;
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
		System.out.println("��");
	}
	void eat(){
		System.out.println("�ҽ��������๷����");
	}
	void seleep(){
		System.out.println("˯��");
	}
}
