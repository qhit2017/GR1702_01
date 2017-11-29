package com.xqw.port;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月23日 上午9:32:37 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Jsum {

	public static void main(String[] args) {
		System.out.println("五、用for 和 while两种方法计算1~100之间奇数的和\n");
		//For
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%2==1){
				sum=sum+i;
			}
		}
		System.out.println("For循环计算1~100之间奇数的和是"+sum);
		//While
		int a=1;
		sum=0;
		while(a<=100){
			if(a%2==1){
				sum=sum+a;
			}
			a++;
		}
		System.out.println("\nWhile循环计算1~100之间奇数的和是"+sum);

	}

}
