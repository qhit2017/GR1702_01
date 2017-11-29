package Liyongli;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月19日 下午7:13:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Small_number {
	public static void main(String[] args) {
		//第二题
		Scanner Sc =new Scanner(System.in);
		System.out.println("请输入第一个小数：");
		double a = Sc.nextDouble();
		System.out.println("请输入第二个小数：");
		double b = Sc.nextDouble();
		if (a<b){
			System.out.println("第一个小数小，值为："+a);
			System.out.println("第二个小数大，值为："+b);
			 
		}
		if(a>b){
			System.out.println("第一个小数大，值为："+a);
			System.out.println("第二个小数小，值为："+b);
		}
	}

}
