package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:15:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test09 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������1000����");
		int N=sc.nextInt();
		if (N%2==0) {
			for (int i = 0; i<=N; i++) {
				if (i%2==0) {
					sum=sum+i;
				}
			}
		}
		else {
			for (int i = 0; i<=N; i++) {
				if (i%2!=0) {
					sum=sum+i;
						
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
