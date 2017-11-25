package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年11月23日下午6:50:12
 *邮箱：2507147605@qq.com
 */
public class Jishu {
public static void main(String[] args) {
	//5 用for 和 while两种方法计算1~100之间奇数的和
	int sum=0;
	for(int i=1;i<=100;i++){
		if(i%2==1){
		sum+=i;
		}
	}
	System.out.println(sum);
}
}
