package FirstTest;

import java.util.Scanner;

/**
 * @author ���� E-mail:757086146@qq.com
 * @date ����ʱ�䣺2017��11��15�� ����6:32:10
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class First {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ�����֣�");
		int a=sc.nextInt();
		if(a>0){
			System.out.println(a+"������");
		}
		else if(a<0){
			System.out.println(a+"�Ǹ���");
		}else if(a==0){
			System.out.println(a+"�����Ǹ�");
		}
		sc.close();

	}
}
