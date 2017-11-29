package com.zk;

public class Test {
	//d.创建测试类，分别创建狗和老鼠的实例化对象，给对象的属性赋值，并且调用对象的吃、叫的方法
	public static void main(String[] args) {
	
		Dog dog = new Dog();
		dog.setName("小白");
		dog.setVariety("萨摩耶");
		dog.setColour("白色");
		dog.setAge(3);
		
		System.out.println("名字叫："+dog.getName()+"\n"+"品种为："
							+dog.getVariety()+"\n"+"毛色为："
							+dog.getColour()+"\n"+"年龄为："+dog.getAge()+"岁");
		
		System.out.println(dog.getWow());
		
		System.out.println(dog.getEat());
		
		System.out.println();
		
		Mouse mouse = new Mouse();
		mouse.setName("小黑");
		mouse.setVariety("米老鼠");
		mouse.setLeg(2);
		mouse.setWeight(23.5);
		
		System.out.println("名字叫："+mouse.getName()+"\n"+"品种为："
							+mouse.getVariety()+"\n"+"腿的数量为："
							+mouse.getLeg()+"\n"+"体重为："+mouse.getWeight()+"斤！");
		
		System.out.println(mouse.getEat());
		
		System.out.println(mouse.getWow());
}
}
