/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月13日 下午9:05:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Number {

	public static void main(String[] args) {
		// 一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程找出1000以内的所有完数。
		int number = 1;
		for (int i = 1; i < 1000; i++) {
			int a = 0;
			for (int j = 1; j < i; j++)
				if (i % j == 0)
					a += j;
			if (a == i)
				System.out.print(i + "\t");

		}
	}
}
