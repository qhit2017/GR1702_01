package com.qhit.number;

import java.util.Scanner;

/**
 * @author 作者 E-mail:1603559382@qq.com
 * @date 创建时间：2017年11月21日 下午5:34:01
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Number3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个10000以内整数");
		int a = sc.nextInt();
		for (int b = 1; b <= a; b++) {
			if (b % 7 == 0 || b % 1000 == 7 || b % 100 == 7 || b % 10 == 7) {
				System.out.println(b);
			}
		}
	}
}
