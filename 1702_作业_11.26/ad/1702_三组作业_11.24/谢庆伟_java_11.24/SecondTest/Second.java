package SecondTest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:20:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Second {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����λ����");
		int a=sc.nextInt();
		if(a>=100&&a<=999){
			System.out.println(a+"��ʮλ����"+a/10%10);
		}
		else{
			System.out.println("�������ֵ������Χ");
		}
		sc.close();

	}

}
