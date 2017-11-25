/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月23日 上午9:32:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zg;

public class Test {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.setName("哈士奇");
		dog.setVariety("二哈品种");
		dog.setColour("Black and white");
		dog.setAge(5);
		System.out.println(dog.toString());

		IAnimal.geteat();
		IAnimal.getwow();
		Mouse mouse = new Mouse();

		mouse.setName("杰瑞");
		mouse.setVariety("小白鼠");
		mouse.setLeg(4);
		mouse.setWeight("5斤");
		mouse.toString();
		System.out.println(mouse.toString());
		IAnimal.geteat();
		IAnimal.getwow();
	}

}
