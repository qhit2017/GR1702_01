package com.zk.qhit.statictest;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��20�� ����8:01:09 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sort {

	public static void main(String[] args) {
		System.out.println("�������������򣨴�С�������С�\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("�Զ��ٸ������������أ�");
		int n=sc.nextInt();
		int r[]=new int[n];
		for(int i=0;i<=n-1;i++){
			System.out.println("�������"+(i+1)+"������");
			r[i]=sc.nextInt();
		}
		Arrays.sort(r);
		System.out.println("����"+n+"��������С��������Ϊ��\n");
		for(int i=0;i<=n-1;i++){
			System.out.print(r[i]+"\t");
		}
		sc.close();

	}

}
