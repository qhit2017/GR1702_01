package SecondTest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午8:15:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个小数：");
		double a=sc.nextDouble();
		System.out.println("请输入第二个小数：");
		double b=sc.nextDouble();
		if(a==b){
			System.out.println("这两个数相等");
		}
		else{
			System.out.println("这两个数不相等");
		}
		sc.close();

	}

}
