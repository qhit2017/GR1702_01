/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺15 Nov 2017 8:17:09 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Dog extends Animal {
//����һ���ࣺ�������԰����� Ʒ�֣�ë����ɫ�� ���䣬����  �����������С��ԡ�˯��
    //Ҫ������˽�У����ṩget��set����
	private String breed;
	private String color;
	private int age;
	private double weigth;
	Dog(){
	System.out.println("�����޲ε�");
}
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
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	 //����
	void call (){
	System.out.println("������");
	}
	void eat (){
		System.out.println("�ԳԳԣ��Թ���");
	}
	void sleep(){
		System.out.println("˯˯˯�� ��");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
