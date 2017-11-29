package A;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月18日 下午1:33:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A {
	public static void main(String[] args) {
		
		System.out.println("第一题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输出:");
		int a =sc.nextInt();
		if(a>0){
			System.out.println("该数为正数");
		}else if(a<0){
			System.out.println("该数为负数");
		}else{
			System.out.println("该数不为正数，也不为负数");
		}
		System.out.println();
		
	}

}
