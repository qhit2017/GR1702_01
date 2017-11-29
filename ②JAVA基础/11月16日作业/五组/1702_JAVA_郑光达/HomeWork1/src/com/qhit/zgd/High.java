/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月16日 下午8:30:36 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

import java.util.Scanner;

public class High {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入多少米落下");
		double sn = sc.nextInt();
		System.out.println("请输入次数");
		double hn = sc.nextInt() / 2;
		int i = 0;
		for (i = 2; i <= 10; i++) {
			sn = sn + hn * 2;
			hn = hn / 2;
		}
		System.out.println("第" + i + "次落地" + "共经历" + sn + "米");
		System.out.println("第" + i + "次反弹" + hn);

	}
}
