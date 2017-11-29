package com.qi.ke;
/**制作者：陈亮亮
 *制作时间：2017年11月16日上午9:09:07
 *邮箱：2507147605@qq.com
 */
// 创建一个测试类，实例化一个警犬对象，设置警犬品种、毛的颜色、重量、
//年龄、眼睛颜色、腿的数量、最快时速，
public class PoliceDogtest {
	public static void main(String[] args) {
		
		PoliceDog  a = new  PoliceDog("大哈雷", "黑色","102", 9,"4","黑色","10")	;
		a.setPingzhong("大哈雷");
		System.out.println("警犬品种:"+a.getPingzhong());
		a.setPingzhong("黑色");
		System.out.println("毛色:"+a.getColour());
		a.setPingzhong("102");
		System.out.println("重量:"+a.getPingzhong());
		a.setPingzhong("9");
		System.out.println("年龄:"+a.getPingzhong());
		a.number=("4");
		System.out.println("腿的数量:"+a.number);
		a.eyecolor=("黑色");
		System.out.println("眼睛的颜色:"+a.eyecolor);
		a.speed=("10");
		System.out.println("最快时速:"+a.speed);
		a.eat();
		a.work();
	}
  
   
}
