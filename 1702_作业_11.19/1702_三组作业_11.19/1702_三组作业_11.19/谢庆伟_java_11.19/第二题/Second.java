package FirstTest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午6:33:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个小数：");
		double a=sc.nextDouble();
		System.out.println("请输入第二个小数：");
		double b=sc.nextDouble();
		if(a>b){
			System.out.println(a+"大于"+b);
		}
		else if(a<b){
			System.out.println(a+"小于"+b);
		}
		else if(a==b){
			System.out.println(a+"等于"+b);
		}
		sc.close();

	}

}
