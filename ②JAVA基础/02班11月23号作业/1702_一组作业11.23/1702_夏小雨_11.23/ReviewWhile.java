package com.xxy;

public class ReviewWhile {
public static void main(String[] args) {
	int i =1;
	int g =0;
	while (i<=100) {
		if (i%2 !=0) {
			g=g+i;
		}
		i++;
	}
	System.out.println(g);
}
}
