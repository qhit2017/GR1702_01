package com.zk.qhit.statictest;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月21日上午11:19:14
 *邮箱：2408368509@qq.com
 */

public class si {
	public static void main(String[] args) {
		// 一个5位数，判断它是不是回文数。即12321是回文数
		// 个位与万位相同，十位与千位相同
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int w = sc.nextInt();
		if (w / 10000 == w % 10 && w / 1000 % 10 == w / 10 % 10) {
			System.out.println(w + "是回文数");
		} else {
			System.out.println(w + "不是回文数");
		}

	}
}
