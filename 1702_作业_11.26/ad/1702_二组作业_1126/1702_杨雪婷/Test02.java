package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����9:49:13 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����һ����λ��");
		int k=sc.nextInt();
		if (k<1000&&k>100) {
			
				System.out.println("���������ʮλ����"+k/10%10);	
		}
		sc.close();
	}
}
