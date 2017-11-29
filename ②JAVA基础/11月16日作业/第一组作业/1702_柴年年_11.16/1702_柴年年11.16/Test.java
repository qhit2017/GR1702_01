package com.qhit.animal;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月15日 下午8:52:31
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	// 创建一个测试类，实例化一个警犬对象，
	// 设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速
	public static void main(String[] args) {
		Policedog io = new Policedog(4, "棕色", "警犬", "灰色", 26, "58公斤", "120/h");
		System.out.println("品种:" + io.getBreed());
		System.out.println("毛的颜色:" + io.colour);
		System.out.println("重量:" + io.weight);
		System.out.println("年龄:" + io.age);
		System.out.println("眼睛颜色:" + io.eyecolor);
		System.out.println("腿的数量:" + io.legcount);
		System.out.println("最快时速:" + io.speed);
		io.cry();
		io.eat();
		io.sleep();
		io.work();

	}
}
