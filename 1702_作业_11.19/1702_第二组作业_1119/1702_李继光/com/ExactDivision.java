package com;

public class ExactDivision {
public static void main(String[] args) {
	/**
	 * ��дJava������1000���ڣ����ܱ�3�������ܱ�5����
	 * ��������
	 */
	int a = 1;
	do{if(a%5==0&&a%3==0){
		System.out.println(a);
		}
		a++;
		}while(a<=1000);
}
}