package com.we;

public class Sum {
public static void main(String[] args) {
	System.out.println("for—≠ª∑");
	int sum1 = 0;
	for(int i = 1;i<=100;i+=2){
		sum1 += i;
	}
	System.out.println(sum1);
	//---------------------------------
	System.out.println("while—≠ª∑");
	int	a = 1;
	int sum2 = 0;
	while(a<=100){
		sum2 +=a;
		a+=2;
	}
	System.out.println(sum2);
}
}
