package com.mr;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月16日 上午9:03:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class DescendingOrder {

	public static void main(String[] args) {
		System.out.println("六、对整数降序（从大到小）排列。\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("对多少个数进行排列呢？");
		int n=sc.nextInt();
		int r[]=new int[n];
		for(int i=0;i<=n-1;i++){
			System.out.println("请输入第"+(i+1)+"个数：");
			r[i]=sc.nextInt();
		}
		Arrays.sort(r);
		System.out.println("对这"+n+"个整数从大到小排列为：\n");
		for(int i=n-1;i>=0;i--){
			System.out.print(r[i]+"\t");
		}
		sc.close();
		

	}

}
