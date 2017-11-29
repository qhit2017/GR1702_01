package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年11月26日下午8:48:29
 *邮箱：2507147605@qq.com
 */
public class Posting {
	//请输出0~10000之间以3开头的数封装成方法
	
		public static void main(String[] args) {
			for (int a = 0; a <10000; a++) {
				if (a/10000==0&&a/1000==3) {
					System.out.println(a);
				}
				if (a/1000==0&&a/100==3) {
					System.out.println(a);
				}
				if (a/100==0&&a/10==3) {
					System.out.println(a);
				}
				if (a/10==0&&a/1==3) {
					System.out.println(a);
				}
			}
		}
}
