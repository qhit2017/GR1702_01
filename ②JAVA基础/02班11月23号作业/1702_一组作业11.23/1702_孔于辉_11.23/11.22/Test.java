package com.kyh;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("哈克", "哈士奇");

		System.out.println(dog.name);

		System.out.println("哈克是" + dog.variety);

		System.out.println("哈克今年" + dog.getAge() + "岁");

		dog.color = "黑白相间";
		System.out.println("哈克是" + dog.color);

		System.out.println("哈克喜欢" + dog.eat());
		;

		System.out.println("哈克喜欢" + dog.wow() + "这样叫");

		System.out.println();

		Mouse mouse = new Mouse("杰瑞", "家鼠");

		System.out.println(mouse.name);

		System.out.println("杰瑞是" + mouse.varivety);

		mouse.leg = 4;
		System.out.println("杰瑞有" + mouse.leg + "条腿");

		System.out.println("杰瑞重" + mouse.getWeight() + "kg");

		System.out.println("杰瑞" + mouse.eat());

		System.out.println("杰瑞是这样" + mouse.wow() + "叫");
	}

}
