package Liyongli;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��19�� ����6:57:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Number {
	public static void main(String[] args) {
		//��һ��
		Scanner Sc = new Scanner(System.in);
		System.out.println("������һ������");
		double i = Sc.nextDouble();
		if (i<0){
			System.out.println("�����Ǹ�����ֵ  Ϊ��"+i);
			}
		if(i>0){
			System.out.println("������������ֵΪ"+i);
		}else{
			System.out.println("�����Ƿ����Ǹ���ֵΪ��"+i);
		}
	
		

}
}