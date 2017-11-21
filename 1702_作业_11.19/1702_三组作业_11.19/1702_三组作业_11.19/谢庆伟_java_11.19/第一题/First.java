package FirstTest;

import java.util.Scanner;

/**
 * @author 作者 E-mail:757086146@qq.com
 * @date 创建时间：2017年11月15日 下午6:32:10
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class First {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int a=sc.nextInt();
		if(a>0){
			System.out.println(a+"是正数");
		}
		else if(a<0){
			System.out.println(a+"是负数");
		}else if(a==0){
			System.out.println(a+"非正非负");
		}
		sc.close();

	}
}
