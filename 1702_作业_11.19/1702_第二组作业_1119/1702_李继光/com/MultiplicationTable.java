package com;

public class MultiplicationTable {
public static void main(String[] args) {
	/**
	 * �žų˷���
	 */
	int a=1;
	do{int b=1;
		do{System.out.print(b+"x"+a+"="+b*a+"\t");
			b++;
		}while(b<=a);
		a++;
		System.out.println();
		
	}while(a<=9);
}
}
