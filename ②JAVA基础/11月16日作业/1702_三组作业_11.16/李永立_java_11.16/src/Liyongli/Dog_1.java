package Liyongli;
/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��15�� ����8:22:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Dog_1 extends Animal_3{
	//����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ�� 
	//���䣬����  �����������С��ԡ�˯��
    //Ҫ������˽�У����ṩget��set���� 
	//����
	private String breed;
	private String color;
	private int  age;
	private String weight;
	
	//����
	
	
	
	void call(){
		System.out.println("������");
	}
	void eat(){
		System.out.println("�Թ���");
	}
	void sleep(){
		System.out.println("˯��");
	}
	//���úͻ�ȡ
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
	public int  getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}

}
