package Test;

import java.util.Scanner;
/*制作人：王欣
 *制作时间：2017年11月26日下午6:08:27
 *邮箱：2408368509@qq.com
 */

public class Test3 {
	public static void main(String[] args) {
		//通过控制台输入一个整数n（n不大于10000）判断该数字是几位数，并输出结果
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = sc.nextInt();
		if(n>10000){
			System.out.println("你输入的数字太大了，请重输：");
		}else if(n<10){
			System.out.println("该数字是一位数");
		}else if(n<100){
			System.out.println("该数字是两位数");
		}else if(n<1000){
			System.out.println("该数字是三位数");
		}else if(n<10000){
			System.out.println("该数字是四位数");
		
		}
	}

}
