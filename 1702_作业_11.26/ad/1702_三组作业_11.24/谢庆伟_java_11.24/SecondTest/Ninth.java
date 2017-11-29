package SecondTest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午8:51:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Ninth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个1~1000整数：");
		int a=sc.nextInt();
		int c=0;
		if(a>=1&&a<=1000){
			if(a%2==0){
				System.out.print(a+"是偶数，偶数和是：");
				for(int i=1;i<=a;i++){
					if(i%2==0){
						c=c+i;
					}
				}
			}
			else if(a%2!=0){
				System.out.print(a+"是奇数，奇数和是：");
				for(int i=1;i<=a;i++){
					if(i%2!=0){
						c=c+i;
					}
				}
			}
		}
		else{
			System.out.println("您输入的值超出范围！");
		}
		System.out.println(c);
		sc.close();
	}

}
