package com.xx;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("������һ����");
		long s = sc.nextLong();
		int a = 0;
		if(s<0||s>10000){
			System.out.println("�������");
		}else{
			while(s>0){
				s=s/10;
				a++;
			}
			System.out.println("�����������"+a+"λ��");
		}
		sc.close();
}
}
