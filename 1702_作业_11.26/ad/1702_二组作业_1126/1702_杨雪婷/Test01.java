package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����9:43:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��С��");
		double h=sc.nextDouble();
		System.out.println("������ڶ���С��");
		double j=sc.nextDouble();
		if (h==j) {
			System.out.println("����С�����");
		}else {
			System.out.println("����С�������");
		}
		sc.close();
	}
}
