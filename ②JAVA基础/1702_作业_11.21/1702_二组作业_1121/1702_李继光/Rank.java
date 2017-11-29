package com;

public class Rank {
public static void main(String[] args) {
	/**
	 * 从1、2、3、4、5这五个数中任取两个数，列出所有组合
	 */
	for(int a = 1;a<=5;a++){
		for(int b =1;b<=5;b++){
			if(a!=b){
				System.out.println(a+" "+b);
			}
		}
	}
}
}
