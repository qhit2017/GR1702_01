package com.mr;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��16�� ����9:03:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class DescendingOrder {

	public static void main(String[] args) {
		System.out.println("�������������򣨴Ӵ�С�����С�\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("�Զ��ٸ������������أ�");
		int n=sc.nextInt();
		int r[]=new int[n];
		for(int i=0;i<=n-1;i++){
			System.out.println("�������"+(i+1)+"������");
			r[i]=sc.nextInt();
		}
		Arrays.sort(r);
		System.out.println("����"+n+"�������Ӵ�С����Ϊ��\n");
		for(int i=n-1;i>=0;i--){
			System.out.print(r[i]+"\t");
		}
		sc.close();
		

	}

}
