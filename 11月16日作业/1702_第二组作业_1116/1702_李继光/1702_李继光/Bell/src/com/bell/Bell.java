package com.bell;

public class Bell {
public static void main(String[] args) {
	double h = 100;//高度100米
	double hs= h/2;//第一次弹跳的高度
	 int i = 0;
	for(i=2;i<10;i++){
		h=h+hs*2;//第i次落地经过多少米
		hs = hs/2;//第i次反弹的高度
	}
	System.out.println("第"+i+"次落地经过"+h+"米");
	System.out.println("第"+i+"次反弹"+hs+"米");
}
}
