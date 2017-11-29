/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月15日 下午8:37:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Test {

	public static void main(String[] args) {

		PoliceDog a = new PoliceDog("哈士奇", "black", 8, "22公斤",
				"每小时22公里", 4,"blue");
		// 设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
		a.setPingZhong("哈士奇");
		System.out.println("种类：" + a.getPingZhong());
		a.YanJingcolor = "black";
		System.out.println("眼睛的颜色" + a.YanJingcolor);
		a.setTiZhong("22公斤");
		System.out.println("体重：" + a.getTiZhong());
		a.setAge(8);
		System.out.println(a.getAge());
		a.setColor("blue");
		System.out.println(a.getColor());
		a.number = 4;
		System.out.println(a.number);
		System.out.println(a.Speedperhour);

		a.eat();

		a.work();

	}

}
