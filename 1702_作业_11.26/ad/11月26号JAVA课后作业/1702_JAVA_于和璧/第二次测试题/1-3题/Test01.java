package com.zk;

import java.util.Scanner;

public class Test01 {
	
	//��дJAVA����ͨ������̨��������С�����ж�����С���Ƿ���ȣ�������жϽ����
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������С��a:");
		double a = sc.nextDouble();
		System.out.println("������С��b:");
		double b = sc.nextDouble();
		
		if(a==b){
			
			System.out.println("a��b���");
			
		}else{
			
			System.out.println("a��b�����");
		}
		
		sc.close();
		
		
		
	}

}
