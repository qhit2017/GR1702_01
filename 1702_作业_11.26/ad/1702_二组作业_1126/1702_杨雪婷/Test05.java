package yangxueting;

import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��11��25�� ����11:11:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һλ��");
		int x=sc.nextInt();
		System.out.println("������ڶ�λ��");
		int y=sc.nextInt();
		System.out.println("���������λ��");
		int z=sc.nextInt();
		int l=0;
		if (x>y) {
			l=x;x=y;y=l;
		}else if (x>z) {
			l=x;x=z;z=l;
		}else if (y>z) {
			l=y;y=z;z=l;
		}
		System.out.println("��С���������"+x+"<"+y+"<"+z);
		sc.close();
	}
}
