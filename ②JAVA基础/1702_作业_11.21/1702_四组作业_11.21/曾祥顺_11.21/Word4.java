package com.zk.qhit.statctest;

import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2004��1��1�� ����10:27:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a%10==a/10000&&a/10%10==a/1000%10){
			System.out.println(a+"�ǻ�������");
		}else{
			System.out.println("���ǻ�������");
		}
		sc.close();
	}
}
