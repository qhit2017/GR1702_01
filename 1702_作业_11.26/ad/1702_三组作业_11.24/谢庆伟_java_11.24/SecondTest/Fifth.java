package SecondTest;

import java.util.Arrays;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:30:53 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Fifth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������");
		int x=sc.nextInt();
		System.out.println("������ڶ�������");
		int y=sc.nextInt();
		System.out.println("���������������");
		int z=sc.nextInt();
		int a[]={x,y,z};
		Arrays.sort(a);
		System.out.println("��С����Ϊ��");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		sc.close();

	}

}
