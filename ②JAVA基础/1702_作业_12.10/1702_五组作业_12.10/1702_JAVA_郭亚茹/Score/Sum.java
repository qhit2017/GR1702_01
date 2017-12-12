package com.Score;
/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Sum {
	public static void main(String[] args) {
		//2、编写程序求 1+3+5+7+……+99 的和值。
		int sum=0;
		for (int i = 0; i < 100; i++) {
			if (i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
