package Guo;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Nine {
	public static void main(String[] args) {
		//ͨ������̨����һ������N(N������10000)���������7�ı����Ͱ���7�����֡�
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ�������ǣ�");
		int a=sc.nextInt();
		if(a>10000){
			System.out.println();
		}
		for (int i = 1; i <=a; i++) {
			if (i%7==0 || i%10==7 ||i%10/10==7 || i/100==7 || i/1000==7) {
				System.out.println(i);
				
			}
			
		}
	}

}
