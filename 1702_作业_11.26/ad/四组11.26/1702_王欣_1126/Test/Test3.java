package Test;

import java.util.Scanner;
/*�����ˣ�����
 *����ʱ�䣺2017��11��26������6:08:27
 *���䣺2408368509@qq.com
 */

public class Test3 {
	public static void main(String[] args) {
		//ͨ������̨����һ������n��n������10000���жϸ������Ǽ�λ������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int n = sc.nextInt();
		if(n>10000){
			System.out.println("�����������̫���ˣ������䣺");
		}else if(n<10){
			System.out.println("��������һλ��");
		}else if(n<100){
			System.out.println("����������λ��");
		}else if(n<1000){
			System.out.println("����������λ��");
		}else if(n<10000){
			System.out.println("����������λ��");
		
		}
	}

}
