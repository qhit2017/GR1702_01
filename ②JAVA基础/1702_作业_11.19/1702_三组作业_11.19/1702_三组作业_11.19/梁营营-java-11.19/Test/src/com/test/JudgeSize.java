package com.test;

import java.util.Scanner;

//��ҵ����
//���ߣ���ӪӪ��
public class JudgeSize {
public static void main(String[] args) {
	//ͨ������̨��������С�����ж�����С����С��������жϽ����
	System.out.println("������ֵ��");
	Scanner number = new Scanner(System.in);
	double a = number.nextDouble();
	System.out.println("����ĵ�һ��С���ǣ�"+a);
	double b = number.nextDouble();
	System.out.println("����ĵڶ���С���ǣ�"+b);
	if(a>b){
		System.out.println(a+">"+b);
	}else if(a<b){
		System.out.println(a+"<"+b);
	}else if(a==b){
		System.out.println(a+"="+b);
	}
	number.close();
}
}
