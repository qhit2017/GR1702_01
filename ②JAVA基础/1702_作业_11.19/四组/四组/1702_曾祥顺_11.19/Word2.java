package zengxiangshun;

import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��18�� ����12:56:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����");
		double a = sc.nextDouble();
		System.out.println("������ڶ�����");
		double b = sc.nextDouble();
		if (a>b){
			System.out.println("��һ�����ڵڶ���");
		}else{
			System.out.println("�ڶ������ڵ�һ��");
		}sc.close();
	}
}
