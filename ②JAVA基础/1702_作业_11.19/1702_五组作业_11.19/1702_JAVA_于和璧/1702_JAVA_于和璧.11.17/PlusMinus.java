package YuHeBi;

import java.util.Scanner;

/** 
 * @author  ���� �ں��
 * @date    ����ʱ�䣺2017��11��17�� ����9:20:20 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PlusMinus {
	//ͨ������̨����һ�����֣��жϸ��������������Ǹ���������������
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ������a:");
		
		int a = sc.nextInt();
		
		if (a<0){
			
			System.out.println("����Ϊ������"+a);
		}
		if (a==0){
			
			System.out.println("�����Ǹ�������"+a);
		}
		if (a>0){
			
			System.out.println("����Ϊ������"+a);
		}
		sc.close();
	}

}
