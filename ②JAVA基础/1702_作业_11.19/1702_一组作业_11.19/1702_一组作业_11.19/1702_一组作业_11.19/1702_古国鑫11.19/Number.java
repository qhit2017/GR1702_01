package guguoxin;

import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��11��19�� ����7:07:43 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {

	//����һ������N��N������10000�����������7�ı����Ͱ���7������
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println("������һ��������10000����N:");
			
		int N = sc.nextInt();
			
		if(N>10000){
				
			System.out.println("�Բ�������������ֳ�����Χ��");
				
		}
		for(int a = 1;a<=N;a++){
				
			if(a/1000==7 || a/100==7 || a/10%10==7 || a%10==7 || a%7==0 ){
					
				System.out.println(a);
			}
			sc.close();
		}
			
	}
}
