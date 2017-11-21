package Liyongli;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月19日 下午6:57:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number {
	public static void main(String[] args) {
		//第一题
		Scanner Sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		double i = Sc.nextDouble();
		if (i<0){
			System.out.println("该数是负数，值  为："+i);
			}
		if(i>0){
			System.out.println("该数是正数，值为"+i);
		}else{
			System.out.println("该数是非正非负，值为："+i);
		}
	
		

}
}