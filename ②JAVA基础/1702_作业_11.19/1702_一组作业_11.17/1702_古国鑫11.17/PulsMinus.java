package guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��19�� ����6:59:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PulsMinus {

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
