package lijingjing;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����6:34:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		int sum2 =0;
		int a =sc.nextInt();
		if (a>=1000) {
			System.out.println("�����������");
		}else{
			if (a%2!=0) {
				for (int i = 0; i <=a; i++) {
					if (i%2!=0) {
						sum+=i;
					}
				}
				System.out.println(sum);
			} else {
                 for (int b = 0; b <=a; b++) {
					if (b%2==0) {
						sum2+=b;
					}
				}
                 System.out.println(sum2);
			}
		}
		
	}
}
