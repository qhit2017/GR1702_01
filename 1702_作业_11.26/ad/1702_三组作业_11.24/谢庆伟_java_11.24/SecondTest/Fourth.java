package SecondTest;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午8:24:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Fourth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入成绩：");
		int a=sc.nextInt();
		if(a>=90&&a<=100){
			System.out.println(a+"分，评价A");
		}
		else if(a>=60&&a<90){
			System.out.println(a+"分，评价B");
		}
		else if(a>=0&&a<60){
			System.out.println(a+"分，评价C");
		}
		else{
			System.out.println("输入值超出范围！");
		}
		sc.close();

	}

}
