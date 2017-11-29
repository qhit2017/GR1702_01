package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年11月23日下午7:17:46
 *邮箱：2507147605@qq.com
 */
public class Testjishu {
public static void main(String[] args) {
	// 用for 和 while两种方法计算1~100之间奇数的和
		int i=1;
		int sum=0;
		while (i<=100) {
			if(i%2!=0){
				sum+=i;
				
			}
			i++;
		}
		System.out.println(sum); 
	}
}

