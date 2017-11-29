package com.qhit;

public class PoliceDogTest {
	//创建一个测试类，实例化一个警犬对象，设置警犬品种、毛的颜色、重量、年龄、眼睛颜色、腿的数量、最快时速，
    //调用它的吃的方法和work方法
public static void main(String[] args) {
	
	PoliceDog a = new PoliceDog();
	a.setVariety("萨摩耶");
	System.out.println("警犬品种为："+a.getVariety());
	a.setColour("雪白色");
	System.out.println("毛的颜色为："+a.getColour());
	a.setWeight(50.5);
	System.out.println("体重为；"+a.getWeight());
	a.setAge(3);
	System.out.println("年龄为："+a.getAge());
	a.eye="黑色";																								
	System.out.println("眼睛颜色为："+a.eye);
	a.leg=4;
	System.out.println("腿的数量为："+a.leg);
	a.speed=10.2;
	System.out.println("最快时速为："+a.speed);
	a.eat();
	a.work();
	
}
}														
