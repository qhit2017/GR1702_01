package com;

public class Multiple {
public static void main(String[] args) {
	/**
	 * ��1000����8�ı���֮��
	 */
	int i =1;
	int sum = 0;
	while(i<=1000){
		if(i%8==0){
		sum=sum+i;
	}
	i++;
	}  
	System.out.println(sum);
}
}
