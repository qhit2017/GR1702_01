package com.xx;
//四
public class Test {
public static void main(String[] args) {
	Dog dog = new Dog("Dragon");
	dog.breed="哈士奇";
	dog.colour="灰白";
	dog.setAge(2);
	System.out.println("它叫"+dog.name);
	System.out.println("是一只"+dog.breed);
	System.out.println(dog.colour+"色的");
	System.out.println("Dragon今年"+dog.getAge()+"岁");
	System.out.print("Dragon吃起饭来总是");
	dog.getEat();
	System.out.print("Dragon叫起来是");
	dog.getCry();
//-------------------------------------------------------
	Mouse mouse = new Mouse("Haohao","仓鼠");
	mouse.leg="4条";
	mouse.setWeight("0.5kg");
	System.out.println("我有一只小"+mouse.breed+"它叫"+mouse.name);
	System.out.println("它有"+mouse.leg+"腿，很轻，只有"+mouse.getWeight());
	mouse.getEat();
	mouse.getCry();
}
}
