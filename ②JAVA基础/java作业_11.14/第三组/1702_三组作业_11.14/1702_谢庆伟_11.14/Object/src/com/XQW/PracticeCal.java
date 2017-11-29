package com.XQW;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月13日 下午9:31:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PracticeCal {

	public static void main(String[] args) {
		System.out.println("四、找“完数”。\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入最小范围：");
		int a = sc.nextInt();
		System.out.println("请输入最大范围：");
		int b = sc.nextInt();
		System.out.println(a + "~" + b + "之间的完数有：\n");
		int n = 0;
		for (int i = a; i <= b; i++) {
			int sum=0;
			for (int j=1 ; j < i; j++) {
				if (i % j == 0) {
					sum=sum+j;
				}
			}
			if(sum==i){
				System.out.print(i+"    ");
				n = n + 1;
			}
			if (n >= 15) {
				n = 0;
				System.out.println("\n");
			}
		}
		sc.close();

	}

}
