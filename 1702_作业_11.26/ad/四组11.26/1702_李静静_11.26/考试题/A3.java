package lijingjing;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����5:59:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N>10000) {
			System.out.println("�����������");
		}else{
			if (N<10) {
				System.out.println("һλ��");
			}
			if (N<100) {
				System.out.println("��λ��");
			}
			if (N<1000) {
				System.out.println("��λ��");
			}
			if (N<10000) {
				System.out.println("��λ��");
			}else {
				System.out.println("��λ��");
			}
		}
	}
}
