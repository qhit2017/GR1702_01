package SecondTest;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����4:10:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Third {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������10000��������");
		int n=sc.nextInt();
		if(n>10000){
			System.out.println("�������ֵ������Χ");
		}
		else if(n<=10000){
			int c=0;
			for(int i=n;i>0;i=i/10){
				c++;
			}
			System.out.println(n+"��"+c+"λ��");
		}
		sc.close();

	}

}
