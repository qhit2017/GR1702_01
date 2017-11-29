package com.test;

public class Test {
	

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("金毛");
		dog.setBreed("狗类");
		dog.setColor("黄色");
		dog.setAge(3);
		System.out.println("姓名："+dog.getName());
		System.out.println("品种："+dog.getBreed());
		System.out.println("颜色："+dog.getColor());
		System.out.println("年龄："+dog.getAge());
		dog.eat();
		dog.wow();
		
		Mouse mouse = new Mouse();
		mouse.setName("杰瑞");
		mouse.setBreed("鼠类");
		mouse.setLegs(4);
		mouse.setWight(2.5);
		System.out.println("姓名："+mouse.getName());
		System.out.println("品种："+mouse.getBreed());
		System.out.println("腿个数："+mouse.getLegs());
		System.out.println("体重："+mouse.getWight());
		mouse.eat();
		mouse.wow();
	}
}
