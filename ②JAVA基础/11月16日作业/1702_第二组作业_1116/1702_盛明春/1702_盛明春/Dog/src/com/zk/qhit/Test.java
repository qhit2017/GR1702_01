package com.zk.qhit;

public class Test {
	public static void main(String[] args) {
		PoliceDog dog = new PoliceDog();
		dog.setAge(5);
		dog.setBreed("拉布拉多");
		dog.setWeight(20);
		dog.setColor("黑色");
		dog.eyescolor = "红色";
		dog.leg = 4;
		dog.speed = "45km/h";
		System.out.print("种类:" + dog.getBreed() + "\n" + "年龄:" + dog.getAge()
				+ "\n" + "毛的颜色:" + dog.getColor() + "\n" + "体重:"
				+ dog.getWeight() + "\n" + "眼色:" + dog.eyescolor + "\n"
				+ "腿的数量:" + dog.leg + "\n" + "最快时速:" + dog.speed + "\n");
		dog.eat();
		dog.work();
	}
}