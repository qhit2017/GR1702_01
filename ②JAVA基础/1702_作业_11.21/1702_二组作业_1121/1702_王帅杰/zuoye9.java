package zuoye;

import java.util.Scanner;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����2:08:02
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye9 {
	public static void main(String[] args) {
		System.out.println("�ھ��⣺");
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ��������10000������");
		int l =sc.nextInt();
		for (int i= 1; i <l; i++) {
		if(i%7==0 || i%10==7 || i/10%10==7 || i/100==7 || 
				i/1000==7){
			System.out.println(i);
		}
		}
		
		
		sc.close();
		
		
	}
}
