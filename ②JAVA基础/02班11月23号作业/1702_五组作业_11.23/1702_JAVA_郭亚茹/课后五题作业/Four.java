package work;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:2379675496@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Four {
	public static void main(String[] args) {
		//�Ӽ�������1~7�����֣����������1�����������һ�����������2����������ڶ�........���������7,�����������(��switch)
		Scanner sc=new Scanner(System.in);
		System.out.println("������");
		int a=sc.nextInt();
		System.out.println("����������ǣ�"+a);
		switch (a) {
		case 1:
			System.out.println("����һ");
			break;

		case 2:
			System.out.println("���ڶ�");
			break;
			
		case 3:
			System.out.println("������");
			break;
			
		case 4:
			System.out.println("������");
			break;
			
		case 5:
			System.out.println("������");
			break;
			
		case 6:
			System.out.println("������");
			break;
			
		case 7:
			System.out.println("������");
			break;
		default:
			break;
		}
		
	}

}
