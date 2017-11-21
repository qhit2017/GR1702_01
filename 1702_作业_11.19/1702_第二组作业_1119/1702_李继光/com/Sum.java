package com;

public class Sum {
public static void main(String[] args) {
	/**
	 * 1~10之间的整数相加，得到的累加值大于20的数字
	 */
	int i =1;
	int sum = 0;
	while(i<=10){
		sum+=i;
		i++;
		if(sum>=20){
			System.out.println(sum);
			break;
		}
	}
}
}
