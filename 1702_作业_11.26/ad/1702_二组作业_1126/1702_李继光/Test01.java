package com.xx;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	if(a==b){
		System.out.println("������ȣ�");
	}else{
		System.out.println("���������");
	}
	sc.close();
}
}
