package lijingjing;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����6:11:21 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class A5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y =sc.nextInt();
		int z =sc.nextInt();
		int a;
		if (x>y) {
			a=x;
			x=y;
			y=a;
		}
		if (x>z) {
			a=x;
			x=z;
			z=a;
		}
		if (y>z) {
			a=y;
			y=z;
			z=a;
		}
		System.out.println(x+"<"+y+"<"+z);
	}
}
