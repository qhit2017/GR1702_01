package com.zk.qhit;

public class Bell {
	public static void main(String[] args) {
		double h = 100;// 高度100米
		double a = h / 2;// 第一次弹跳高度
		int b = 0;
		for (b = 2; b < 10; b++) {
			h = h + a * 2;// 第b次落地经过多少米
			b = b/2;// 第b次反弹的高度

		}
		System.out.println("第" + a + "次落地经过" + h + "米");
		System.out.println("第" + a + "次反弹" + a + "米");
		
	}
}
