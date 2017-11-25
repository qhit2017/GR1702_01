package com.lyl;

 

public class Test {
	//.创建测试类，分别创建狗和老鼠的实例化对象，给对象的属性赋值
	//，并且调用对象的吃、叫的方法
 public static void main(String[] args) {
	 Dog dog = new Dog();
	 dog.setName("豆豆");
	 dog.setBreed("马犬");
	 dog.setColor("黄色");
	 dog.setAge(2);
	 System.out.println(dog.getEat());
	 System.out.println(dog.getCall());
	 
	 
	 //实例化MOUSE 对象
	 Mouse mouse = new Mouse();
	 
	 mouse.setName("小可爱");
	 mouse.setBreed("仓鼠");
	 mouse.setLeg(4);
	 mouse.setWeight(50.5);
	 
	 System.out.println(mouse.getEat());
	 System.out.println(mouse.getCall());
	 
	 
}
}
