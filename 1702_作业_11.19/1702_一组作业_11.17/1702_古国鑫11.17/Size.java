package guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��19�� ����6:58:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Size {

		//�ӿ���̨��������С���жϣ��жϴ�С�����
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("�������һ������a��");
			
			double a =sc.nextDouble();
			
			System.out.println("������ڶ�������b��");
			double b =sc.nextDouble();
			
			if (a>b){
				
				System.out.println("a����b��a��ֵΪ��"+a);
			}
			if (a==b){
				
				System.out.println("a����b��ֵ��Ϊ��"+a);
			}
			if (a<b){
				
				System.out.println("aС��b��b��ֵΪ��"+b);
			}
			sc.close();
		}
}
