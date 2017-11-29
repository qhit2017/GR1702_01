package com.zk.qhit.statictest;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月20日 下午8:01:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sort {

	public static void main(String[] args) {
		System.out.println("三、对整数升序（从小到大）排列。\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("对多少个数进行排列呢？");
		int n=sc.nextInt();
		int r[]=new int[n];
		for(int i=0;i<=n-1;i++){
			System.out.println("请输入第"+(i+1)+"个数：");
			r[i]=sc.nextInt();
		}
		Arrays.sort(r);
		System.out.println("对这"+n+"个整数从小到大排列为：\n");
		for(int i=0;i<=n-1;i++){
			System.out.print(r[i]+"\t");
		}
		sc.close();

	}

}
