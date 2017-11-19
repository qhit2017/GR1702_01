package com.mr;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午9:34:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class BallDown {

	public static void main(String[] args) {
		System.out.println("五、一球从h米高度自由落下，每次落地后反跳回原高度的一半；\n"
				+ "再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入h的值：（整数范围）");
		int h=sc.nextInt();
		System.out.println("请输入n的值：（整数范围）");
		int n=sc.nextInt();
		double len=h;
		double hei=h/2;
		int i=2;
		while(i<=n&&n>1){
			len=len+hei*2;
			hei=hei/2;
			i++;
		}
		System.out.println("球体从"+h+"米落下，\n"
				+ "第"+n+"次落地时，共经过"+len+"米，\n"
				+ "第"+n+"次反弹高度为"+hei+"米。");
		sc.close();

	}

}
