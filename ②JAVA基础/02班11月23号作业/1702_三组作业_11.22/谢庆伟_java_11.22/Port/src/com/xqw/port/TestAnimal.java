package com.xqw.port;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:51:41 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestAnimal {

	public static void main(String[] args) {
		Dog d =new Dog();
		d.setName("����");
		d.setBreed("����Ȯ");
		d.setColor("��ɫ");
		d.setAge(5);
		d.eat();
		d.wow();
		System.out.println();
		Mouse m=new Mouse();
		m.setName("����");
		m.setBreed("����");
		m.setLegs(4);
		m.setWeight(0.3);
		m.eat();
		m.wow();

	}

}
