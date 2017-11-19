package com.zk.qhit;

//一球从100米高度自由落下，每次落地后反跳回原高度的一半；
//再落下，求它在 第10次落地时，共经过多少米？第n次反弹多高？
public class Ball {
	public static void main(String[] args) {

		double a = 100;
		double b = a / 2;
		int c = 0;
		for (c = 2; c <= 10; c++) {
			a += b * 2;
			b = b / 2;
		}
		System.out.println("第" + c + "次落地经过" + a + "米");
		System.out.println("第" + c + "反弹高度:" + b + "米");
	}
}
