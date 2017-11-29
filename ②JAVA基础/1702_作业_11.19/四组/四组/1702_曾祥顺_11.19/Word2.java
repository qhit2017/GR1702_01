package zengxiangshun;

import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月18日 下午12:56:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		double a = sc.nextDouble();
		System.out.println("请输入第二个数");
		double b = sc.nextDouble();
		if (a>b){
			System.out.println("第一个大于第二个");
		}else{
			System.out.println("第二个大于第一个");
		}sc.close();
	}
}
