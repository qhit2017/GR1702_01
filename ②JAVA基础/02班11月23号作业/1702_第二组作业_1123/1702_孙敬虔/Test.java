package com.zk.sjq;
/** 
 * @author  ���� E-mail:chenglong793708@547.com
 * @date    ����ʱ�䣺2017��11��23�� ����7:13:15 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("���");
		System.out.println(dog.name);
		dog.breed = "����";
		System.out.println("Ʒ�֣�"+dog.breed);
		dog.color="��ɫ";
		System.out.println(dog.color);
		dog.setAge(2);
		System.out.println(dog.getAge());
		dog.getEat();
		dog.getCry();
		
		Mouse mouse = new Mouse();
		mouse.name = "��";
		System.out.println("���֣�"+mouse.name);
		mouse.breed = "����";
		System.out.println("Ʒ�֣�"+mouse.breed);
		mouse.legs = 4;
		System.out.println("������"+mouse.legs);
	    mouse.getEat();
	    mouse.getCry();
		System.out.println("���أ�"+mouse.getWeight());
		
		
		
	}

}
