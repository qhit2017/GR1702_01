package SecondTest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午4:10:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Third {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个不大于10000的整数：");
		int n=sc.nextInt();
		if(n>10000){
			System.out.println("您输入的值超出范围");
		}
		else if(n<=10000){
			int c=0;
			for(int i=n;i>0;i=i/10){
				c++;
			}
			System.out.println(n+"是"+c+"位数");
		}
		sc.close();

	}

}
