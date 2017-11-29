package com.xx;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i<0||i>=1000){
			System.out.println("ÊäÈë´íÎó");
		}else{
			System.out.println(i/10%10);
		}
		sc.close();
	}
}
