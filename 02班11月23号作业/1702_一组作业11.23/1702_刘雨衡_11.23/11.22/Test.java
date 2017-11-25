package com.kyh;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("哈喇子", "哈士奇");

		System.out.println(dog.name);

		System.out.println("哈喇子是" + dog.variety);

		System.out.println("哈喇子今年" + dog.getAge() + "岁");

		dog.color = "黑白相间";
		System.out.println("哈喇子是" + dog.color);

		System.out.println("哈喇子喜欢" + dog.eat());
		;

		System.out.println("哈喇子喜欢" + dog.wow() + "这样叫");

		System.out.println();

		Mouse mouse = new Mouse("杰克", "家鼠");

		System.out.println(mouse.name);

		System.out.println("杰克是" + mouse.varivety);

		mouse.leg = 4;
		System.out.println("杰克有" + mouse.leg + "条腿");

		System.out.println("杰克重" + mouse.getWeight() + "kg");

		System.out.println("杰克" + mouse.eat());

		System.out.println("杰克是这样" + mouse.wow() + "叫");
	}

}
