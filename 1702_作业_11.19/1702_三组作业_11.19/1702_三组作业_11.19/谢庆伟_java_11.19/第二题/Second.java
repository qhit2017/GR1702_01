package FirstTest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��15�� ����6:33:28 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��С����");
		double a=sc.nextDouble();
		System.out.println("������ڶ���С����");
		double b=sc.nextDouble();
		if(a>b){
			System.out.println(a+"����"+b);
		}
		else if(a<b){
			System.out.println(a+"С��"+b);
		}
		else if(a==b){
			System.out.println(a+"����"+b);
		}
		sc.close();

	}

}
