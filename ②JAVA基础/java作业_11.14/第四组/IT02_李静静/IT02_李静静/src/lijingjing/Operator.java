package lijingjing;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��14�� ����5:40:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Operator {

	public static void main(String[] args) {
		/*������Ԫ�����������Ƕ�׻�ѡ��ṹ����ɴ��⣺
		 * ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮���
		 * ��B��ʾ��60�����µ���C��ʾ��
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ����");
		int score =sc.nextInt();
		if(score>=90){
			System.out.println("A");
		}
		if(score<=89&&score>=60){
			System.out.println("B");
		}
		if(score<=60){
			System.out.println("C");
		}
		
		
	}
}
