package com.qhit.Animal;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月23日 上午8:35:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "狗";
		System.out.println("名字:" + dog.name);
		dog.breed = "家犬";
		System.out.println("品种:" + dog.breed);
		dog.color = "灰色";
		System.out.println("颜色:" + dog.color);
		System.out.println("吃:" + dog.getEat());
		System.out.println("叫:" + dog.getCry());
		System.out.println("年龄:" + dog.getAge());

		Mouse mouse = new Mouse();
		mouse.name = "鼠";
		System.out.println("名字:" + mouse.name);
		mouse.breed = "耗子";
		System.out.println("品种:" + mouse.breed);
		mouse.leg = 4;
		System.out.println("几条腿:" + mouse.leg);
		System.out.println("体重:" + mouse.getWeight());
		System.out.println("吃:" + mouse.getEat());
		System.out.println("叫:" + mouse.getCry());
	}
}
