package com.qhit.animal;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月16日 下午8:52:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Ball {

	public static void main(String[] args) {
		// 一球从100米高度自由落下，每次落地后反跳回原高度的一半；
		// 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
		double a = 100;
		double b = 0;
		for (int i = 1; i <= 10; i++) {
			b = b + a;
			a = a / 2;
		}
		System.out.println("经过" + b + "米");
		System.out.println("反弹" + a);
	}
}
