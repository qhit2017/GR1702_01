package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����10:04:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		int n=sc.nextInt();
		if(n>10000){
			System.out.println("������������ˣ�������");
		}else if(n<10){
			System.out.println("�����������һλ��");
		}else if(n<100){
			System.out.println("�������������λ��");
		}else if(n<1000){
			System.out.println("�������������λ��");
		}else if(n<10000){
			System.out.println("�������������λ��");
			sc.close();
		}
		
	}
}
