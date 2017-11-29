package A;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月18日 下午1:40:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class B {
	public static void main(String[] args) {
		
		System.out.println("第二题:");
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入两个小数:");
		double a =sc.nextDouble();
		double b =sc.nextDouble();
		boolean c =true;
		if(a>b){
			System.out.println("true");
			System.out.println("a>b的判断结果为:"+c);
		}else if(a<b){
			boolean d =false;
			System.out.println("false");
			System.out.println("a<b的判断结果为:"+d);
		}
		
		System.out.println();
		
	}

}
