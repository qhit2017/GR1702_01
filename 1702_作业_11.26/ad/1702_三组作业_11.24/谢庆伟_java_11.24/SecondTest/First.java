package SecondTest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:15:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��С����");
		double a=sc.nextDouble();
		System.out.println("������ڶ���С����");
		double b=sc.nextDouble();
		if(a==b){
			System.out.println("�����������");
		}
		else{
			System.out.println("�������������");
		}
		sc.close();

	}

}
