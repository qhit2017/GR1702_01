package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年12月10日下午8:08:58
 *邮箱：2507147605@qq.com
 */
public class Staff1 {

	public static void main(String[] args) {
//编写程序求 1+3+5+7+……+99 的和值。
		int sum =0;
		for (int i = 0; i <100; i++) {
			if (i% 2!=0) {
				sum +=i;
			}
			
		}
System.out.println(sum);
	}

}
