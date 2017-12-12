package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年12月10日下午8:14:14
 *邮箱：2507147605@qq.com
 */
public class Sushu {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 101; i <= 200; i++) {
			boolean a = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					a = false;
					break;
				}
			}
			if (a) {
				sum++;
				System.out.println(i);
			}
		}
		System.out.println("一共有" + sum + "个素数");
	}

}
