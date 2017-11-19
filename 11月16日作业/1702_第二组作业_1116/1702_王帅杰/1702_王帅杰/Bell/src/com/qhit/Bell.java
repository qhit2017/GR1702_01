package com.qhit;

/**
 * @author 作者 E-mail:738348954@qq.com
 * @date 创建时间：2017年11月16日 上午8:10:03
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Bell {
	public static void main(String[] args) {
		double t = 200;
		double ts = t / 2;
		int i = 0;
		for (i = 2; i < 10; i++) {
			t = t + ts * 2;
			ts = ts / 2;
		}
		System.out.println("第" + i + "次落地经过" + t + "米");
		System.out.println("第" + i + "次反弹高度为：" + ts + "米");
		
	}
}
