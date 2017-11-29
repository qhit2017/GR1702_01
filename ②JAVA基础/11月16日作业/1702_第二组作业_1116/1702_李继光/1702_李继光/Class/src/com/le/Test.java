package com.le;

public class Test {
public static void main(String[] args) {
	PoliceDog dog = new PoliceDog();
	dog.setBreed("藏獒");
	dog.setColour("黑色");
	dog.setWeight(30);
	dog.setAge(3);
	dog.eye="褐色";
	dog.leg=4;
	dog.speed="40km/h";
	System.out.println("警犬的品种为："+dog.getBreed());
	System.out.println("警犬毛的颜色："+dog.getColour());
	System.out.println("警犬的体重为："+dog.getWeight()+"kg");
	System.out.println("警犬今年"+dog.getAge()+"岁");
	System.out.println("警犬眼睛的颜色是："+dog.eye);
	System.out.println("警犬有"+dog.leg+"条");
	System.out.println("警犬的时速"+dog.speed);
	dog.eat();
	dog.work();
	
	
	
}
}
