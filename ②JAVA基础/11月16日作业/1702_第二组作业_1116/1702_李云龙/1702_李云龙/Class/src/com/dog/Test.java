package com.dog;

public class Test {
	public static void main(String[] args) {
		Policedog a = new Policedog();
		a.setBreed("德国牧羊犬");
		a.setColour("黑色");
		a.setWeight(20);
		a.setAge(4);
		a.setColour("黑色");
		a.leg = 4;
		a.speed = "40km/h";
		System.out.println("警犬品种为：" + a.getBreed());
		System.out.println("警犬毛的颜色:" + a.getColour());
		System.out.println("警犬重量为:" + a.getWeight() + "kg");
		System.out.println("警犬年龄为：" + a.getAge() + "岁");
		System.out.println("警犬眼睛颜色为：" + a.getColour());
		System.out.println("警犬腿的数量为：" + a.leg + "条");
		System.out.println("警犬最快时速为：" + a.speed);
		a.eat();
		a.work();

	}
}
