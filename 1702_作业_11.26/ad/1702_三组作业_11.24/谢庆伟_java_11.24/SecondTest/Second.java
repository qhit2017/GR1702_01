package SecondTest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午8:20:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int a=sc.nextInt();
		if(a>=100&&a<=999){
			System.out.println(a+"的十位数是"+a/10%10);
		}
		else{
			System.out.println("您输入的值超出范围");
		}
		sc.close();

	}

}
