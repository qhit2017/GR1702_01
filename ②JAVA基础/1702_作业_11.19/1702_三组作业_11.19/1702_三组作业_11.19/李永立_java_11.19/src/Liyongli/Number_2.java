package Liyongli;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月20日 下午3:57:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number_2 {
	//第九题
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个不大于10000的数：");
		int w = sc.nextInt();
		if(w>10000){
			System.out.println("输入有误，请重新输入");
		}
	     if(w%7==0||1000==7||100==7||10%10==7||w%10==7 ){
			System.out.println(w);
		}

	}

}
