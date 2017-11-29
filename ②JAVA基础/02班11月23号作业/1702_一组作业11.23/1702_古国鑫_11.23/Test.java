package com.qhit.guguoxin;
/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月23日 下午7:06:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "二哈";
		System.out.println("名字:" + dog.name);
		dog.breed = "哈士奇";
		System.out.println("品种:" + dog.breed);
		dog.color = "黑白色";
		System.out.println("颜色:" + dog.color);
		System.out.println("爱吃:" + dog.getEat());
		System.out.println("叫声:" + dog.getCry());
		System.out.println("年龄:" + dog.getAge() + "\n");

		Mouse mouse = new Mouse();
		mouse.name = "小仓";
		System.out.println("名字:" + mouse.name);
		mouse.breed = "仓鼠";
		System.out.println("品种:" + mouse.breed);
		mouse.leg = 4;
		System.out.println("有" + mouse.leg + "条腿:");
		System.out.println("体重:" + mouse.getWeight() + "斤");
		System.out.println("爱吃:" + mouse.getEat());
		System.out.println("叫声:" + mouse.getCry());
	}
}
