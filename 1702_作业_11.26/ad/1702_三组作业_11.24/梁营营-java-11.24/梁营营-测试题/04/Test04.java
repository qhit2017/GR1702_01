package com.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
	char A = 'A';
	char B = 'B';
	char C = 'C';
	Scanner sc = new Scanner(System.in);
    System.out.println("ÇëÊäÈëÑ§Ï°³É¼¨£º");
    int i = sc.nextInt();
    if(i>=90){
    	System.out.println(A);
    }if((i>=60)&&(i<=89)){
    	System.out.println(B);
    }if(i<=60){
    	System.out.println(C);
    }sc.close();
	}

}
