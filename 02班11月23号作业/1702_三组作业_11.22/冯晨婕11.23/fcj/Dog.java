/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺23 Nov 2017 9:27:11 Ekuseni
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
public class   Dog implements Animal {
//Ҫ�󹷾��е����԰�����������Ʒ�֡���ɫ�����䣨����˽�У� ��
	   //���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�����Ĺ��췽����
	 private  String name;
	 private String breed;
	 private String color;
	 private int age;
	 
	 public Dog() {
			super();
		}

		public Dog(String name    ) {
			super();
			this.name = name;
			 
		}

	 
	public String getEat() {
		// TODO Auto-generated method stub
		return "�Թ���";
	}

	 
	public String getCall() {
		// TODO Auto-generated method stub
		return  "������";
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	 
	
	
	
}
