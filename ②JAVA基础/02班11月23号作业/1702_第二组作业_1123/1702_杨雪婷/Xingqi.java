package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��23�� ����8:00:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Xingqi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("�������֣��������ڼ�");
	int h=sc.nextInt();
	switch (h) {
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
	}sc.close();
}
}
