package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����11:02:54 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ɼ�");
		int h=sc.nextInt();
		if (h>=90) {
			System.out.println("A");
		}else if (h<89&&h>60) {
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		sc.close();
	}
}
